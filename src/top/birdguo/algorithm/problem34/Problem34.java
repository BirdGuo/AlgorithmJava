package top.birdguo.algorithm.problem34;

import top.birdguo.algorithm.problem24.Problem24;

public class Problem34 {

	public static void main(String[] args) {
		// System.out.println(Problem24.factorial(9) * 7);

		System.out.println(solution());

	}

	public static int solution() {

		int result = 0;
		for (int i = 10; i < 2540160; i++) {
			String value = String.valueOf(i);
			int num = 0;
			for (int j = 0; j < value.length(); j++) {
				int k = Integer.valueOf(String.valueOf(value.charAt(j)));
				num = num + Problem24.factorial(k);
				if (num == i) {
					// System.out.println("num:" + num);
					result += num;
				}
			}
		}

		return result;
	}

}
