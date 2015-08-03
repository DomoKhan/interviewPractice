/* Generic node class for other data structures */

public class node<T>
{
	private node<T> parent;
	private node<T> child;
	private T value;
	node()
	{
		parent = null;
		child = null;
		value = null;
	}
	node(T value)
	{
		parent = null;
		child = null;
		this.value = value;
	}
		
	public T getValue()
	{
		return this.value;
	}	
	public node<T> getChild()
	{
		return this.child;
	}
	public node<T> getParent()
	{
		return this.parent;
	}
	public void setValue(T value)
	{
		this.value = value;
	}
	public void setChild(node<T> next)
	{
		this.child = next;
	}
	public void setParent(node<T> before)
	{
		this.parent = before;
	}

}
