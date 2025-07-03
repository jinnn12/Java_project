package A05TwoPointer;
import java.util.*;
public class PRG_연속된부분수열의합 {
    public static void main(String[] args) {

        int k = 7;
        int[] sequence = {1, 2, 3, 4, 5};
        List<int[]> myList = new ArrayList<>();

        int start = 0;
        int end = start;

        while (start <= end) {
            int total = sequence[start] + sequence[end];
            if (total == k) {
                myList.add(new int[]{sequence[start], sequence[end]});
                start++;
            } else if (sequence[start] + sequence[end] > k) {

            }
        }

    }
}
