package top.birdguo.algorithm.problem9;

public class Problem9 {

	private static Long pythagorean(Long num) {
		Long half = (num / 2);
		for (Long a = 1L; a < half; a++) {
			for (Long b = (a + 1); b < half; b++) {
				Long c = num - a - b;
				if (c > b && c < (a + b)) {
					Long d = (a * a) + (b * b);
					Long cc = c * c;
					if (d == cc) {
						Long result = a * b * c;
						System.out.println("result:"+result);
						return result;

					}
				}

			}
		}
		
		return 0L;
	}

	public static void main(String[] args) {

		Long pythagorean = pythagorean(12L);

		System.out.println(pythagorean);
	}

}
