package top.birdguo.algorithm.prime;

public class PrimeNumCount {

	/**
	 * �ж�һ�����Ƿ�Ϊ����
	 * 
	 * @param num
	 * @return true ��������false ������
	 */
	public static boolean isPrime(int num) {

		boolean isPrim = true;

		switch (num) {
		case 0:// 0��������
			isPrim = false;
			break;
		case 1:// 1����������
			isPrim = false;
			break;
		case 2:// 2������
			isPrim = true;
			break;
		default:

			if (num % 2 == 0) {// ȥ��ż��
				isPrim = false;
			} else {

				// System.out.println("-----------------------");
				for (int i = 2; i <= Math.sqrt(num); i++) {
					// System.out.println("tt:"+i);
					if (num % i == 0) {
						isPrim = false;
						break;
					}
				}
			}

			break;
		}

		return isPrim;

	}

	public static void main(String[] args) {

		Long a = System.currentTimeMillis();
		System.out.println(a);
		int count = 0;
		for (int i = 0; i < 100; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
				count ++;
			}
		}

		System.out.println();
		
		System.out.println(count);
		
		Long b = System.currentTimeMillis();
		System.out.println(b);
		System.out.println("time:" + (b - a));

	}

}
