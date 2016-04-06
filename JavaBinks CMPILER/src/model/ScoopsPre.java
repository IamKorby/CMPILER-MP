package model;

import java.util.HashMap;

/**
 * Created by Justin on 01/04/2016.
 */
public class ScoopsPre
{
	private HashMap<String, Symbol> symbolTable;

	public ScoopsPre()
	{
		symbolTable = new HashMap<>();
	}

	public void declare( Symbol symbol )
	{
		symbolTable.put(symbol.getName(), symbol);
	}

	public void update( Symbol symbol )
	{
		if( symbolTable.get(symbol.getName()) != null )
		{
			symbolTable.replace(symbol.getName(), symbol);
		}
		else
		{
			symbolTable.put(symbol.getName(), symbol);
		}
	}

	public Symbol retrieve( String key )
	{
		return symbolTable.get(key);
	}
}
