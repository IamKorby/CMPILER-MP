package model;

import java.util.Stack;

/**
 * Created by Justin on 06/04/2016.
 */
public class SymbolTable
{
	private ScoopsPre global;
	private Stack<ScoopsPre> scope;

	public SymbolTable()
	{
		global = new ScoopsPre();
		scope = new Stack<>();
	}

	public ScoopsPre getCurrentScope()
	{
		return scope.peek();
	}

	public void enterScope()
	{
		ScoopsPre c = new ScoopsPre();

		scope.push(c);
	}

	public void exitScope()
	{
		scope.pop();
	}
}
