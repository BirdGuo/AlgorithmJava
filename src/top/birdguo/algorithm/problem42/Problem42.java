package top.birdguo.algorithm.problem42;

import java.util.ArrayList;
import java.util.HashMap;

import top.birdguo.algorithm.problem22.Problem22;

public class Problem42 {

	public static void main(String[] args) {
		solution();
	}

	public static void solution() {

		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("A", 1);
		hashMap.put("B", 2);
		hashMap.put("C", 3);
		hashMap.put("D", 4);
		hashMap.put("E", 5);
		hashMap.put("F", 6);
		hashMap.put("G", 7);
		hashMap.put("H", 8);
		hashMap.put("I", 9);
		hashMap.put("J", 10);
		hashMap.put("K", 11);
		hashMap.put("L", 12);
		hashMap.put("M", 13);
		hashMap.put("N", 14);
		hashMap.put("O", 15);
		hashMap.put("P", 16);
		hashMap.put("Q", 17);
		hashMap.put("R", 18);
		hashMap.put("S", 19);
		hashMap.put("T", 20);
		hashMap.put("U", 21);
		hashMap.put("V", 22);
		hashMap.put("W", 23);
		hashMap.put("X", 24);
		hashMap.put("Y", 25);
		hashMap.put("Z", 26);

		String readTxtFile = Problem22.readTxtFile("E:\\p042_words.txt");
		String substring = readTxtFile.substring(1, readTxtFile.length() - 1);

		String[] split = substring.split("\",\"");

		ArrayList<Integer> results = new ArrayList<Integer>();
		for (String string : split) {

			int result = 0;
			for (int i = 0; i < string.length(); i++) {
				char charAt = string.charAt(i);
				Integer integer = hashMap.get(charAt + "");
				// System.out.println(charAt + "");
				result += integer;
			}

			// result = result * 2;

			double sqrt = Math.sqrt(result * 2 + 0.25);
			double a = sqrt - 0.5;
			// System.out.println("a:" + a);

			int b = (int) a;
			if (b == a) {
				System.out.println(b + "  " + a + "   " + result);
				results.add(result);
			}

			// int parseInt = Integer.parseInt(String.valueOf(a));
			// System.out.println("parseInt:" + parseInt);
			// Math.sqrt(result);

		}

		System.out.println("result size:" + results.size());
	}

}
