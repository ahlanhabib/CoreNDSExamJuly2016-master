package datastructure;
import java.util.*;

public class UseMap {
	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		List<String> nazirNames = new ArrayList<>();  // Using ArrayList
		nazirNames.add("Nazir");
		nazirNames.add("Nadim");
		nazirNames.add("Nazir Uddin");

		List<String> roceeNames = new ArrayList<>();
		roceeNames.add("Rocee");
		roceeNames.add("Tutul");
		roceeNames.add("Ahlan Habib");

		List<String> rabbilNames = new ArrayList<>();
		rabbilNames.add("Rabbil");
		rabbilNames.add("Mitul");
		rabbilNames.add("Ahasan Habib");

		Map<String, List<String>> names = new LinkedHashMap<>();  // Using LinkedHashMap
		names.put("Nazir",nazirNames );
		names.put("Rocee",roceeNames );
		names.put("Rabbil",rabbilNames );

		for (Map.Entry<String, List<String>> allNames: names.entrySet()) {  //Using forEach loop
			System.out.println(allNames.getKey()+ ":"+ allNames.getValue());
		}

		System.out.println();

		Iterator it = names.entrySet().iterator();  //Using Iterator
		while (it.hasNext()) {
			Map.Entry print = (Map.Entry) it.next();
			System.out.println(print.getKey()+ ":"+ print.getValue());
		}
	}
}
