package top.birdguo.algorithm.problem32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Problem32 {

	public static void main(String[] args) {

		solution();

	}

	public static void solution() {

		// int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		ArrayList<Boolean> numList = new ArrayList<Boolean>();

		numList.add(true);
		numList.add(true);
		numList.add(true);

		numList.add(true);
		numList.add(true);
		numList.add(true);

		numList.add(true);
		numList.add(true);
		numList.add(true);

		int count = 0;
		for (int c = 1234; c <= 9876; c++) {//效率太低，应该是有9*8*7*6=3024次

			String cStr = String.valueOf(c);
			Integer first = Integer.valueOf(String.valueOf(cStr.charAt(0)));
			Integer second = Integer.valueOf(String.valueOf(cStr.charAt(1)));
			Integer third = Integer.valueOf(String.valueOf(cStr.charAt(2)));
			Integer forth = Integer.valueOf(String.valueOf(cStr.charAt(3)));

			System.out.println("forth:"+forth);
			
			numList.set((first - 1), false);
			numList.set((second - 1), false);
			numList.set((third - 1), false);
			numList.set((forth - 1), false);

			int[] restNum = new int[5];
			count = 0;
			for (int i = 0; i < numList.size(); i++) {
				if (numList.get(i) == true) {

					restNum[count] = (i + 1);
					count++;
				}
			}

			ArrayList<Integer> cobNum = new ArrayList<Integer>();

			for (int i = 0; i < restNum.length; i++) {
				cobNum.add(restNum[i]);
				for (int j = 0; j < restNum.length; j++) {
					if (j != i) {
						cobNum.add(restNum[i] * 10 + restNum[j]);
					}
				}
			}

			for (int i = 0; i < cobNum.size(); i++) {
				Integer integer = cobNum.get(i);

				if (integer != 0 && (c % integer) == 0) {
					System.out.println(c + " " + integer);
					System.out.println(c / integer);
				}

			}

		}

	}

}
