package A2DFS;

import java.util.*;
public class A01DFS {
    static List<List<Integer>> adjList;
    static boolean[] visited;
    public static void main(String[] args) {
//        방문할 수 있는 점이 여러 개인 경우, 정점번호가 작은 것을 먼저 방문
//        출발은 0부터 dfs로 방문 시 방문순서 -> 0,1,3,2,4
//        출발은 0부터 bfs로 방문 시 방문순서 -> 0,1,2,3,4
        int[][] nodes = {{0,2}, {0,1}, {1,3}, {2,3}, {2,4}};//출발은 0부터 한다고 내가 정함
//        데이터의 개수가 0~4 : 총 5개, 다섯개 리스트를 만든다?
//        0번째 리스트에 0이 갈 수 있는 곳(1,2), 1번째 리스트에 1이갈수잇는 곳, ...
//        미리 담아두고 복잡도 O(1) .get(2) -> 2가 갈 수 있는 곳

//        인접리스트를 활용하여 인접해있는 노드를 빠르게 접근하기 위해 만들었다.
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
        dfs(0);


    }
//    시작점이 매번 달라지니 재귀함수를 사용해보자
//    어떨 땐 0에서 시작하면 1,2 / 어떨땐 1에서 시작하면 0,3 ...
    static void dfs(int start){
        System.out.println(start);
        visited[start] = true;
//        인접리스트를 순회할 땐 보통 향상된 for문을 사용한다.
//        for문과 재귀가 어떻게 이루어지는지 이해하기!
        for (int a : adjList.get(start)) {
            if (!visited[a]) {
                dfs(a);
            }
        }

    }
}

// 백준 - DFSBFS (1260) -> DFS, BFS로 가능
// 백준 - 연결요소의개수 (11724) -> DFS로도 가능, BFS로도 가능
