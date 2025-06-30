package A1Sort;

import java.util.*;

public class A02HeapSortSolve {
    public static void main(String[] args) {
//        명예의 전당 : 프로그래머스
        int K = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        int[] min = new int[score.length];

        Queue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < score.length; i++) {
             pq.add(score[i]);
            if (pq.size() > K) {
                pq.poll();
            }
            min[i] = pq.peek();
            System.out.println(min[i]);
        }

//        야근 지수 : 프로그래머스


    }
}
