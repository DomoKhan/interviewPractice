
public class dataStructures
{
	public static void main(String args[])
	{
		linkedList<Integer> trial= new linkedList<Integer>();
		for(int i = 0; i < 10; ++i)
		{
			trial.appendToTail(i);
		}	
		trial.printList();
		trial.removeNode(3);
		System.out.println("Removing 3");
		trial.printList();
		trial.removeNode(0);
		trial.removeNode(8);
		trial.printList();
	}
}
