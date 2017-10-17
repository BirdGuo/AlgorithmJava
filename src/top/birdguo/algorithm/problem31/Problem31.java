package top.birdguo.algorithm.problem31;

public class Problem31 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(coin_counts(200));

	}

	public static int coin_counts(int n) {
		int[] coins = { 1, 5, 10, 20, 50, 100, 200 };
		int[] dp = new int[100001];
		dp[0] = 1;
		for (int i = 0; i < 7; ++i) {
			for (int j = coins[i]; j <= n; ++j) {

				System.out.println(i + " " + j + " " + dp[j] + " " + coins[i] + " " + dp[j - coins[i]]);
				dp[j] = dp[j] + dp[j - coins[i]];
			}
		}
		return dp[n];
	}
}
