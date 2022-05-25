package symboltable;

import java.util.*;
import ast.Definitions.Definition;

public class SymbolTable {
	
	private int scope=-1;
	private List<Map<String,Definition>> table = new LinkedList<>();
	public SymbolTable()  {
		set();
	}

	public void set() {
		table.add(new HashMap<String,Definition>());
		scope++;
	}
	
	public void reset() {
		if(table.size()>1) {
			table.remove(table.size() - 1);
			scope--;
		}
	}
	
	public boolean insert(Definition definition) {
		if(findInCurrentScope(definition.getName())==null) {
			definition.setScope(scope);
			table.get(scope).put(definition.getName(), definition);
			return  true;
		}
		return false;
	}
	
	public Definition find(String id) {
		for (int i = scope; i >= 0; i--) {
			Definition def = table.get(i).get(id);
			if (def != null)
				return def;
		}
		return null;
	}

	public Definition findInCurrentScope(String id) {
		if(table.get(scope).containsKey(id))
			return table.get(scope).get(id);
		else
			return null;
	}
}
