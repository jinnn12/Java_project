package A2BFS;

import java.util.*;

public class A01BFS {
    static List<List<Integer>> adjList;
    static boolean[] visited;
    public static void main(String[] args) {
        int[][] nodes = {{0,2}, {0,1}, {1,3}, {2,3}, {2,4}};
        adjList = new ArrayList<>();
        visited = new boolean[5];

        for (int i = 0; i < 5; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int i = 0; i < nodes.length; i++) {
//            단방향
            adjList.get(nodes[i][0]).add(nodes[i][1]);
//            양방향인 경우
            adjList.get(nodes[i][1]).add(nodes[i][0]);
        }
        System.out.println(adjList);

//        정점번호가 작은것부터 방문하기 위한 정렬
        for (int i = 0; i < adjList.size(); i++) {
            adjList.get(i).sort(Comparator.naturalOrder());
        }

        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.add(0);
        visited[0] = true; // Queue에 담을 때부터 true
        int target = 4;
        while (!myQueue.isEmpty()) {
            int temp = myQueue.poll();
            System.out.println(temp);
            for (int a : adjList.get(temp)) {
                if (!visited[a]) {
                    myQueue.add(a);
                    visited[a] = true; // queue에 담는 시점에 true로 세팅해야 중복해서 queue에 안 담김
                    if (target == a) {
                        break;
                    }
                }
            }
        }

//        System.out.println((최단거리)[4]);
    }
}
