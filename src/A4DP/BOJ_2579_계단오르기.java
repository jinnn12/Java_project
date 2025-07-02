package A4DP;
import java.util.*;
import java.io.*;

public class BOJ_2579_계단오르기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] stairPoint = new int[N + 1];
        int[] dp = new int[N + 1];

        for (int i = 1; i < N + 1; i++) {
            stairPoint[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = stairPoint[1]; // 시작점은 과연 같아도 될까? 한 번에 두 칸 오르는 경우도?

        if (N >= 2) {
            dp[2] = dp[1] + stairPoint[2];
        }

        if (N >= 3) {
            for (int i = 3; i <= N; i++) {
                dp[i] = Math.max(dp[i - 3] + dp[i - 1], dp[i - 2]) + stairPoint[i];
            }
        }
        System.out.println(dp[N]);




    }
}
