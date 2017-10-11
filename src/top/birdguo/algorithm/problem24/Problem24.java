package top.birdguo.algorithm.problem24;

public class Problem24 {

	public static void main(String[] args) {
		// System.out.println(run());
		String s = "0123456789";
		String result = "";
		permutation1(s, result, s.length());
	}

	/*
	 * We initialize an array as the lowest permutation of the given digits, which
	 * is the sequence (0,1,2,3,4,5,6,7,8,9). Then we call the next permutation
	 * algorithm on it 999 999 times (because the index in the problem is 1-based),
	 * and stringify the resulting sequence.
	 * 
	 * The next permutation algorithm is well-known and a bit long to explain. See:
	 * https://www.nayuki.io/page/next-lexicographical-permutation-algorithm
	 */

	public static String run() {
		// Initialize
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++)
			array[i] = i;

		// Permute
		for (int i = 0; i < 999999; i++) {
			if (!nextPermutation(array))
				throw new AssertionError();
		}

		// Format output
		String ans = "";
		for (int i = 0; i < array.length; i++)
			ans += array[i];
		return ans;
	}

	public static boolean nextPermutation(int[] arr) {
		int i = arr.length - 1;
		for (; i > 0 && arr[i - 1] >= arr[i]; i--)
			;
		if (i <= 0)
			return false;
		{
			int j = arr.length - 1;
			for (; arr[j] <= arr[i - 1]; j--)
				;
			int temp = arr[i - 1];
			arr[i - 1] = arr[j];
			arr[j] = temp;
		}
		for (int j = arr.length - 1; i < j; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		return true;
	}

	public static void solve() {

		System.out.println(factorial(6));

		int max = 1000000;
		int firstNum = firstNum(max, 1);

		int firstNum2 = firstNum(max, firstNum);
		System.out.println(firstNum2);

	}

	public static int firstNum(int max, int except) {

		int factorial = factorial((10 - except));
		System.out.println((10 - except) + "的阶乘:" + factorial);

		int result = 1;
		int firstNum = 0;

		factorial = factorial * (except + 1);
		System.out.println((10 - except) + "的阶乘 * " + except + ":" + factorial);
		for (int i = 1; i <= 10; i++) {

			if (i == except) {
				continue;
			} else {
				result = factorial * i;
				if (result >= max) {
					firstNum = i - 1;
					break;
				}
			}
		}

		System.out.println(result);

		return firstNum;
	}

	/**
	 * n的阶乘
	 * 
	 * @param n
	 * @return
	 */
	public static int factorial(int n) {

		int result = 1;
		for (int i = 2; i <= n; i++) {
			result = result * i;
		}

		return result;

	}

	public static void permutation1(String str, String result, int len) {
		/*
		 * 全排列 递归实现 递归树： str: a b c ab ac ba bc ca cb result: abc acb bac bca cab cba
		 */

		// 结果 开始传入"" 空字符进入 len 是这个数的长度
		int count = 0;
		if (result.length() == len) { // 表示遍历完了一个全排列结果

			count++;

			System.out.println(result);
			if (count >= 1000000) {
				return;
			}

		} else {
			for (int i = 0; i < str.length(); i++) {
				/**
				 * 字符串的IndexOf()方法搜索在该字符串上是否出现了作为参数传递的字符串,如果找到字符串,则返回字符的起始位置
				 * (0表示第一个字符,1表示第二个字符依此类推)如果说没有找到则返回 -1 返回 String 对象内第一次出现子字符串的字符位置。
				 * [code=csharp]public indexOf(value:String, [startIndex:Number]) :
				 * Number[/code] 搜索字符串，并返回在调用字符串内 startIndex 位置上或之后找到的 value
				 * 的第一个匹配项的位置。此索引从零开始，这意味着字符串中的第一个字符被视为位于索引 0 而不是索引 1 处。如果未找到 value，该方法会返回 -1。
				 */
				// 判断是否出现过
				if (result.indexOf(str.charAt(i)) < 0) { // 返回指定字符在此字符串中第一次出现处的索引。
					permutation1(str, result + str.charAt(i), len);
				}
			}
		}

	}

	public static void fullPermutation() {

		char[] test = { 'a', 'b', 'c' };

		// for (int i = 1; i <= 3; i++) {
		//
		//// System.out.println("i:" + i);
		// for (int j = 1; j <= 3; j++) {
		// if (j == i) {
		// continue;
		// } else {
		//// System.out.println("i:" + i + " j:" + j);
		// for (int k = 1; k <= 3; k++) {
		// if (k == i || k == j) {
		// continue;
		// } else {
		// System.out.println(i + " " + j + " " + k);
		// }
		// }
		// }
		//
		// }
		//
		// }

	}

}
