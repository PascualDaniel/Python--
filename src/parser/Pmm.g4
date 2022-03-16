grammar Pmm;	
@header{
import ast.*;
import ast.Expressions.*;
import ast.Statements.*;
import ast.Definitions.*;
import ast.Types.*;
import java.util.ArrayList;
import java.util.LinkedList;
}
//program returns [Program ast]: (variable_definition|function_definition)*main ;
program  returns [Program ast]: {List<Definition> definiciones= new LinkedList<Definition>();}
                                                (
                                                var1   = variable_definition {definiciones.addAll($var1.ast);}
                                               |func1  = function_definition {definiciones.add($func1.ast );}
                                                )*
                                                main {definiciones.add($main.ast  );}
                                                 {$ast = new Program(definiciones);}
                                                 ;


//--------Function definition------------------------------------------------------------------
//devuelve definiciones
parameters returns[List<VarDefinition> ast= new LinkedList<VarDefinition>()]:(ID':'simple_type
                   {$ast.add(new VarDefinition($ID.getLine(),$ID.getCharPositionInLine()+1,$ID.text,$simple_type.ast));})
                   |(ID':'simple_type {$ast.add(new VarDefinition($ID.getLine(),$ID.getCharPositionInLine()+1,$ID.text,$simple_type.ast));}
                   ','parameters
                   {$ast.addAll($parameters.ast);}
                   );
//hay que crear el tipo definicion
function_definition returns  [Definition ast]:  'def' id1=ID '('
                                     {List<VarDefinition> list = new ArrayList<VarDefinition>();}
                                     (p1=parameters{list.addAll($p1.ast);})?
                                     ')'':'simple_type? '{'
                                     {List<Definition> list2 = new ArrayList<Definition>();}
                                     (v1=variable_definition{list2.addAll($v1.ast);} )*
                                     {List<Statement> list3 = new ArrayList<Statement>();}
                                      (s1=statement{list3.add($s1.ast);})* '}'
                                     {$ast = new FunctionDefinition(
                                     $id1.getLine(),
                                     $id1.getCharPositionInLine()+1,
                                     $id1.text,
                                        new FunctionType(($ctx.simple_type != null ? $simple_type.ast : new VoidType()),
                                        list),
                                        list2,list3);}
                                      ;


main returns [Definition ast]:'def''main''('')'':' '{'
                                        {List<Definition> definiciones= new LinkedList<Definition>();
                                        }
                                        (var1  = variable_definition    {definiciones.addAll($var1.ast  );})*
                                        {List<Statement> sentencias = new LinkedList<Statement>();}
                                        ( statement  {sentencias.add($statement.ast);} )*
                                        {$ast = new FunctionDefinition(
                                                    $start.getLine(),
                                                    $start.getCharPositionInLine()+1,
                                                    "main",
                                                    new FunctionType(
                                                                     new VoidType(),
                                                                     new ArrayList<VarDefinition>()),
                                                    definiciones,
                                                    sentencias
                                                    );}
                                        '}' EOF ;
//--------Variable definition------------------------------------------------------------------
//Todo esta wea
variable_definition returns [List<Definition> ast]: {$ast = new ArrayList<Definition>();}
    {List<String> ids = new ArrayList<String>();}
    id1=ID{ids.add($id1.text);}
    (','id2= ID {if(ids.contains($id2.text))
                    new ErrorType($id2.getLine(),$id2.getCharPositionInLine()+1,"Variable Repetida");
                 else
                    ids.add($id2.text);
                 }
    {$ast.add(new VarDefinition($id2.getLine(),$id2.getCharPositionInLine()+1,$id2.text,null));
      })*

    ':'type';' {$ast.add(new VarDefinition($id1.getLine(),$id1.getCharPositionInLine()+1,$id1.text,null));}
   {for(Definition d :$ast){
   d.setType($type.ast);
   }}
    ;
//--------Statements--------------------------------------------------------------------------
/*
PRINT:'print'expression(','expression)*';';
INPUT:'input'expression(','expression)*';';
RETURN:'return'expression';';
ASSIGMENT:expression'='expression';';
PROCEDIMENT:ID'('(expression(','expression)*)?')'';';
fragment
ELSE:'else'statement|'{'statement*'}';
IF:'if'expression':'statement|'{'statement*'}'ELSE?;
WHILE:'while'expression':''{'statement*'}';
*/
//statement:PRINT|INPUT|RETURN|ASSIGMENT|PROCEDIMENT|IF|WHILE;

