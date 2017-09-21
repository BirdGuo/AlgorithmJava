package top.birdguo.algorithm.problem7;

import top.birdguo.algorithm.prime.PrimeNumCount;

public class Problem7 {

	/**
	 * 生成第location位素数
	 * 
	 * 生成1000001L需要 16609 毫秒，结果15485867
	 * 
	 * @param location
	 * @return
	 */
	public static Long createPrimeWithLocation1(Long location) {

		Long num = 0L;

		if (location.equals(2)) {
			return 2L;
		} else if (location.equals(3)) {
			return 3L;
		} else {

			Long count = 3L;

			Long primeLoc = 0L;
			for (Long i = 3L; i < Long.MAX_VALUE; i++) {
				if (count <= location) {
					if (i % 2 == 0) {// 第偶数位素数 6n+1
						primeLoc = (6 * ((i / 2) - 1) + 1);
					} else {// 第奇数位素数 6n-1
						primeLoc = (6 * (((i + 1) / 2) - 1) - 1);
					}
					if (PrimeNumCount.isPrime(primeLoc)) {
						count++;
					}
				} else {
					break;
				}

			}

			return primeLoc;

		}

	}

	/**
	 * 生成第n个素数
	 * 
	 * 生成1000001L需要17177毫秒 结果15485919
	 * 
	 * @param location
	 * @return
	 */
	public static Long createPrimeWithLocation(Long location) {

		Long count = 2L;

		Long num = 3L;
		if (location.equals(1L)) {
			num = 2L;// 第1个直接输出为2
		} else if (location.equals(2L)) {
			num = 3L;// 第2个直接输出为3
		} else {

			// 当前个数小于location时
			while (count < location) {
				// 判断是否为素数
				num += 2;// 因为是从3开始，而且偶数不为素数，所以移动量为2
				if (PrimeNumCount.isPrime(num)) {
					count++;// 是素数位数+1
				}
			}
		}

		// 返回结果
		return num;
	}

	public static void main(String[] args) {

		long begin = System.currentTimeMillis();

		System.out.println(createPrimeWithLocation(1000001L));

		long end = System.currentTimeMillis();
		System.out.println((end - begin));
	}

}
