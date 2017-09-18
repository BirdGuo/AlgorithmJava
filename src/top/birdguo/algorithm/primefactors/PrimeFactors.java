package top.birdguo.algorithm.primefactors;

import java.util.ArrayList;

import top.birdguo.algorithm.prime.PrimeNumCount;

public class PrimeFactors {

	public static ArrayList<Integer> getPrimeFactors(int num) {

		ArrayList<Integer> pfsArrayList = new ArrayList<Integer>();

		if (num <= 0) {

			pfsArrayList.add(-1);

		} else {
			if (PrimeNumCount.isPrime(num)) {

				pfsArrayList.add(1);
				pfsArrayList.add(num);

			} else {
				// ������С����
				int i = 2;

				// ����շת�����
				while (i <= num) {

					// ��num ������ i ����i ��num ��һ������
					if (num % i == 0) {

						pfsArrayList.add(i);
						// ͬʱ�� num����i ��ֵ���� num
						num = num / i;

						// ��i������Ϊ2
						i = 2;
					} else {

						// ���޷���������i ����
						i++;
					}
				}
			}
		}
		return pfsArrayList;

	}

	public static void main(String[] args) {

		Long begin = System.currentTimeMillis();

		for (int i = 1; i < 1000; i++) {

			// System.out.println(getPrimeFactors(i));

			for (Integer a : getPrimeFactors(i)) {
				System.out.print(a + " ");
			}
			System.out.println();

		}

		Long end = System.currentTimeMillis();

		System.out.println(end - begin);
	}

}
