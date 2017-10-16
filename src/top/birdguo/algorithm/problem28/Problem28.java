package top.birdguo.algorithm.problem28;

import java.math.BigDecimal;

public class Problem28 {

	public static void main(String[] args) {
		solution(1001);
	}

	/**
	 * f(n) = n²-k*n+k;(k=1,2,3)
	 * 
	 * sum(n) = 4n²-6*n+6
	 * 
	 * @param max
	 */
	public static void solution(int max) {

		// 从1开始
		Long result = 1L;

		// 奇数才能成为方块 顾进量为2
		for (int i = 3; i <= max; i += 2) {

			double first = Math.pow(i, 2);

			result = (long) (result + (first * 4 - 6 * i + 6));

		}

		System.out.println(result);
	}

}
