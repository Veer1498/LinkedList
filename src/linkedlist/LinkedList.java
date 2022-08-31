package linkedlist;
/**
 * Linked List Program
 * @author Veer.singa
 */
public class LinkedList {
	Node head;
	//For Adding Data at First Node
	public void addFirst(int data) {
		/*
		 * created and Object of Class Node Passing Data.
		 * Created IF Else Condition
		 * If - There is Nothing in List Creates a New Node,
		 * Else - The Head is Stored in temp, and Creates Head with New Node 
		 * and temp will become NextNode for New Node.
		 * It Returns newNode.
		 * 
		 */
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}
		else{
	         Node temp = head;  
	         head = newNode;
	         newNode.next = temp;
	    }	    
	}
	public void show() {
		  Node temp = head;
	        if(temp == null) {
	            System.out.println("LinkedList is empty");
	        }
	        else {
	            while(temp.next!=null) {
	                System.out.print(temp.data+"-->");
	                temp = temp.next;
	            }
	            System.out.print(temp.data);
	        }
	}

}
