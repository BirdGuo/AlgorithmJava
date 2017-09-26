package top.birdguo.algorithm.problem15;

public class Problem15 {

	/**
	 * 效率太慢
	 * 
	 * @param m
	 * @param n
	 * @return
	 */
	public static Long latticePath(int m, int n) {
		if (m == 0 || n == 0)
			return 1L;
		else
			return latticePath(m, n - 1) + latticePath(m - 1, n);
	}

	/**
	 * 组合算法
	 * 
	 * A! 0!=1(n!表示n(n-1)(n-2)...1,也就是6!=6x5x4x3x2x1
	 * 
	 * C(n,m) = n!/(m!*(n-m)!)
	 * 
	 * @param n
	 * @param m
	 */
	public static int combination(int n, int m) {

		int k = 1;
		int a = 1;
		if ((n - m) > m) {
			k = n - m;
			a = m;
		} else {
			k = m;
			a = n - m;
		}

		int b = 1;
		for (int i = 2; i <= a; i++) {
			b = b * i;
		}

		int c = 1;
		for (int i = n; i > k; i--) {
			c = c * i;
		}

		int result = c / b;

		return result;
	}

	/**
	 * 使用组合计算n*m方块路径
	 * 
	 * 这里计算出的数不包括首尾的1，所以下标从1的后一位算起
	 * 
	 * n>=m
	 * 
	 * @param n
	 * @param m
	 */
	public static int latticePathWitCom(int n, int m) {

		if (n < m) {// 保持n>m
			int temp = n;
			n = m;
			m = temp;
		}

		// 重新构造n,m
		n = n + m;

		System.out.println(n + "   " + m);

		return combination(n, m);

	}

	public static void main(String[] args) {
		System.out.println(latticePathWitCom(4, 4));
	}

}
