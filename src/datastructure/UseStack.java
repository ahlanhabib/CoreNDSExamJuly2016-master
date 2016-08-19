package datastructure;
import java.util.Iterator;
import java.util.Stack;

public class UseStack {
	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Stack that includes push,peek,remove,pop elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Stack<String> stack = new Stack<>();
		stack.push("Plate 1");
		stack.push("Plate 2");
		stack.push("Plate 3");

		stack.forEach(System.out::println);

		System.out.println();
		System.out.println("Printer with Iterator");
		Iterator it = stack.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

		System.out.println();
		System.out.println(stack.pop());
		System.out.println(stack.remove(0));
		System.out.println(stack.peek());
	}
}
