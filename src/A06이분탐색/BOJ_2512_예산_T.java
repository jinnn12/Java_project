package A06이분탐색;
import java.util.*;
import java.io.*;
public class BOJ_2512_예산_T {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] stArr = br.readLine().split(" ");
//        485
        int target = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i=0; i<stArr.length; i++){
//            120 110 140 150
            arr[i] = Integer.parseInt(stArr[i]);
        }
        int min = 1;
        int max = Arrays.stream(arr).max().getAsInt();
        int answer = 0;
//        484
        int totalMax = 0;
        for (int i=min; i<=max; i++){
            int total = 0;
            for (int j=0; j<arr.length; j++){
                int temp = arr[j] > i ? i : arr[j];
                total+=temp;
            }
            if(total < target){
                totalMax=total;
                answer=i;
            } else if (total==target) {
                totalMax=total;
                answer=i;
                break;
            } else if(total > target){
                break;
            }
        }
        System.out.println(answer);
    }
}
