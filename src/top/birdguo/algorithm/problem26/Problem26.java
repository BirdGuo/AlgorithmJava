package top.birdguo.algorithm.problem26;

import java.math.BigDecimal;

public class Problem26 {

	public static void main(String[] args) {

		fenShu();

		
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
