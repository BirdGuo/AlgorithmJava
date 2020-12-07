package top.birdguo.algorithm.primefactors;

import java.util.ArrayList;

import top.birdguo.algorithm.prime.PrimeNumCount;

public class PrimeFactors {

	public static ArrayList<Integer> getPrimeFactors(int num) {

		ArrayList<Integer> pfsArrayList = new ArrayList<Integer>();

		if (num <= 0) {

			pfsArrayList.add(-1);

		} else {
			if (PrimeNumCount.isPrime(num)) {

				pfsArrayList.add(1);
				pfsArrayList.add(num);

			} else {
				// 定义最小素数
				int i = 2;

				// 进行辗转相除法
				while (i <= num) {

					// 若num 能整除 i ，则i 是num 的一个因数
					if (num % i == 0) {

						pfsArrayList.add(i);
						// 同时将 num除以i 的值赋给 num
						num = num / i;

						// 将i重新置为2
						i = 2;
					} else {

						// 若无法整除，则i 自增
						i++;
					}
				}
			}
		}
		return pfsArrayList;

	}

	public static void main(String[] args) {

		Long begin = System.currentTimeMillis();

		for (int i = 1; i < 100; i++) {

			// System.out.println(getPrimeFactors(i));

			StringBuffer result = new StringBuffer();
			for (Integer a : getPrimeFactors(i)) {

				result.append("*"+a);
//				System.out.print("PPP->"+i+" = "+a + " ");
			}
			System.out.println("result ==> "+i+" = "+result);

		}

		Long end = System.currentTimeMillis();

		System.out.println(end - begin);
	}

}
