package top.birdguo.algorithm.problem40;

public class Problem40 {

	public static void main(String[] args) {

		solution();

	}

	public static void solution() {

		System.out.println(getAllNumSize(2));

	}

	public static void getNumByIndex(int index) {

		int a = 1;
		int temp = 0;
		for (int i = 2;; i++) {
			int allNumSize = getAllNumSize(i);
			int allNumSize2 = getAllNumSize(i - 1);
			if (index < allNumSize && index > allNumSize2) {
				a = i;
				temp = allNumSize;
				break;

			}
		}
		
		

	}

	/**
	 * 
	 * @param i
	 * @return
	 */
	public static int getAllNumSize(int i) {

		int num = 0;
		for (int j = 0; j <= i; j++) {

			num += j * 9 * Math.pow(10, j - 1);

		}

		return num;
	}

}
