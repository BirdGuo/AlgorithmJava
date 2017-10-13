package top.birdguo.algorithm.mult3And5;

public class Mult3And5 {

	public static int getMult3and5(int maxNum) {

		int a = 0;
		for (int i = 1; i < maxNum; i++) {

			if ((i % 3 == 0) || (i % 5 == 0)) {
				a = a + i;
			}

		}
		return a;

	}

	public static void main(String[] args) {

		System.out.println(getMult3and5(1000));

	}

}
