//package top.birdguo.algorithm.problem43;

import java.util.ArrayList;

//import top.birdguo.algorithm.prime.PrimeNumCount;


public class Problem43 {

	public static void main(String[] args) {
		solution();
	}

	public static void solution() {

		char[] chs = { '9', '8', '7', '6', '5', '4', '3', '2', '1', '0' };
		ArrayList<String> nums = new ArrayList<String>();

//		Problem41.permutation(chs, 0, nums);

		Long result = 0L;
		for (String num : nums) {
			String sub1 = num.substring(1, 4);
			String sub2 = num.substring(2, 5);
			String sub3 = num.substring(3, 6);
			String sub4 = num.substring(4, 7);
			String sub5 = num.substring(5, 8);
			String sub6 = num.substring(6, 9);
			String sub7 = num.substring(7, 10);

			System.out.println(sub1+"   "+sub2);

//			if (!PrimeNumCount.isPrime(Integer.valueOf(sub1)) && !PrimeNumCount.isPrime(Integer.valueOf(sub2))
//					&& !PrimeNumCount.isPrime(Integer.valueOf(sub3)) && !PrimeNumCount.isPrime(Integer.valueOf(sub4))
//					&& !PrimeNumCount.isPrime(Integer.valueOf(sub5)) && !PrimeNumCount.isPrime(Integer.valueOf(sub6))
//					&& !PrimeNumCount.isPrime(Integer.valueOf(sub7))) {
				// System.out.println(num + " ");
//				result = result + Long.valueOf(num);
//			}

			if(((Integer.valueOf(sub1))%2==0)
				&&((Integer.valueOf(sub2))%3==0)&&((Integer.valueOf(sub3))%5==0)
				&&((Integer.valueOf(sub4))%7==0)&&((Integer.valueOf(sub5))%11==0)
				&&((Integer.valueOf(sub6))%13==0)&&((Integer.valueOf(sub7))%17==0)){
				
				System.out.println(num + " ");
				result = result + Long.valueOf(num);			
			}

		}

		System.out.println("result:" + result);

	}

}
