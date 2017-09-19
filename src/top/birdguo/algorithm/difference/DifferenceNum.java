package top.birdguo.algorithm.difference;

public class DifferenceNum {

	public static Long diference(Long num) {

		Long resultSqure = 0L;
		Long resultSumSqure = 0L;
		Long resultdiffSqure = 0L;

		Long sum = ((1 + num) * num) / 2;
		resultSumSqure = (long) Math.pow(sum, 2);
		
		for (int i = 1; i <= num; i++) {
//			resultSqure = resultdiffSqure+i
		}

		return resultdiffSqure;
	}

	public static void main(String[] args) {

	}

}
