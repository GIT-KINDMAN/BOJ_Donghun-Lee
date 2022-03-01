package BOJ_1260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class test {
    static boolean[] visited;
    static int[][] graph;
    static int V, E, start;
    // static Queue<Integer> q = new LinkedList<>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());
        
        graph = new int[V+1][E+1];
        visited = new boolean[V+1];

        // 그래프 초기화. 인접행렬, 대칭. V와 E라는 정점과 간선 얘기지만, 간선 또한 대칭으로 정점과 정점의 연결을 표현하므로...
        for (int i=1; i<=E; i++) {
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            graph[n1][n2] = 1;
            graph[n2][n1] = 1;
        }

        dfs(start);
        Arrays.fill(visited, false);
        System.out.println();
        bfs(start);
        br.close();
    }

    static void dfs(int v) {
        visited[v] = true;
        System.out.print(v+" ");

        for (int i=1; i<=V; i++) {
            if(graph[v][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }

    static void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(v);
        visited[v] = true;

        while (!q.isEmpty()) {
            // int temp = q.poll();
            v = q.poll();
            // System.out.print(temp+" ");
            System.out.print(v+" ");
            for (int i=1; i<=V; i++) {
                if(graph[v][i] == 1 && !visited[i]) {
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }
        // q.clear();
    }
}