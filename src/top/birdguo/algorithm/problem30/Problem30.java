package top.birdguo.algorithm.problem30;

public class Problem30 {

	public static void main(String[] args) {

		oldSolution();

	}

	public static void oldSolution() {

		int result = 0;

		int sumTemp = 0;
		for (int i = 100; i <= 295245; i++) {

			sumTemp = 0;
			String sum = String.valueOf(i);

			for (int j = 0; j < sum.length(); j++) {
				char charAt = sum.charAt(j);

				Integer each = Integer.valueOf(String.valueOf(charAt));
				sumTemp += Math.pow(each, 5);
			}

			if (sumTemp == i) {
				result += sumTemp;
			}

		}

		System.out.println(result);

		// System.out.println(result);
	}

}
