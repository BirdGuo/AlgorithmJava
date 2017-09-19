package top.birdguo.algorithm.lpfproblem;

import java.util.ArrayList;

import top.birdguo.algorithm.prime.PrimeNumCount;

public class LargestPrimeFactor {

	public static ArrayList<Long> solvePrimes(Long num) {

		ArrayList<Long> primes = new ArrayList<Long>();

		Long numCurrent = 1L;

		for (Long i = 2L; i <= num; i++) {
			if (PrimeNumCount.isPrime(i)) {
				if (i == num) {
					primes.add(i);
				} else {
					if (num % i == 0) {
						primes.add(i);
						num = num / i;
						System.out.println("solvePrimes i:" + i);
						System.out.println("solvePrimes num:" + num);
						i = 2L;
					}
				}
			}
		}

		return primes;

	}

	public static void main(String[] args) {
		ArrayList<Long> solvePrimes = solvePrimes(600851475143L);
		for (Long long1 : solvePrimes) {
			System.out.print("m:" + long1 + "   ");
		}
	}

}
