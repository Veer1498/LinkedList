package linkedlist;
/**
 * Linked List Program
 * @author Veer.singa
 */
public class ListOperations {
	
	//Adding Data in LinkedList
	public void addData() {
		/*
		 * Calling the Methods from LinkedList Class
		 * inserting data one by one in add Data Method
		 * print the list
		 */
		LinkedList list = new LinkedList();
		list.insert(56);
		list.insert(30);
		list.insert(70);
		System.out.println("Data Added in List \n");
		list.show();

	}

}
