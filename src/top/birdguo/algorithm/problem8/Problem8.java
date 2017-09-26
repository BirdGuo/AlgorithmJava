package top.birdguo.algorithm.problem8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Problem8 {

	public static void getMaxProduct(String num, int length, HashMap<Long, Integer[]> products) {

		int numLength = num.length();

		if (numLength < length) {
			return;
		} else if (numLength == length) {

		} else {

			ArrayList<String> numLocs = new ArrayList<String>();
			ArrayList<Long> results = new ArrayList<Long>();
			for (int i = 0; i <= (numLength - length); i++) {
				String numLoc = num.substring(i, i + length);
				if (!numLoc.contains("0")) {// 去除含有0的字符串
					// numLocs.add(numLoc);
					Integer[] a = new Integer[13];
					Long result = 1L;
					for (int j = 0; j < length; j++) {
						int digit = Character.digit(numLoc.charAt(j), 10);
						result = result * digit;
						a[j] = digit;
					}
					results.add(result);
					products.put(result, a);
				}
			}
			// sort为升序
			Collections.sort(results);
			Long key = results.get(results.size() - 1);
			Integer[] value = products.get(key);

			System.out.println(results.get(results.size() - 1));
			System.out.println(Arrays.toString(value));
		}
	}

	public static void name() {

	}

	public static void main(String[] args) {
		String origin = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";

		// int digit = Character.digit('9', 10);
		// System.out.println(digit);
		long begin = System.currentTimeMillis();
		HashMap<Long, Integer[]> products = new HashMap<>();
		getMaxProduct(origin, 13, products);
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
		// Iterator<Entry<Long, Integer[]>> iterator = products.entrySet().iterator();
		// while (iterator.hasNext()) {
		// Entry<Long, Integer[]> next = iterator.next();
		// System.out.println(next.getKey());
		// Integer[] value = next.getValue();
		// System.out.println(Arrays.toString(value));
		// System.out.println();
		// }
	}

}
