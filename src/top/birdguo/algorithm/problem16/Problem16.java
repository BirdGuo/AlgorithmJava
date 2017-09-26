package top.birdguo.algorithm.problem16;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Problem16 {

	public static void main(String[] args) {

		long begin = System.currentTimeMillis();
		Long splitAndAdd = splitAndAdd(power(2, 1000));
		long end = System.currentTimeMillis();
		System.out.println(splitAndAdd);

	}

	public static Long splitAndAdd(String string) {

		Long result = 0L;
		for (int i = 0; i < string.length(); i++) {
			result += Character.digit(string.charAt(i), 10);

		}
		return result;
	}

	private static String power(double base, int exponent) {

		BigDecimal r = BigDecimal.valueOf(base);
		r = r.pow(exponent).stripTrailingZeros();
		String m_string = r.toPlainString();
		if (m_string.charAt(0) == '0')
			m_string = m_string.substring(1);
		return m_string;
	}
}
