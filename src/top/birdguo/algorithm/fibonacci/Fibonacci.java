package top.birdguo.algorithm.fibonacci;

import top.birdguo.algorithm.rabbitborn.RabbitBorn;

public class Fibonacci {

	/**
	 * ���maValue����쳲�����������Ϊż�������ĺ�
	 * 
	 * @param maxValue
	 *            ���ֵ
	 * @return
	 */
	public static int getFeb(int maxValue) {

		// �����±�Ϊ2��ʼ
		int n = 2;
		// ������ֵ
		int summarize = 0;
		// ��һ����
		int feb = RabbitBorn.rabbitSolution(2);
		while (feb < maxValue) {// �ж��Ƿ�С��4000000
			System.out.print(feb + " ");
			if ((feb % 2) == 0) {// �ж��Ƿ�Ϊż��
				summarize = summarize + feb;// ���
			}

			n++;
			// �����һ��
			feb = RabbitBorn.rabbitSolution(n);
		}
		System.out.println();

		return summarize;
	}

	public static void main(String[] args) {

		System.out.println(getFeb(4000000));

	}

}
