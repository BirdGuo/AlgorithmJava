package top.birdguo.algorithm.problem26;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Problem26 {

	public static void main(String[] args) {
		int max = 0;
		int dMax = 0;
		// int d = 7;
		// 由于计算的是分数，所以不可能出现无线不循环小数
		for (int d = 2; d < 1000; d++) {
			int r = 10;
			ArrayList<Integer> rmndrs = new ArrayList<Integer>();
			int c = 0;
			// 1%7=0...1
			// 10%7=1...3
			// 30%7=4...2
			// 20%7=2...6
			// 60%7=8...4
			// 40%7=5...5
			// 50%7=7...1
			// 变形版的辗转相除法
			while (!rmndrs.contains(r)) {// 不停取余数，如果余数已经存在过，则说明开始循环
				rmndrs.add(r);
				int k = r % d;
				System.out.println(r + " % " + d + "=" + (r / d) + "..." + k);
				r = 10 * k;
				c++;
			}
			System.out.println();
			int cycleLength = c - rmndrs.lastIndexOf(r);
			System.out.println(d + " c:" + c + " " + rmndrs.lastIndexOf(r) + " " + cycleLength);
			if (cycleLength > max) {
				max = cycleLength;
				dMax = d;
			}
		}
		System.out.println(dMax);
	}

	public static void fenShu() {

		double[] jihe = new double[1000];
		BigDecimal bigDecimal = new BigDecimal(1.0);
		for (int i = 2; i <= 100; i++) {

			// jihe
			BigDecimal bigDecimal2 = new BigDecimal(i);

			BigDecimal divide;
			try {
				divide = bigDecimal.divide(bigDecimal2);
				System.out.println(divide);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
