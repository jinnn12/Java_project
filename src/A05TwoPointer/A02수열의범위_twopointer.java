package A05TwoPointer;

import java.util.Arrays;

public class A02수열의범위_twopointer {
//    프로그래머스 : 숫자의 표현
//    프로그래머스 : 연속된 부분 수열의 합
//    프로그래머스
    public static void main(String[] args) {
        int n = 15;
        int start = 1;
        int end = 1;
        int total = 1;
        int count = 0;
        while (start <= end && end <= n) {
            if (total == n) {
                count++;
                end++;
                total += end;
            } else if (total < n) {
                end++; // 당연히 end를 늘리고 total에 더해줘야지??
                total += end;
            } else {
                total -= start; // 현재 start값을 빼고 start++ 해야지
                start++;
            }
        }
        System.out.println(count);
}

}
