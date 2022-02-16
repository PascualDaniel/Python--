grammar Pmm;	

program: 
       ;



//--------Caracteres-------------
fragment
COMILLA: '\'';
fragment
ASCII_CHAR:  COMILLA'\\'DIGIT DIGIT?DIGIT?COMILLA ;
fragment
SPECIAL_CHAR: COMILLA('\\t'|'\\n')COMILLA;
fragment
CHARS: COMILLA.COMILLA;

CHAR_CONSTANT: (ASCII_CHAR|SPECIAL_CHAR|CHARS);

//--------ID y letras--------
fragment
LETTER: [a-zA-Z];
fragment
ID_CHARS: (LETTER|DIGIT|'_');

ID: (LETTER|'_')ID_CHARS*;


//--------Enteros------------
fragment
DIGIT: [0-9];

INT_CONSTANT: DIGIT+;

//--------Reales-------------
//12.3, 34.12E-3, 2., 3e3 , .3 , 3.e
//              (nums nums. nums.nums o .nums )    +(eE +-? nums)?
fragment
ELEVATED:[eE][+-]?INT_CONSTANT;

DOUBLE_CONSTANT: (INT_CONSTANT|INT_CONSTANT'.'|INT_CONSTANT'.'INT_CONSTANT|'.'INT_CONSTANT)ELEVATED?;
//DOUBLE_CONSTANT: ((INT_CONSTANT('.'INT_CONSTANT?)?)|('.'INT_CONSTANT))([eE][+-]?INT_CONSTANT)?;

//--------Espacios en blanco--------
WS: [ \t\n\r]+ -> skip ;
//--------Comentarios---------------
fragment
ONE_LINE_COMMENT: '#'.*?('\n'|EOF);
fragment
MULTILINE_COMMENT: '"""'.*?'"""';
TRASH: (ONE_LINE_COMMENT|MULTILINE_COMMENT) -> skip;