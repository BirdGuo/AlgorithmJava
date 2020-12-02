package top.birdguo.algorithm.prime;

import top.birdguo.algorithm.problem7.Problem7;

public class PrimeNumCount {

	/**
	 * 判断一个数是否为素数
	 * 
	 * @param num
	 * @return true 是素数；false 非素数
	 *
	 * 大于3的偶数都不是质数
	 */
	public static boolean isPrime(int num) {

		boolean isPrim = true;

		switch (num) {
		case 0:// 0不是质数
			isPrim = false;
			break;
		case 1:// 1本身不是质数
			isPrim = false;
			break;
		case 2:// 2是质数
			isPrim = true;
			break;
		default:

			if (num % 2 == 0) {// 去除偶数
				isPrim = false;
			} else {

				// System.out.println("-----------------------");
				for (int i = 3; i <= Math.sqrt(num); i += 2) {
					if (num % i == 0) {
						isPrim = false;
						break;
					}
				}
			}

			break;
		}

		return isPrim;

	}

	/**
	 * 判断一个数是否为素数
	 * 
	 * @param num
	 * @return true 是素数；false 非素数
	 *
	 * 大于3的偶数都不是质数
	 */
	public static boolean isPrime(Long num) {

		boolean isPrim = true;

		if (num <= 1) {
			isPrim = false;
		} else if (num == 2) {
			isPrim = true;
		} else if (num == 3) {
			isPrim = true;
		} else {
			if (num % 2 == 0) {// 去除偶数
				isPrim = false;
			} else {
				for (int i = 3; i <= Math.sqrt(num); i += 2) {
					if (num % i == 0) {
						isPrim = false;
						break;
					}
				}
			}

		}

		return isPrim;

	}

	public static void main(String[] args) {

		Long a = System.currentTimeMillis();
		System.out.println(a);
		int count = 0;

		// for (Long i = 3L; i < Long.MAX_VALUE; i++) {
		// Long createPrime = Problem7.createPrime(i);
		//
		// if (createPrime < 101) {
		//
		// continue;
		//
		// } else if (createPrime < 201 && createPrime > 100) {
		// System.out.print(createPrime+" ");
		// count++;
		// continue;
		// }else {
		// break;
		// }
		//
		// }

		Long c = System.currentTimeMillis();
		System.out.println();
		System.out.println("time1:" + (c - a));
		System.out.println(count);

		int count1 = 0;
		for (int i = 101; i < 201; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
				count1++;
			}
		}

		System.out.println();

		System.out.println(count1);

		Long b = System.currentTimeMillis();
		System.out.println("time2:" + (b - a));

	}

}