statement returns [Statement ast ]:
        PRINT='print'exs = expressions';'
                    {$ast =new Print($PRINT.getLine(),$PRINT.getCharPositionInLine()+1,$exs.ast);}
        |INPUT='input'exs=expressions';'
                    {$ast= new Input($INPUT.getLine(),$INPUT.getCharPositionInLine()+1,$exs.ast);}
        |RETURN='return' ex=expression';'
                    {$ast =new Return($RETURN.getLine(),$RETURN.getCharPositionInLine()+1,$ex.ast);}
        |op1 =expression'='op2= expression';'
                     {$ast =new Assigment(
                     $op1.ast.getLine(),
                     $op1.ast.getColumn()+1,
                     $op1.ast,$op2.ast
                     );}
        |ID'('')'';'
                    {$ast = new Procediment($ID.getLine(),$ID.getCharPositionInLine()+1,
                     new Variable($ID.getLine(),$ID.getCharPositionInLine()+1,$ID.text));}
        |ID'(' exs=expressions')'';'
                     {$ast = new Procediment($ID.getLine(),$ID.getCharPositionInLine()+1,
                     $exs.ast,
                     new Variable($ID.getLine(),$ID.getCharPositionInLine()+1,$ID.text));}
        |IF='if'ex=expression':'(st1=if_statements)
                     {$ast = new If($IF.getLine(),$IF.getCharPositionInLine()+1,$ex.ast,$st1.ast);}
        |IF='if'ex=expression':'(st1=if_statements)('else'(st2=if_statements))
                     {$ast = new If($IF.getLine(),$IF.getCharPositionInLine()+1,$ex.ast,$st1.ast,$st2.ast);}
        |WHILE='while'ex=expression':'st1=if_statements
                     {$ast = new While($WHILE.getLine(),$WHILE.getCharPositionInLine()+1,$ex.ast,$st1.ast);}
;
if_statements returns [List<Statement> ast= new LinkedList<Statement>()]:
                       ('{'sts=statemets{$ast.addAll($sts.ast);}'}')
                       | (statement {$ast.add($statement.ast);})
                        ;
statemets returns [List<Statement> ast]:{$ast = new LinkedList<Statement>();}
                      (statement{$ast.add($statement.ast);})*
;

//--------Expressions-------------------------------------------------------------------------
/*
CAST:'('TYPE')'expression;
ARITHMETIC:expression('+'|'-'|'/'|'%'|'*')expression;
COMPARASON:expression('>'|'>='|'<'|'<='|'=='|'!=')expression;
LOGICAL:expression('&&'|'||')expression;
ARRAY_ACESS:expression'['expression']';
FIELD_ACESS:expression'.'ID;
NOT:'!'expression;
UNARY_MINUS:'-'expression;
VARIABLE:ID;
*/
//todas las reglas tienen que  guardar algo en un ast
expression returns [Expression ast]:
        ID              {$ast = new Variable($ID.getLine(),$ID.getCharPositionInLine()+1,$ID.text );}
        |INT_CONSTANT   {$ast = new IntLiteral($INT_CONSTANT.getLine(),$INT_CONSTANT.getCharPositionInLine()+1
                                  ,LexerHelper.lexemeToInt($INT_CONSTANT.text ));}
        |REAL_CONSTANT  {$ast = new DoubleLiteral($REAL_CONSTANT.getLine(),$REAL_CONSTANT.getCharPositionInLine()+1
                                  ,LexerHelper.lexemeToReal($REAL_CONSTANT.text ));}
        |CHAR_CONSTANT  {$ast = new IntLiteral($CHAR_CONSTANT.getLine(),$CHAR_CONSTANT.getCharPositionInLine()+1
                                  ,LexerHelper.lexemeToChar($CHAR_CONSTANT.text ));}
        |'('ex= expression')'
                        {$ast = $ex.ast;}
        |ID'('exs =expressions')'
                        {
                        $ast = new FunctionInvocation(
                        $ID.getLine(),$ID.getCharPositionInLine()+1,
                                                                                           $exs.ast,
                        new Variable($ID.getLine(),$ID.getCharPositionInLine()+1,$ID.text)
                        );}
        |op1 = expression'[' op2 =expression']'
                         {$ast = new ArrayAcess(
                         $op1.ast.getLine(),
                         $op1.ast.getColumn()+1,
                         $op1.ast,$op2.ast
                         );}
        |ex= expression'.'ID
                        {$ast = new FieldAccess($ex.ast.getLine(),$ex.ast.getColumn()+1,$ID.text );}
        |CAST='('t=type')' ex=expression
                        {$ast = new Cast($CAST.getLine(),$CAST.getCharPositionInLine()+1,$t.ast,$ex.ast );}
        |NOT='!'op =  expression
                        {$ast = new Not($NOT.getLine(),$NOT.getCharPositionInLine()+1,$op.ast );}
        |MINUS='-'op =  expression
                       {$ast = new UnaryMinus($MINUS.getLine(),$MINUS.getCharPositionInLine()+1,$op.ast );}
        |op1 = expression OP=('*'|'/'|'%') op2 = expression
                        {$ast = new Arithmetic(
                        $op1.ast.getLine(),
                        $op1.ast.getColumn()+1,
                        $op1.ast,$OP.text,$op2.ast
                        );}
        |op1 = expression OP=('+'|'-')op2 = expression
                         {$ast = new Arithmetic(
                         $op1.ast.getLine(),
                         $op1.ast.getColumn()+1,
                         $op1.ast,$OP.text,$op2.ast
                         );}
        |op1 =expression OP=('<'|'>'|'<='|'>=')op2 = expression
                          {$ast = new Comparason(
                          $op1.ast.getLine(),
                          $op1.ast.getColumn()+1,
                          $op1.ast,$OP.text,$op2.ast
                          );}
        |op1 =expression OP=('!='|'==')op2 = expression
                          {$ast = new Comparason(
                          $op1.ast.getLine(),
                          $op1.ast.getColumn()+1,
                          $op1.ast,$OP.text,$op2.ast
                          );}
        |op1 =expression OP='&&'op2 = expression
                          {$ast = new Logical(
                          $op1.ast.getLine(),
                          $op1.ast.getColumn()+1,
                          $op1.ast,$OP.text,$op2.ast
                          );}
        |op1 =expression OP='||'op2 = expression
                          {$ast = new Logical(
                          $op1.ast.getLine(),
                          $op1.ast.getColumn()+1,
                          $op1.ast,$OP.text,$op2.ast
                          );}
