package A05TwoPointer;
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class BOJ_2470_두용액 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeats = Integer.parseInt(br.readLine());


        Arrays.sort(traits);

        int start = 0;
        int end = traits.length - 1;
        int nearest = Integer.MAX_VALUE;
        int[] answer = new int[2];

        while (start < end) {
            int sum = traits[start] + traits[end];
            if (Math.abs(sum) < nearest) {
                nearest = Math.abs(sum);
                answer[0] = traits[start];
                answer[1] = traits[end];
            }

            if (sum < 0) {
                start++;  // 합이 작으면 더 큰 값을 찾아야 하므로 start++
            } else {
                end--;    // 합이 크면 더 작은 값을 찾아야 하므로 end--
            }
        }

        System.out.println(answer[0] + " " + answer[1]);
    }
}




    }
}
