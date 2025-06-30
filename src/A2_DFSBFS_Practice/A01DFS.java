package A2_DFSBFS_Practice;
import java.util.*;

public class A01DFS {
    static List<List<Integer>> adjList; // 인접리스트
    static List<List<Integer>> answer; //무엇일까

    public static void main(String[] args) {
//        1~10까지 노드가 존재
        int[][] nodes = {{1, 2}, {1, 3}, {2, 4}, {2, 5}, {3, 6}, {3,7}, {4,8}, {4,9}, {5,10}};
        adjList = new ArrayList<>();
//        1부터 시작할 경우 인접리스트 1개 더 넉넉하게 생성
        for (int i = 0; i < 11; i++) {
            adjList.add(new ArrayList<>());
        }

//        여기서는 1번이 루트노드라고 정해졌으므로, visited 제외 후 단방향 노드 설계
        for (int i = 0;)



    }

    static void dfs(int start, List<Integer> temp) {

    }
}
