package A2DFS;

import java.util.*;
import java.io.*;
public class A03트리관련 {
    static List<List<Integer>> graph;
    static boolean[] visited;
    static int[] answer;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 노드의 개수 N
        int N = Integer.parseInt(br.readLine());
        visited=new boolean[N+1];
        // 그래프 초기화
        graph=new ArrayList<>();
        for(int i=0; i<N+1; i++){ // 노드의 번호가 1부터이므로 N+1만큼 
            graph.add(new ArrayList<>());
        }
        // 간선 연결
        int start;
        int end;
        for(int i=0; i<N-1; i++){
            st=new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());
            // 양방향
            graph.get(start).add(end);
            graph.get(end).add(start);
        }
        // 답을 저장할 answer 초기화 - 부모 노드를 저장
        answer = new int[N+1];
        //dfs 불러오기 시작노드 : 1
        dfs(1);
        for(int i=2; i<N+1; i++){
            System.out.println(answer[i]);
        }

    }
    static void dfs(int n){
        visited[n]=true;
        for(int element : graph.get(n)){
            if(!visited[element]){
                answer[element]=n;
                dfs(element);
            }
        }
    }
}