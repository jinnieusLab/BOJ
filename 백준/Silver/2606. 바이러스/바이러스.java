import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int total, pairs;
    static List<Integer>[] graph;
    static boolean[] checked;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        total = Integer.parseInt(br.readLine());
        pairs = Integer.parseInt(br.readLine());

        graph = new ArrayList[total+1];

        for (int i = 1; i <= total; i++)
            graph[i] = new ArrayList<>();

        for (int i = 0; i < pairs; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }

        checked = new boolean[total+1];
        dfs(1);
        System.out.println(count);
    }

    // 재귀
    static void dfs(int v) {
        checked[v] = true;

        for (int node : graph[v]) {
            if (!checked[node]) {
                count++;
                dfs(node);
            }
        }
    }
}