package top.birdguo.algorithm.problem39;

public class Problem39 {

	public static void main(String[] args) {
		solution();
	}

	public static void solution() {
		for (int k = 1; k < 1001; k++) {
			for (int z = 1; z < 501; z++) {

				double x = Math.sqrt(Math.pow(k, 2) - Math.pow((k - z), 2)) - k;
				
				if (x>0) {
					double y = k - z - x;
					System.out.println(x + "  " + y);
				}
				

			}
		}
	}

}
