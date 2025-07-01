package A2_DFSBFS_Practice;
import java.util.*;

public class A01BFS_Practice_2 {
    static List<List<Integer>> adjList;
    static final int NODE_CNT = 5;

    public static void main(String[] args) {
        int[][] arr = {{0, 1}, {0, 2}, {2, 3}, {2, 4}, {1, 3}};

        adjList = new ArrayList<>();

        for (int i = 0; i < NODE_CNT; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] a : arr) {
            adjList.get(a[0]).add(a[1]);
            adjList.get(a[1]).add(a[0]);
        }

        for (List<Integer> l : adjList) {
            l.sort(Comparator.naturalOrder());
        }

        bfs(0);

    }

    public static void bfs(int root) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[NODE_CNT];

        q.add(root);
        visited[root] = true;

        while (!q.isEmpty()) {
            int parentNode = q.poll();
            System.out.println(parentNode + " ");

            for (int childNode : adjList.get(parentNode)) {
                if (!visited[childNode]) {
                    q.add(childNode);
                    visited[childNode] = true;

                }
            }
        }
    }



}

