package BOJ_1260;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        int[][] map = new int[E][E];
        boolean[] visited = new boolean[V];

        for(int i=0; i<V; i++){
            for(int j=0; i<V; j++) {
                map[i][j] = 0;
            }
        }
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            map[x][y] = 1;
            map[y][x] = 1; // 무방향 그래프 = 대칭행렬
        }

        dfs(start, map, visited);
    }

    static void dfs(int v, int[][] m, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + 1 + " ");

        for (int i = 1; i <= m.length - 1; i++) {
            if (!visited[i]) {
                dfs(i,m,visited);
            }
        }
    }
}
