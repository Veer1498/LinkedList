package linkedlist;
/**
 * Linked List Program
 * @author Veer.singa
 */
public class ListMain {
	/*
	 * This is the Main Class of the Whole Linked List Program
	 */
	public static void main(String[] args) {
		/*
		  * Called Welcome Method
		  * Took Scanner to select which method to Perform
		  * Calling all Methods Created in Operations.
		  * 
		  */
		welcome();
		ListOperations operation = new ListOperations();
		operation.addData();
		System.out.println("\n");
	}
	
	public static void welcome() {
		System.out.println("Welcome to LinkedList Program");
		System.out.println("=============================");

	}
}
