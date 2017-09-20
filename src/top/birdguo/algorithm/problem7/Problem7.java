package top.birdguo.algorithm.problem7;

import java.util.ArrayList;

import top.birdguo.algorithm.prime.PrimeNumCount;

public class Problem7 {

	public static ArrayList<Long> createPrime(Long location) {

		Long prime = 0L;

		ArrayList<Long> primes = new ArrayList<Long>();

		primes.add(2L);
		primes.add(3L);

		for (Long i = 3L; i < Long.MAX_VALUE; i++) {

			if (primes.size() >= location) {
				break;
			}

			Long primeLoc = 0L;
			if (i % 2 == 0) {
				primeLoc = (6 * ((i / 2) - 1) + 1);
			} else {
				primeLoc = (6 * (((i + 1) / 2) - 1) - 1);
			}
			if (PrimeNumCount.isPrime(primeLoc)) {
				// System.out.println(primes.size() + " " + i + " " + primeLoc);
				primes.add(primeLoc);
			}

		}

		return primes;
	}

	/**
	 * 筛选法
	 * 
	 * @param maxNum
	 * @return
	 */
	public static boolean[] isPrime(int maxNum) {

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

	// public static Long name() {
	//
	// }

	public static void main(String[] args) {

		long begin = System.currentTimeMillis();
		// ArrayList<Long> createPrime = createPrime(2000000L);

		boolean[] primes = isPrime(1000000000);
		// for (int i = 0; i < primes.length; i++) {
		// if (primes[i]) {
		// System.out.println(i);
		// }
		// }

		long end = System.currentTimeMillis();
		System.out.println();
		// System.out.println(createPrime.get(createPrime.size() - 1));
		System.out.println((end - begin));
	}

}
