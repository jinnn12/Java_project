package A4DP;

import java.util.Arrays;

public class A01계단오르기 {
//    프로그래머스 - 멀리 뛰기

//    백준 - 계단 오르기
//    1. (n-2)최댓값 + n의값
//    2. (n-3)최댓값 + n-1의 값 + n의 값
//    숫잣값이 들어 있는 arr(원본데이터), 각 스텝마다 트래킹 하도록 maxArr(최댓값)
//    식 a : maxArr[n-2] + arr[n]
//    식 b : maxArr[n-3] + arr[n-1] + arr[n]
//    maxArr[n] = Math.max(a,b);
//    maxArr 과 arr의 차이를 이해하자!
    public static void main(String[] args) {
        int[] arr = {0, 10, 20, 15, 25, 10, 20};
        int totalN = 6;

        int[] maxArr = new int[arr.length];

        if (totalN == 1) {
            maxArr[0] = arr[0];
        } else if (totalN == 2) {
            maxArr[1] = arr[1];
            maxArr[2] = arr[1] + arr[2];
        } else {
            maxArr[1] = arr[1];
            maxArr[2] = arr[1] + arr[2];
            for (int i = 3; i < maxArr.length; i++) {
                int a = maxArr[i - 2] + arr[i]; // index가 -로 되는 오류가 발생!
                int b = maxArr[i - 3] + arr[i - 1] + arr[i];
                maxArr[i] = Math.max(a, b);
                }

        }
        System.out.println(Arrays.toString(maxArr));







    }
}
