package A4DP;

import java.util.Arrays;

public class A02동전관련 {
    public static void main(String[] args) {
//        1, 4, 5의 숫자가 있을 때 조합하여 13를 만들 수 있는 조합 중 가장 짧은 조합의 길이
//        greedy로 문제를 풀 경우 : 5*2 + 1*3 => 5개 동전 써야 함
//        dfs, bfs -> 시간, 메모리 초과될 수 있다
//        DP로 풀 경우 : 4*2 + 5*1 = 3개 동전 // 결국 DP를 사용해야..

//        f(n) = Min(f(n-1), f(n-2)) ...  + 1

        int[] arr = {1, 4, 5};
        int target = 13;
        int[] minArr = new int[target + 1];

        Arrays.fill(minArr, Integer.MAX_VALUE);
        minArr[0] = 0;

            for (int i = 1; i <= target; i++) {
                for (int a : arr) {
                    if (i - a >= 0 && minArr[i - a] != Integer.MAX_VALUE) {
                        minArr[i] = Math.min(minArr[i], minArr[i - a] + 1);
                    }
                }
            }

            System.out.println("최소 동전 개수: " + minArr[target]);
            System.out.println("DP 배열: " + Arrays.toString(minArr));
        }
    }

//        백준 - 동전 2 (2294)



