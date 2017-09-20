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
//				System.out.println(primes.size() + "   " + i + "   " + primeLoc);
				primes.add(primeLoc);
			}

		}


		return primes;
	}

	public static void main(String[] args) {
		ArrayList<Long> createPrime = createPrime(100000000L);
//		System.out.println(createPrime);
		System.out.println(createPrime.get(createPrime.size() - 1));
		//
		// System.out.println(createPrime(10001L));
	}

}
