package datastructure;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {
	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> queue = new LinkedList<>(); //Using Queue
		queue.add("Line 1");					  // Adding
		queue.add("Line 2");
		queue.add("Line 3");

		queue.forEach(System.out::println);       // Using queue.forEach loop
		System.out.println();
		System.out.println("Printer with Iterator");

		Iterator it = queue.iterator();          //Using Iterator
		while(it.hasNext()){
			System.out.println(it.next());
		}

		System.out.println();
		System.out.println(queue.remove());
		System.out.println(queue.element());     //Using element
		System.out.println(queue.peek());    	// Using peek
	}
}
