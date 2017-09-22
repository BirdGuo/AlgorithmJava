package top.birdguo.algorithm.problem14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Problem14 {

	public static void collatz(Long max) {

		HashMap<Long, Long> colZMap = new HashMap<Long, Long>();

		ArrayList<Long> lengths = new ArrayList<Long>();

		for (Long i = max; i > 1; i--) {// 从最大数开始
			// 序列头一位
			Long num = i;
			// 最后一位是1，不计入循环中，所以直接从1开始
			Long length = 1L;

			// 不能等于1，不然会进死循环
			while (num > 1) {
				if (num % 2 == 0) {// 偶数
					num = num / 2;
				} else {// 奇数
					num = 3 * num + 1;
				}
				// 长度+1
				length++;
			}
			// 将长度加入序列中
			colZMap.put(length, i);
			lengths.add(length);
		}

		// 排序
		Collections.sort(lengths);
		Long key = lengths.get(lengths.size() - 1);

		Long result = colZMap.get(key);
		// return colZMap.get(lengths.get(lengths.size() - 1));
		System.out.println("result:" + result + "  " + key);
	}

	public static void main(String[] args) {

		long begin = System.currentTimeMillis();
		collatz(1000000L);
		long end = System.currentTimeMillis();

		System.out.println(end - begin);

	}

}
