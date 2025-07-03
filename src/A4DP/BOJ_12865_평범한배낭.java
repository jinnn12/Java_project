package A4DP;
import java.util.*;
import java.io.*;

public class BOJ_12865_평범한배낭 {
    public static void main(String[] args) throws IOException{
//        N개의 물건
//        물건 -> 무게 : W, 가치 : V
//        배낭은 K만큼의 무게 넣을 수 있음. K >= W 여야 하는거고, V가 클수록 좋음
//        물품의 수(N) / 버틸 수 있는 무게 (K)
//        물품의 수 만큼(N) , 물건의 무게(W) / 물건의 가치(V)
//        출력 : 가치합의 최댓값



        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int bagMax = Integer.parseInt(br.readLine());
        int[] bagMaxArr = new int[bagMax + 1];

        int[] arr = new int[N + 1];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i < N + 1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }









    }
}
