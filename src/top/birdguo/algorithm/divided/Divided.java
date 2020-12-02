package top.birdguo.algorithm.divided;

public class Divided {

	/**
	 * 获取最大公约数
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int getMaxDivisor(int a, int b) {
		int m = a % b;
		while (m != 0) {
			a = b;
			b = m;
			m = a % b;
		}
		return b;
	}

	/**
	 * 获取公倍数
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int getMinMult(int a, int b) {

		int maxMult = getMaxDivisor(a, b);
		return ((a * b) / maxMult);

	}

	/**
	 * 首先获取两个数的最大公约数，比如 6与8，最大公约数为2，最小公倍数为（6/2）*8 = 24
	 * 问题再
	 */
	public static void dividedNum(){}

	public static void main(String[] args) {
		int a = 1;
		for (int i = 1; i < 21; i++) {

			System.out.println("===i="+i);

			a = getMinMult(a, i);
		}
		System.out.println(a);
	}

}
