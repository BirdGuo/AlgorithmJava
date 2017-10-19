package top.birdguo.algorithm.problem35;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import top.birdguo.algorithm.problem10.Problem10;

public class Problem35 {

	public static void main(String[] args) {

		LinkedHashMap<Integer, Boolean> test = new LinkedHashMap<>();
		test.put(1, false);

		Boolean boolean1 = test.get(2);

		System.out.println(boolean1);

	}

	public static void name() {
		//找到100W以内的素数
		boolean[] createPrime = Problem10.createPrime(1000000);
		//声明有序Map
		LinkedHashMap<Integer, Boolean> hashPrime = new LinkedHashMap<Integer, Boolean>();
		for (int i = 0; i < createPrime.length; i++) {
			if (createPrime[i]) {
				//重新组成都是都是素数的数组
				hashPrime.put(i, false);
			}
		}

		Iterator<Entry<Integer, Boolean>> iterator = hashPrime.entrySet().iterator();
		
		//遍历该数组
		while (iterator.hasNext()) {
			Entry<Integer, Boolean> next = iterator.next();
			Integer key = next.getKey();
			String valueOf = String.valueOf(key);
			ArrayList<String> nums = new ArrayList<String>();

			for (int i = 0; i < valueOf.length(); i++) {
				String num = String.valueOf(valueOf.charAt(i));
				nums.add(num);
			}
			
			

		}
	}

}
