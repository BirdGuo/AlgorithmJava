package top.birdguo.algorithm.problem25;

import java.math.BigInteger;

public class Problem25 {

	public static void main(String[] args) {
		BigInteger[] bi = new BigInteger[40000000];
		bi[0] = new BigInteger("1");
		bi[1] = new BigInteger("1");
		for (int i = 2; i < bi.length; i++) {
			bi[i] = bi[i - 1].add(bi[i - 2]);
			if (("" + bi[i]).length() >= 1000) {
				System.out.println("i=" + i);
				System.out.println("bi[i]=" + bi[i]);
				break;
			}
		}
	}

}
