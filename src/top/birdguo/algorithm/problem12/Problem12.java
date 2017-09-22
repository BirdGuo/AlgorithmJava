package top.birdguo.algorithm.problem12;

public class Problem12 {

	/**
	 * 生成有num个月数的三角形数
	 * 
	 * @param num
	 * @return
	 */
	public static Long createTNWithDN(Long num) {

		Long result = 1L;

		if (num.equals(1)) {
			result = 1L;
		} else {
			for (Long i = 1L; i < Long.MAX_VALUE; i++) {
				// 计数从2开始，除1以外所有数都能被1和自身整除
				Long count = 2L;
				// 生成三角形数
				result = (i * (i + 1)) / 2;
				// 判断开方后是否为整数
				if (result % Math.sqrt(result) == 0) {
					// 为整数就+1
					count++;
				}
				// 从2开始循环
				for (int j = 2; j < Math.sqrt(result); j++) {
					// 当三角形数能被整除时，它肯定能被另一个数整除 k = result/j 且k>Math.sqrt(result)
					if (result % j == 0) {
						// 计数+2
						count += 2;
					}
				}

				if (count > num) {
					break;
				}

			}
		}

		return result;
	}

	public static void main(String[] args) {

		long begin = System.currentTimeMillis();
		System.out.println(createTNWithDN(500L));

		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}

}
