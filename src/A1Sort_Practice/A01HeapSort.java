package A1Sort_Practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class A01HeapSort {
    public static void main(String[] args) {
        int[] arr = {7, 6, 5, 8, 3, 5, 9, 1, 6, 10, 0, 9};
//        최초 힙 구성
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            heapify(arr, i, arr.length);
        }

//        부모노드, 최하위노드 자리 바꾸며 재 heapify
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, 0, i);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));



    }

    static void heapify(int[] arr, int parent, int size) {
        int left = parent * 2 + 1;
        int right = parent * 2 + 2 ;
        int smallest = parent;

        if (left < size && arr[left] < arr[smallest]) {
            smallest = left;
        }

        if (right < size && arr[right] < arr[smallest]) {
            smallest = right;
        }

        if (smallest != parent) {
            int temp = arr[parent];
            arr[parent] = arr[smallest];
            arr[smallest] = temp;
            heapify(arr, smallest, size);
        }
    }

}





