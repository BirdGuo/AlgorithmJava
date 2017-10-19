package top.birdguo.algorithm.problem37;

import java.util.ArrayList;

import top.birdguo.algorithm.prime.PrimeNumCount;
import top.birdguo.algorithm.problem10.Problem10;

public class Problem37 {

	public static void main(String[] args) {
		// System.out.println(PrimeNumCount.isPrime(379));
		solution();

		// System.out.println(PrimeNumCount.isPrime(73937));
		// System.out.println(PrimeNumCount.isPrime(7393));
		// System.out.println(PrimeNumCount.isPrime(739));
		// System.out.println(PrimeNumCount.isPrime(73));
		// System.out.println(PrimeNumCount.isPrime(39373));
		// System.out.println(PrimeNumCount.isPrime(9373));
		// System.out.println(PrimeNumCount.isPrime(373));

	}

	public static void solution() {

		int result = 0;
		// 计算两位可截素数
		int[] nums = { 2, 3, 5, 7 };
		ArrayList<Integer> combain = combain(nums);
		for (Integer integer : combain) {

			if (PrimeNumCount.isPrime(integer)) {
				System.out.println(integer);
				result += integer;

			}

		}

		boolean[] createPrime = Problem10.createPrime(100000);

		for (int i = 10; i < createPrime.length; i++) {

			// 素数并且末位为2，3，5，7,2和5不可能
			if (createPrime[i] && (((i - 3) % 10 == 0) || ((i - 7) % 10 == 0))) {

				if (i < 100) {
					int num700 = 700 + i;
					int num300 = 300 + i;

					if (judgePrime(num300)) {
						result += num300;
					}

					if (judgePrime(num700)) {
						result += num700;
					}

				} else if (100 < i && i < 1000) {
					int num3000 = 3000 + i;
					int num7000 = 7000 + i;

					if (judgePrime(num3000)) {
						result += num3000;
					}
					if (judgePrime(num7000)) {
						result += num7000;
					}
				} else if (1000 < i && i < 10000) {
					int num30000 = 30000 + i;
					int num70000 = 70000 + i;

					if (judgePrime(num30000)) {
						result += num30000;
					}
					if (judgePrime(num70000)) {
						result += num70000;
					}

				} else if (10000 < i && i < 100000) {
					int num300000 = 300000 + i;
					int num700000 = 700000 + i;

					if (judgePrime(num300000)) {
						result += num300000;
					}
					if (judgePrime(num700000)) {
						result += num700000;
					}

				}
			}
		}

		System.out.println("result:" + result);

	}

	public static boolean judgePrime(int num) {
		if (PrimeNumCount.isPrime(num)) {
			// result = result + num700;
			String valueOf = String.valueOf(num);
			if (num < 1000) {
				Integer valueOf2 = Integer.valueOf(valueOf.substring(0, 2));
				if (PrimeNumCount.isPrime(valueOf2)) {
					System.out.println("hund:" + num);
					return true;
				}
			} else if (num < 10000 && num > 1000) {

				int leftTwo = Integer.valueOf(valueOf.substring(0, 2));
				int leftThree = Integer.valueOf(valueOf.substring(0, 3));
				int rightTwo = Integer.valueOf(valueOf.substring(2, 4));

				if (PrimeNumCount.isPrime(leftTwo) && PrimeNumCount.isPrime(leftThree)
						&& PrimeNumCount.isPrime(rightTwo)) {
					System.out.println("thous:" + num);
					return true;
				}

			} else if (10000 < num && num < 100000) {

				int leftTwo = Integer.valueOf(valueOf.substring(0, 2));
				int leftThree = Integer.valueOf(valueOf.substring(0, 3));
				int leftFour = Integer.valueOf(valueOf.substring(0, 4));
				int righThree = Integer.valueOf(valueOf.substring(2, 5));
				int rightTwo = Integer.valueOf(valueOf.substring(3, 5));

				if (PrimeNumCount.isPrime(leftTwo) && PrimeNumCount.isPrime(leftThree)
						&& PrimeNumCount.isPrime(rightTwo) && PrimeNumCount.isPrime(leftFour)
						&& PrimeNumCount.isPrime(righThree)) {
					System.out.println("ten thous:" + num);
					return true;
				}

			} else if (100000 < num && num < 1000000) {

				int leftTwo = Integer.valueOf(valueOf.substring(0, 2));
				int leftThree = Integer.valueOf(valueOf.substring(0, 3));
				int leftFour = Integer.valueOf(valueOf.substring(0, 4));
				int leftFive = Integer.valueOf(valueOf.substring(0, 5));
				int righFour = Integer.valueOf(valueOf.substring(2, 6));
				int rightThree = Integer.valueOf(valueOf.substring(3, 6));
				int rightTwo = Integer.valueOf(valueOf.substring(4, 6));

				if (PrimeNumCount.isPrime(leftTwo) && PrimeNumCount.isPrime(leftThree)
						&& PrimeNumCount.isPrime(rightTwo) && PrimeNumCount.isPrime(leftFour)
						&& PrimeNumCount.isPrime(rightThree) && PrimeNumCount.isPrime(leftFive)
						&& PrimeNumCount.isPrime(righFour)) {
					System.out.println("million:" + num);
					return true;
				}

			}

		}
		return false;
	}

	/**
	 * 组合
	 */
	public static ArrayList<Integer> combain(int[] nums) {

		ArrayList<Integer> lists = new ArrayList<Integer>();

		for (int i : nums) {
			int ten = i * 10;
			for (int j : nums) {
				lists.add(ten + j);
			}
		}

		return lists;
	}

}
