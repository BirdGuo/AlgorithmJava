package top.birdguo.algorithm.difference;

public class DifferenceNum {

	public static Long diference(Long num) {

		Long resultSqure = 0L;
		Long resultSumSqure = 0L;
		Long resultdiffSqure = 0L;

		Long sum = ((1 + num) * num) / 2;
		resultSumSqure = (long) Math.pow(sum, 2);

		for (int i = 1; i <= num; i++) {
			resultSqure = (long) (resultSqure + Math.pow(i, 2));
		}

		resultdiffSqure = resultSumSqure - resultSqure;

		return resultdiffSqure;
	}

	public static void main(String[] args) {

		System.out.println(diference(100L));

	}

}
