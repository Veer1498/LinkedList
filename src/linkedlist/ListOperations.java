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
		 * return the list values for further use
		 */
		LinkedList list = new LinkedList();
		list.addFirst(56);
		list.addFirst(30);
		list.addFirst(70);
		System.out.println("Data Added in List \n");
		list.show();

	}

}
