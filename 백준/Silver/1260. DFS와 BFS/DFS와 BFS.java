import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, M, V;
    static List<Integer>[] adj;
    static boolean[] visited;
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st1.nextToken());
        M = Integer.parseInt(st1.nextToken());
        V = Integer.parseInt(st1.nextToken());

        adj = new ArrayList[N+1];

        for (int i = 1; i <= N; i++)
            // 각 배열 요소 = 또 다른 새 ArrayList
            adj[i] = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            StringTokenizer st_M = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st_M.nextToken());
            int b = Integer.parseInt(st_M.nextToken());
            adj[a].add(b);
            adj[b].add(a);
        }

        // 배열 정렬 (Collections)
        for (int i = 1; i <= N; i++) {
            Collections.sort(adj[i]);
        }

        // DFS
        visited = new boolean[N+1];
        dfs(V);
        result.append("\n");

        // BFS
        visited = new boolean[N+1];
        bfs(V);

        System.out.println(result);

    }

    // 재귀
    static void dfs(int v) {
        visited[v] = true;
        result.append(v).append(" ");

        for (int node : adj[v]) {
            if (!visited[node])
                dfs(node);
        }
    }

    // 큐
    static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        visited[start] = true;
        q.add(start);

        while(!q.isEmpty()) {
            int v = q.poll();
            result.append(v).append(" ");

            for (int node : adj[v]) {
                if(!visited[node]) {
                    visited[node] = true;
                    q.add(node);
                }
            }
        }
    }
}