package A4DP;
import java.util.*;
import java.io.*;

public class BOJ_11053_가장긴증가하는부분수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N + 1];
        int[] dp = new int[N + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = 1;
        }

        int max = 1;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j < i; j++) {
                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            max = Math.max(dp[i], max);
        }
        System.out.println(max);


    }
}






//        int N = Integer.parseInt(br.readLine());
//        int[] arr = new int[N + 1];
//        int[] count = new int[N + 1];
//        Arrays.fill(count, 1);
//
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        for (int i = 1; i < N; i++) {
//            arr[i] = Integer.parseInt(st.nextToken());
//            count[i] = 1;
//        }
////        int countMax = 1;
//
//        for (int i = 1; i < N; i++) {
//            for (int j = 1; j < i; j++) {
//                if (arr[i] > arr[j]) {
//                    count[i] = Math.max(count[i], count[i] + 1);
////                    countMax = Math.max(count[j], countMax);
//
//                }
//            }
//
//        }
//        for (int a : count) {
//            System.out.println(a);
//        }






