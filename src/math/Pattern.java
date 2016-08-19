package math;
public class Pattern {
	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern. which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		// Problem solving:
		// First 11 numbers, which starts with 100 and prints till 90. Skipping = 0
		// After 90, from 12th place
		// next 10 numbers skipping = 2,
		// next 10 numbers skipping = 3,

		// so next next 10 numbers will skip = 3 and so on.

		int count = -1, skip = 0;
		for(int i=100; i>= 0; i--){
			if(count == 10){
				count = 0;
				skip++;
			}
			count++;
			i = i - skip;
			System.out.println(i);
		}
	}
}
