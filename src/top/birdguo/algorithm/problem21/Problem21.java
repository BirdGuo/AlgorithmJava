package top.birdguo.algorithm.problem21;

public class Problem21 {

	public static void main(String[] args) {
		int N = 300;

		// sum[i]表示i的所有真因数之和
		int[] sum = new int[N];

		for (int i = 1; i < N; i++) {
			sum[i] = 1;
		}

		// 在每一个下标是i的倍数的位置上加上i
		// 求出所有数的真因数之和
		for (int i = 2; i < N / 2; i++) {
			System.out.println("i:" + i);
			int j = i + i;
			System.out.println("j before:" + j);
			while (j < N) {
				System.out.println("sum[" + j + "] before:" + sum[j]);
				sum[j] += i;
				System.out.println("sum[" + j + "] after:" + sum[j]);
				j += i;
				System.out.println("j after:" + j);
			}
			System.out.println();
		}

		int result = 0;

		// 遍历sum，找出亲和数
		for (int i = 220; i < N; i++) {

			if (sum[i] > i && sum[i] < N && i == sum[sum[i]]) {

				// System.out.println(i + " " + sum[i] + " " + sum[sum[i]]);
				result += (sum[i] + i);
			}

		}

		System.out.println("result:" + result);
	}

}
