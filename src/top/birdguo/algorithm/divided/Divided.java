package top.birdguo.algorithm.divided;

public class Divided {

	/**
	 * ���Լ��
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	private static int getMaxDivisor(int a, int b) {
		int m = a % b;
		while (m != 0) {
			a = b;
			b = m;
			m = a % b;
		}
		return b;
	}

	/**
	 * ��С������
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	private static int getMinMult(int a, int b) {

		int maxMult = getMaxDivisor(a, b);
		return ((a * b) / maxMult);

	}

	public static void main(String[] args) {
		int a = 1;
		for (int i = 1; i < 21; i++) {
			a = getMinMult(a, i);
		}
		System.out.println(a);
	}

}
