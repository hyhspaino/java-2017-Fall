package problem2;

/**
 * This class generates all prime numbers.
 */
public class PrimeGenerator {
	private int current;

	public PrimeGenerator() {
		current = 1;
	}

	/**
	 * Calculates the next prime number.
	 * 
	 * @return the next prime number
	 */
	public int nextPrime() {
		// Complete this part
		if (current <= 3)
			return current++;
		boolean check_point = false;
		while (false == check_point) {
			for (int i = 2; i < current; i++) {
				if (current % i == 0) {
					current++;
					break;
				}
				
			}
			check_point = true;
		}
		return current;
	}

	/**
	 * Check if n is a prime number.
	 * 
	 * @param n
	 *            to check whether it is prime or not
	 * @return true if n is prime
	 */
	public static boolean isPrime(int n) {
		// Complete this part

		if (n <= 3)
			return n > 1;

		for (int k = 2; k < n; k++) {
			if (n % k == 0)
				return false;
			
		}
		return true;
	}
}