;
expressions returns [List<Expression> ast]: op1 = expression
                          {$ast = new LinkedList<Expression>();$ast.add($op1.ast);}
                          (',' op2 = expression {$ast.add($op2.ast);})*
                          ;

//--------Types--------------------------------------------------------------------------------
simple_type returns [Type ast]:
            'int'       {$ast = new IntType();}
            |'double'   {$ast = new DoubleType();}
            |'char'     {$ast = new CharType();}

;
//TODO
//CAmbair structs con las posicciones de la lista
type returns[Type ast]:
            |simple_type  {$ast = $simple_type.ast;}
            |'struct''{'{List<RecordField> fields = new LinkedList<RecordField>();}
            {List<String> ids = new ArrayList<String>();}
            (id1=ID{
            if(ids.contains($id1.text))
                new ErrorType($id1.getLine(),$id1.getCharPositionInLine()+1,"Variable Repetida");
            ids.add($id1.text);}
            (','id2=ID{
            if(ids.contains($id2.text))
               new ErrorType($id2.getLine(),$id2.getCharPositionInLine()+1,"Variable Repetida");
            ids.add($id2.text);})*
            ':' simple_type';')+
            {for(String id: ids)
               fields.add(new RecordField($id1.getLine(),$id1.getCharPositionInLine()+1,id,$simple_type.ast)); }
            '}'
            {$ast = new RecordType(fields);}
            |
            '['INT_CONSTANT']'type
            {$ast = new ArrayType($type.ast,LexerHelper.lexemeToInt($INT_CONSTANT.text));}
            ;
//cambiar uml de arraytype, lista de dimensioness
//=============================================================================================
//=============================================================================================

//--------Caracteres---------------------------------------------------------------------------
fragment
COMILLA: '\'';
fragment
ASCII_CHAR:  COMILLA'\\'DIGIT DIGIT?DIGIT?COMILLA ;
fragment
SPECIAL_CHAR: COMILLA('\\t'|'\\n')COMILLA;
fragment
CHARS: COMILLA.COMILLA;
CHAR_CONSTANT: (ASCII_CHAR|SPECIAL_CHAR|CHARS);
//--------ID y letras--------------------------------------------------------------------------
fragment
LETTER: [a-zA-Z];
fragment
ID_CHARS: (LETTER|DIGIT|'_');
ID: (LETTER|'_')ID_CHARS*;
//--------Enteros------------------------------------------------------------------------------
fragment
DIGIT: [0-9];
fragment
DIGITS: DIGIT+;
INT_CONSTANT: ([1-9]DIGIT*)|[0];
//--------Reales-------------------------------------------------------------------------------
fragment
ELEVATED:[eE][+-]?DIGITS;
REAL_CONSTANT: (DIGITS|DIGITS'.'|DIGITS'.'DIGITS|'.'DIGITS)ELEVATED?;
//--------Espacios en blanco-------------------------------------------------------------------
WS: [ \t\n\r]+ -> skip ;
//--------Comentarios--------------------------------------------------------------------------
fragment
ONE_LINE_COMMENT: '#'.*?('\n'|EOF);
fragment
MULTILINE_COMMENT: '"""'.*?'"""';
TRASH: (ONE_LINE_COMMENT|MULTILINE_COMMENT) -> skip;