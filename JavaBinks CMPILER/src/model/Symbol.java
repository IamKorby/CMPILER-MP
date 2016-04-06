package model;

/**
 * Created by Justin on 01/04/2016.
 */
public class Symbol
{
	private DataType datatype;
	private String name;
	private Object value;

	public Symbol( DataType dataType, String name )
	{
		this.datatype = dataType;
		this.name = name;
		this.value = null;
	}

	public Symbol( DataType dataType, String name, Object value )
	{
		this.datatype = dataType;
		this.name = name;
		this.value = value;
	}

	public DataType getDatatype()
	{
		return datatype;
	}

	public void setDatatype( DataType datatype )
	{
		this.datatype = datatype;
	}

	public String getName()
	{
		return name;
	}

	public void setName( String name )
	{
		this.name = name;
	}

	public Object getValue()
	{
		return value;
	}

	public void setValue( Object value )
	{
		this.value = value;
	}

	public String toString()
	{
		return datatype.toString() + " " + name + " " + value;
	}
}
