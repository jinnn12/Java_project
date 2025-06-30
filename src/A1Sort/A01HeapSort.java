package A1Sort;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.*;

public class A01HeapSort {
    public static void main(String[] args) {
        int[] arr = {7, 6, 5, 8, 3, 5, 9, 1, 6};
//        최초 힙 구성 : 복잡도 O(n log n)
        for (int i = arr.length/2 - 1; i >= 0; i--) {
            heapify(arr, i, arr.length); // for문이 돌아도 어차피 고정 최초힙 length이므로 arr.length
        }

//        루트노드, 최하위노드 자리 change해 가면서 재heapify
        for (int i = arr.length-1;  i >= 0 ; i--) { // 0번째 index와 마지막 index의 자리 change
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, 0, i);
        }
//        System.out.println(Arrays.toString(arr));
//        최초 힙 구성 : O(n log n)
        Queue<Integer> pq = new PriorityQueue<>(Arrays.asList(7, 6, 5, 8, 3, 5, 9, 1, 6)); // 집어넣는 순간 힙 구조를 유지
        System.out.println(pq.poll()); // 하나 꺼내면 heapify 다시해야돼 -> log (n)
        pq.add(6); // log n
//        값이 지속적으로 add되고 poll되고 어쩌고 되면 pq를 사용하도록 하자.

    }

    static void heapify(int[] arr, int parent, int length) {
//        자식 노드와의 비교 : 왼쪽 자식인덱스(parent index * 2 +1) 오른쪽 자식인덱스(parent index *2 +2)
//        int smallest = arr[parent];
        int left = parent*2 + 1;
        int right = parent*2 + 2;
        int smallest = parent;

//        자식이 더 작으면 자리 change가 발생해야 함
        if (left < length && arr[left] < arr[smallest]) {
            smallest = left;
        }

        if (right < length && arr[right] < arr[smallest]) {
            smallest = right;
        }

        if (parent != smallest) {
            int temp = arr[parent];
            arr[parent] = arr[smallest];
            arr[smallest] = temp;
            heapify(arr, smallest, length);
        }




//        비교를 했을 때 만약 자리 체인지가 발생하면 재귀적 호출
//        heapify(arr, 바뀐자리 자식 노드 index);

    }

}
