package A2DFS;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class A02AllOfCases {
    static List<List<Integer>> adjList;
    static List<List<Integer>> answer;

    public static void main(String[] args) {

//        1~10까지의 노드가 존재
        int[][] nodes = {{1, 2}, {1, 3}, {2, 4}, {2, 5}, {3, 6}, {3,7}, {4,8}, {4,9}, {5,10}};

        adjList = new ArrayList<>();

//        1부터 시작할 경우 인접리스트를 1개 더
        for (int i = 0; i < 11; i++) { // ????
            adjList.add(new ArrayList<>());
        }

//        여기서는 1번이 루트노드라고 정해졌기 때문에 visited 제외하고 단방향 노드로 설계
        for (int i = 0; i < nodes.length; i++) {
            adjList.get(nodes[i][0]).add(nodes[i][1]); //단방향으로만 해보장
        }
        System.out.println(adjList);

        for (int i = 0; i < adjList.size(); i++) {
            adjList.get(i).sort(Comparator.naturalOrder());
        }
        answer = new ArrayList<>();
        dfs(1, new ArrayList<>());
        System.out.println(answer);

    }

    static void dfs(int start, List<Integer> temp){
        temp.add(start);
        if (adjList.get(start).isEmpty()) {
            answer.add(temp);
        }
        for (int a : adjList.get(start)) {
                dfs(a, temp);
            temp.remove(temp.size() - 1); // 재귀가 호출되지 않는 시점에 -1 (마지막 8이후에 어떻게 될지 생각ㄱㄱ)
            }
        }

    }


