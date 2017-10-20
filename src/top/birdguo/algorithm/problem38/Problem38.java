package top.birdguo.algorithm.problem38;

import java.util.ArrayList;
import java.util.Collections;

public class Problem38 {

	public static void main(String[] args) {
		solution();
	}

	private static void solution() {

		String one = "1";
		String two = "2";
		String three = "3";
		String four = "4";
		String five = "5";
		String six = "6";
		String seven = "7";
		String eight = "8";
		String nine = "9";

		ArrayList<Integer> nums = new ArrayList<Integer>();

		StringBuilder stb = new StringBuilder("");
		for (int i = 1; i < 10000; i++) {

			for (int j = 1; j < 10; j++) {
				stb.append(String.valueOf(i * j));
				String resultStr = stb.toString();
				// System.out.println("result old :" + resultStr);
				if (resultStr.length() < 10 && resultStr.contains(one) && resultStr.contains(two)
						&& resultStr.contains(three) && resultStr.contains(four) && resultStr.contains(five)
						&& resultStr.contains(six) && resultStr.contains(seven) && resultStr.contains(eight)
						&& resultStr.contains(nine)) {

					// System.out.println("result:" + resultStr);
					nums.add(Integer.valueOf(resultStr));
				}
			}
			stb.delete(0, stb.length());
		}

		System.out.println(sortToBig(nums));

	}

	/**
	 * 从小到大排序，并返回最大值
	 * 
	 * @param nums
	 * @return
	 */
	public static Integer sortToBig(ArrayList<Integer> nums) {
		Collections.sort(nums);
		return nums.get(nums.size() - 1);
	}

}
