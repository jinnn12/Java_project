package A4DP;

import java.util.*;
public class BOJ_2294_동전2 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 12};
        int target = 15;
        int[] dp = new int[target + 1];

        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i <= target; i++) {
            for (int a : arr) {
                if (i - a >= 0 && dp[i - a] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - a] + 1);
                }
            }
        }
        System.out.println("15를 만들기 위한 최소 : " + dp[target]);

    }
}
