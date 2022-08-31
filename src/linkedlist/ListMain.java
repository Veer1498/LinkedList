package linkedlist;

import java.util.Scanner;

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
		Scanner sc = new Scanner(System.in);
		LinkedList list = new LinkedList();
		System.out.println("\n");
		System.out.println("Please Select 1.Insert Data 2.Append Data");
		int option = sc.nextInt();
		switch(option) {
		case 1:
			list.insert(56);
			list.insert(30);
			list.insert(70);
			System.out.println("Data Added in List \n");
			list.show();
			break;
		case 2 :
			list.push(70);
			list.push(30);
			list.push(56);

			list.show();

			break;
		}
	}
	
	public static void welcome() {
		System.out.println("Welcome to LinkedList Program");
		System.out.println("=============================");

	}
}
