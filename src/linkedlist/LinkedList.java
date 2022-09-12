package linkedlist;
/**
 * Linked List Program
 * @author Veer.singa
 */
public class LinkedList {
	Node head,tail;
	//For Adding Data at First Node
	public Node insert(int data) {
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
			tail = newNode;
		}
		  else if(head != null){
	            Node temp = head;
	            while(temp.next != null) {
	                temp = temp.next;
	            }
	            temp.next = newNode;
	        }
	        return head;
	}
	//To Append Data
	public void push(int data) {
		Node newNode =new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			this.tail.next = newNode;
			tail = newNode;
		}

	}
	
	//Pop method
	public void pop() {
		this.head = this.head.next;
	}
	
	//Pop last method
	public void popLast()  {
		Node tempNode = head;
		while(!tempNode.next.equals(tail)) {
			tempNode = tempNode.next;
		}
		tail = tempNode;
		tempNode.next = null;
	}
		
	//To Insert Data Btw elements
	public void insertBetween(Node prevNode, Node newNode) {
		Node tempNode = prevNode.next;
		prevNode.next = newNode;
		newNode.next = tempNode;
	}
	
	//To Print the LinkedList
	public void show() {
		  Node temp = head;
	        if(temp == null) {
	            System.out.println("LinkedList is empty");
	        }
	        else {
				while(temp != null) {
					System.out.print(temp.data+" ");
					temp = temp.next;
				}
	        }
	}

}
