package top.birdguo.algorithm.problem10;

public class Problem10 {

    /**
     * 筛选法
     *
     * @param maxNum
     * @return
     */
    public static Long createPrimeWithMax(int maxNum) {

        boolean[] createPrime = createPrime(maxNum);
        Long result = 0L;
        for (int i = 0; i < createPrime.length; i++) {

            if (createPrime[i]) {
                result += i;
            }

        }

        return result;

    }

	/**
	 * 筛选法不是去判断一个数是否为质数，而是排除所有合数，剩下的就是质数
	 * @param maxNum
	 * @return
	 */
	public static boolean[] createPrime(int maxNum) {

        boolean[] primes = new boolean[maxNum + 1];

        for (int i = 0; i < primes.length; i += 2) {//所有偶数不是质数
            primes[i] = false;
        }

        for (int i = 1; i < primes.length; i += 2) {//所有奇数暂记为质数
            primes[i] = true;
        }

        primes[1] = false;//1不是素数


        for (int i = 3; i <= Math.sqrt(maxNum); i += 2) {//从3开始，
            if (primes[i])//如果为质数
                for (int j = i + i; j <= maxNum; j += i) {//所有i的倍数都不为质数
                    primes[j] = false;
                }
        }
		primes[2] = true;//2是素数，得放在这，不然会循环一遍偶数
        return primes;


    }

    public static void main(String[] args) {

        System.out.println(createPrimeWithMax(2000000));

    }

}
