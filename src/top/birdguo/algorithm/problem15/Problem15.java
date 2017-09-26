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

	public static void main(String[] args) {

		System.out.println(latticePath(5, 5));

	}

}
