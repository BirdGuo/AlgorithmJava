package top.birdguo.algorithm.problem39;

public class Problem39 {

	public static void main(String[] args) {
		solution();
	}

	public static void solution() {
		for (int k = 1; k < 1001; k++) {
			for (int z = 1; z < 501; z++) {

				double sqrt2 = Math.sqrt(2);

				double x = 0.5 * ((sqrt2 * (0.5 * (Math.pow((z - k), 2)) + 2 * k * z - Math.pow(k, 2)))
						- 0.5 * sqrt2 * (z - k));

				if (x < z && x > 0) {

					double y = k - z - x;

					if (y < z && y > 0) {
						System.out.println("k:" + k + "  x:" + x + "  y:" + y + "  z:" + z);
					}

				}

			}
		}
	}

}
