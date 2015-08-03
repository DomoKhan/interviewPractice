/*Generic class for linkedList */
public class linkedList<T>
{
	private node<T> head;
	linkedList()
	{
		head = new node<T>();
	}
	linkedList(T value)
	{
		head = new node<T>(value);
	}

        public void appendToTail(T value)
        {
        	if(head.getValue()== null)
		{
			head.setValue(value);
			return;
		}
	        node<T> next = new node<T>(value);
                node<T> n = head;
                while(n.getChild() != null) {n = n.getChild();}
                n.setChild(next);
		next.setParent(n);
        }

        // searches the linked list to see if the value exists
        public boolean search(T searchValue)
        {
                node<T> n = head;
                while(n.getChild() != null)
                {
                        if(n.getValue() == searchValue)
                        {
                                return true;
                        }
                        n = n.getChild();
                }
                return false;
        }
        // delete a node based on value
	public void removeNode(T value)
	{
		node<T> n = head;
		node<T> parent = null;
		node<T> child = null;
		//checks if head is removed
		if(n.getValue() == value)
		{
			head = head.getChild();
		}
		while(n.getChild() != null)
		{
			parent = n.getParent();
			child = n.getChild();			
			if(n.getValue() == value)
			{
				if(parent != null){
					parent.setChild(child);
				}
				if(child != null){
					child.setParent(parent);
				}
			}
			n = child;
		}
	}
	public void printList()
	{
		node<T> n = head;
		while(n.getChild() != null)
		{
			System.out.print(n.getValue() + " ");
			n = n.getChild();
		}
		System.out.println();
	}
}
