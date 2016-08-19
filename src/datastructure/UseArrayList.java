package datastructure;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class UseArrayList {
	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		List<String> list = new ArrayList<>(); // Using ArrayList
		list.add("Nazir");                     // Add elements
		list.add("Pavel");
		list.add("Khalil");
		list.add("Mishkat");
		list.add("Rabbil");
		list.add("Rocee");

		list.forEach(System.out::println);     //Using list.forEach(System.out::println);

		System.out.println();
		list.remove(5);                        // Remove Elements
		System.out.println("After removing index 5: Rocee, here is the new list. ");

		list.forEach(System.out::println);

		System.out.println();
		System.out.println("Printer with Iterator");

		Iterator it = list.iterator();		   //Using Iterator
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
