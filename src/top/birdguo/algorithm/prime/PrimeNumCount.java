package top.birdguo.algorithm.prime;

public class PrimeNumCount {

	/**
	 * 判断一个数是否为素数
	 * 
	 * @param num
	 * @return true 是素数；false 非素数
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
				for (int i = 2; i <= Math.sqrt(num); i++) {
					// System.out.println("tt:"+i);
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
	 */
	public static boolean isPrime(Long num) {

		boolean isPrim = true;

		if (num <= 1) {
			isPrim = false;
		} else if (num == 2) {
			isPrim = true;
		} else {
			if (num % 2 == 0) {// 去除偶数
				isPrim = false;
			} else {
				for (int i = 2; i <= Math.sqrt(num); i++) {
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
		for (int i = 0; i < 100; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
				count++;
			}
		}

		System.out.println();

		System.out.println(count);

		Long b = System.currentTimeMillis();
		System.out.println(b);
		System.out.println("time:" + (b - a));

	}

}
