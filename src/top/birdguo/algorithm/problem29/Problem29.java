package top.birdguo.algorithm.problem29;

import java.math.BigDecimal;
import java.util.HashSet;

public class Problem29 {

	public static void main(String[] args) {

		solution(2, 100);

	}

	public static void solution(int min, int max) {

		BigDecimal maxBig = new BigDecimal(max);
		BigDecimal one = new BigDecimal(1);
		HashSet<BigDecimal> hashSet = new HashSet<BigDecimal>();
		// 如果BigDecimal为小于val返回-1，如果BigDecimal为大于val返回1，如果BigDecimal为等于val返回0
		for (BigDecimal i = new BigDecimal(min); i.compareTo(maxBig) < 1; i.add(one)) {
			for (int j = min; j <= max; j++) {
				BigDecimal pow = i.pow(j);
				hashSet.add(pow);
			}
		}

		System.out.println(hashSet.size());

	}

}
