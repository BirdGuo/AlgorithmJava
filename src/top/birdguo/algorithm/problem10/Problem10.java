package top.birdguo.algorithm.problem10;

public class Problem10 {

	/**
	 * 筛选法
	 * 
	 * @param maxNum
	 * @return
	 */
	public static Long createPrimeWithMax(int maxNum) {

		boolean[] createPrime = createPrime(maxNum);
		Long result = 0L;
		for (int i = 0; i < createPrime.length; i++) {

			if (createPrime[i]) {
				result += i;
			}

		}

		return result;

	}

	public static boolean[] createPrime(int maxNum) {

		boolean[] primes = new boolean[maxNum + 1];

		for (int i = 0; i < primes.length; i += 2) {
			primes[i] = false;
		}

		for (int i = 1; i < primes.length; i += 2) {
			primes[i] = true;
		}

		primes[1] = false;

		for (int i = 3; i <= Math.sqrt(maxNum); i += 2) {
			if (primes[i])
				for (int j = i + i; j <= maxNum; j += i)
					primes[j] = false;
		}

		primes[2] = true;

		return primes;

	}

	public static void main(String[] args) {

		System.out.println(createPrimeWithMax(2000000));

	}

}
