package math;
public class PrimeNumber {
	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		int n = 1000000;
		int howManyPrimes = 0;
		boolean isPrime = true;
		for(int i=2; i<=n; i++){
			isPrime = true;
			for(int j=2; j<=i/2; j++){         //Dividing i by 2 works faster
				if(i%j == 0){
					j = i;
					isPrime = false;
				}
			}
			if(isPrime){
				System.out.println(i);
				howManyPrimes++;
			}
		}
		System.out.println("Number Of Prime Numbers So Far: " + howManyPrimes);
	}
}
