package top.birdguo.algorithm.problem33;

import top.birdguo.algorithm.divided.Divided;

public class Problem33 {

	public static void main(String[] args) {

		// System.out.println((double) 1 / 3);

		solution();

		// int maxDivisor = Divided.getMaxDivisor(1, 3);
		// System.out.println("maxDivisor：" + maxDivisor);

	}

	public static void solution() {

		// 这4个分数为：16/64=1/4；26/65=2/5；19/95=1/5；49/98=4/8.
		// i<j<k 10*a+c/10*c+b a<b<c
		int num = 1;
		int beichuNum = 1;
		for (int i = 1; i < 9; i++) {
			for (int j = i + 1; j < 10; j++) {
				for (int k = j + 1; k < 10; k++) {
					int x = i * 10 + k;
					int y = k * 10 + j;
					double result = (double) x / y;
					double resultNew = (double) i / j;

					if (result == resultNew) {
						num = num * i;
						beichuNum = beichuNum * j;
					}

				}

			}
		}
		int maxDivisor = Divided.getMaxDivisor(num, beichuNum);
		System.out.println(beichuNum / maxDivisor);

	}

}
