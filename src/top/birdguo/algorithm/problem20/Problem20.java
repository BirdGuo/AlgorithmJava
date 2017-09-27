package top.birdguo.algorithm.problem20;

import java.math.BigDecimal;

import javax.xml.stream.events.Characters;

public class Problem20 {

	public static Long bigAdd() {

		BigDecimal result = new BigDecimal(1);
		BigDecimal count = new BigDecimal(1);
		BigDecimal hund = new BigDecimal(100);
		BigDecimal one = new BigDecimal(1);
		while (count.compareTo(hund) <= 0) {
			System.out.println(count);
			result = result.multiply(count);
			System.out.println(result);
			count = count.add(one);
			System.out.println();
		}

		String string = result.toString();

		return strAdd(string);
	}

	public static Long strAdd(String str) {

		Long result = 0L;

		for (int i = 0; i < str.length(); i++) {
			int digit = Character.digit(str.charAt(i), 10);
			result += digit;
		}

		return result;
	}

	public static void main(String[] args) {

		System.out.println(bigAdd());
	}

}
