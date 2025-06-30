package A2_DFSBFS_Practice;

import java.util.*;

public class A01BFS {
    static List<List<Integer>> adjList;
    static boolean[] visited;

    public static void main(String[] args) {
        int[][] nodes = {{0,2},{0,1}, {1,3}, {2,3}, {2,4}};
        adjList = new ArrayList<>();
        visited = new boolean[5];
        for (int i = 0; i < 5; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < nodes.length; i++) {
            adjList.get(nodes[i][0]).add(nodes[i][1]);
            adjList.get(nodes[i][1]).add(nodes[i][0]);
        }



//        Queue안에 Integer가 아닌 int[]를 담아 0번째는 노드번호, 1번째는 distance 설계 가능
        Queue<int[]> myQ = new LinkedList<>();
        int[] distance = new int[5];
        int target = 4;
        myQ.add(new int[]{0, 0});
        visited[0] = true;
        while (!myQ.isEmpty()) {
            int[] temp = myQ.poll();
            for (int a : adjList.get(temp[0])) {
                if (!visited[a]) {
                    myQ.add(new int[]{a, temp[1] + 1});
                    visited[a] = true;
                }
            }
        }

    }
}
