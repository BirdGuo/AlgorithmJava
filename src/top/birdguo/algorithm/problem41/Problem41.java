package top.birdguo.algorithm.problem41;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import top.birdguo.algorithm.prime.PrimeNumCount;

public class Problem41 {

	public static void main(String[] args) {
		solution();
	}

	public static void solution() {

		String nine = "9";
		char[] chs = { '9', '8', '7', '6', '5', '4', '3', '2', '1' };

		boolean isEnd = false;
		int i = 0;
		while (!isEnd) {
			ArrayList<String> nums = new ArrayList<>();
			// type type = (type) en.nextElement();
			permutation(chs, i, nums);

			for (String str : nums) {
				// System.out.println(integer);
				// boolean prime = PrimeNumCount.isPrime(integer);
				// if (prime) {
				// System.out.println(integer);
				// }
				
				String aString = str.substring(i, str.length() );
				Integer valueOf = Integer.valueOf(aString);
				
				if (PrimeNumCount.isPrime(valueOf)) {
					System.out.println("prime:"+valueOf+" "+i);
					isEnd = true;
					break;
				}
			
			}

			i++;
		}
		// combiantion(chs);
//		permutation(chs, 0, nums);

//		System.out.println("nums:" + nums.size());

		// Collections.sort(nums);

	}

	/**
	 * 排列
	 * 
	 * @param ss
	 * @param i
	 *            从第几位开始
	 */
	public static void permutation(char[] ss, int i, ArrayList<String> nums) {

		if (ss == null || i < 0 || i > ss.length) {
			return;
		}
		if (i == ss.length) {
			// System.out.println("ddd:" + new String(ss));
			// nums.add(Integer.valueOf(new String(ss)));
			nums.add(new String(ss));
		} else {
			for (int j = i; j < ss.length; j++) {
				char temp = ss[j];// 交换前缀,使之产生下一个前缀
				ss[j] = ss[i];
				ss[i] = temp;
				permutation(ss, i + 1, nums);
				temp = ss[j]; // 将前缀换回来,继续做上一个的前缀排列.
				ss[j] = ss[i];
				ss[i] = temp;
			}
		}
	}

	/**
	 * 组合
	 * 
	 * @param chs
	 */
	public static void combiantion(char chs[]) {
		if (chs == null || chs.length == 0) {
			return;
		}
		List<Character> list = new ArrayList();
		for (int i = 1; i <= chs.length; i++) {
			combine(chs, 0, i, list);
		}
		System.out.println(list.size());
	}

	// 从字符数组中第begin个字符开始挑选number个字符加入list中
	public static void combine(char[] cs, int begin, int number, List<Character> list) {
		if (number == 0) {
			System.out.println(list.toString());
			return;
		}
		if (begin == cs.length) {
			return;
		}
		list.add(cs[begin]);
		combine(cs, begin + 1, number - 1, list);
		list.remove((Character) cs[begin]);
		combine(cs, begin + 1, number, list);
	}

}
