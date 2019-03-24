
public class main {
	static final int MAXPRIMES = 1024;

	public static String getPrimes(int n) {
		int curPrime; // Value currently considered for primeness
		int numPrimes; // Number of primes found so far;
		boolean isPrime; // Is curPrime prime?
		int[] primes = new int[MAXPRIMES];// The list of primes.
		// Initialize 2 into the list of primes.
		primes[0] = 2;
		numPrimes = 1;
		curPrime = 2;
		while (numPrimes < n) {
			curPrime++; // next number to consider...
			isPrime = true;
			for (int i = 0; i < numPrimes; i++) {
				// for each previous prime.
//               if(isDvisible(primes[i],curPrime)) {               
				if (curPrime % primes[i] == 0) {
					// Found a divisor, curPrime is not prime.
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				// save it!
				primes[numPrimes] = curPrime;
				numPrimes++;

			}
		} // End while

		// print all the primes out
		String ret = "";
		for (int i = 0; i < numPrimes; i++) {
			ret += +primes[i] + " ";
		}
		return ret;
	}
}