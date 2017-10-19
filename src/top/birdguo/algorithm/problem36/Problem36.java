package top.birdguo.algorithm.problem36;

public class Problem36 {

	public static void main(String[] args) {
		System.out.println(sol());
		// System.out.println(isHuiWen("585"));

	}

	public static int sol() {

		int num = 0;
		for (int i = 1; i < 1000001; i++) {

			if (isHuiWen(String.valueOf(i)) && isHuiWen(tenToTwo(i))) {
				// System.out.println(i);
				num += i;
			}

		}

		return num;
	}

	/**
	 * 十进制转二进制
	 * 
	 * @param num
	 * @return
	 */
	public static String tenToTwo(int num) {

		return Integer.toBinaryString(num);

	}

	/**
	 * 判断是否为回文数
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isHuiWen(String str) {

		StringBuilder stb = new StringBuilder(str);
		// 倒转
		stb.reverse();
		// 相同
		if (str.equals(stb.toString())) {
			return true;
		}

		return false;
	}

}
