package top.birdguo.algorithm.divided;

public class Divided {

	/**
	 * 获取最大公约数
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static Long getMaxDivisor(Long a, Long b) {
		Long m = a % b;
		while (m != 0) {
			a = b;
			b = m;
			m = a % b;
		}
		return b;
	}

	/**
	 * 获取最小公倍数
	 * 比如 6与8，最大公约数为2，最小公倍数为（6/2）*8 = 24 化简得 6*8/2 = 24
	 * @param a
	 * @param b
	 * @return
	 */
	public static Long getMinMult(Long a, Long b) {

		Long maxMult = getMaxDivisor(a, b);
		return ((a * b) / maxMult);

	}

	public static void main(String[] args) {
		Long a = 1L;
		for (Long i = 1L; i < 21; i++) {
			a = getMinMult(a, i);
		}
		System.out.println(a);

	}

}
