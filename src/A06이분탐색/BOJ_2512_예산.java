package A06이분탐색;

import java.util.*;
import java.io.*;
public class BOJ_2512_예산 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 지자체 개수
        int[] arr = new int[N]; // 지자체 별 요청금액
        int budget = Integer.parseInt(br.readLine()); // 총 예산

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).max().getAsInt();

        int left = min;
        int right = max;

        while (left <= max) {
            int mid = (left + max) / 2;
            int bdgt = budget;

            if (bdgt == mid) {

            }

        }



    }
}
