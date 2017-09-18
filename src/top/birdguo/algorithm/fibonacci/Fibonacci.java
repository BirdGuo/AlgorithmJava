package top.birdguo.algorithm.fibonacci;

import top.birdguo.algorithm.rabbitborn.RabbitBorn;

public class Fibonacci {

	/**
	 * 获得maValue以内斐波那契数列中为偶数的数的和
	 * 
	 * @param maxValue
	 *            最大值
	 * @return
	 */
	public static int getFeb(int maxValue) {

		// 数组下标为2开始
		int n = 2;
		// 返回数值
		int summarize = 0;
		// 第一个数
		int feb = RabbitBorn.rabbitSolution(2);
		while (feb < maxValue) {// 判断是否小于4000000
			System.out.print(feb + " ");
			if ((feb % 2) == 0) {// 判断是否为偶数
				summarize = summarize + feb;// 求和
			}

			n++;
			// 获得下一个
			feb = RabbitBorn.rabbitSolution(n);
		}
		System.out.println();

		return summarize;
	}

	public static void main(String[] args) {

		System.out.println(getFeb(4000000));

	}

}
