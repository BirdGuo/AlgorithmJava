package top.birdguo.algorithm.narclssus;

public class Narclssus {

	/**
	 * 判断一个数是否为水仙花数
	 * 
	 * @param num
	 * @return
	 */
	public static boolean isNarclssus(int num) {

		if (num < 100 || num > 999) {
			return false;
		} else {

			int hundred = num / 100;
			int ted = (num % 100) / 10;
			int bit = num % 10;

			System.out.println("hundred:" + hundred + "   ted:" + ted
					+ "   bit:" + bit);

			int hund = (int) Math.pow(hundred, 3);
			int te = (int) Math.pow(ted, 3);
			int bi = (int) Math.pow(bit, 3);

			if (num == (hund + te + bi)) {
				return true;
			} else {
				return false;
			}

		}

	}

	public static void main(String[] args) {

		System.out.println(isNarclssus(100));

	}

}
