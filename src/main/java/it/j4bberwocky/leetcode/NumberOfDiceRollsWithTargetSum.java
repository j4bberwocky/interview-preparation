package it.j4bberwocky.leetcode;

/** See https://leetcode.com/problems/number-of-dice-rolls-with-target-sum/ */
public class NumberOfDiceRollsWithTargetSum {

    private static final int MOD = 1_000_000_007;

    public int numRollsToTarget(int d, int f, int target) {
        long[] dp = new long[target + 1];
        dp[0] = 1;
        for (int i = 1; i <= d; i++) {
            for (int j = target; j >= 0; j--) {
                dp[j] = 0;
                for (int k = 1; k <= f; k++) {
                    if (j >= k) {
                        dp[j] = (dp[j] + dp[j - k]) % MOD;
                    } else {
                        break;
                    }
                }
            }
        }

  //      System.out.println("Soluzione=" + dp[target] + " per d=" + d + " f=" + f + " target=" + target);
  //      for (int i = 0; i < dp.length; i++) {
  //          System.out.println("\t" + i + ": " + dp[i]);
  //      }

        return (int)dp[target];
    }
}
