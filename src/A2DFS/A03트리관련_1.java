package A2DFS;
import java.util.*;
import java.io.*;

public class A03트리관련_1 {
    static List<List<Integer>> adjList;
    static boolean[] visited;
    static int[] answer;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        visited = new boolean[N + 1];

        adjList = new ArrayList<>();
        for (int i = 0; i < N + 1; i++) {
            adjList.add(new ArrayList<>());
        }

        int start;
        int end;
        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());

            adjList.get(start).add(end);
            adjList.get(end).add(start);
        }

//        답을 저장할 answer초기화 - 부모 노드를 저장
        answer = new int[N + 1];
//        dfs 시작노드 : 1



    }

    static void dfs(int n) {
        visited[n] = true;
        for (int a : adjList.get(n)) {
            if (!visited[a]) {
                answer[a] = n;
                dfs(a);
            }
        }
    }
}
