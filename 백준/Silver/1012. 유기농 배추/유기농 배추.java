import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    static int[][] field;
    static int M, N, K;
    static int[] dx = {1,-1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            field = new int[N][M];

            for (int j = 0; j < K; j++) {
                StringTokenizer st_xy = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st_xy.nextToken());
                int y = Integer.parseInt(st_xy.nextToken());
                field[y][x] = 1;
            }

            int count = 0;
            for (int y = 0; y < N; y++) {
                for (int x = 0; x < M; x++) {
                    if(field[y][x] == 1) {
                        count++;
                        bfs(y,x);
                    }
                }
            }
            result.append(count).append("\n");
        }

        System.out.print(result);
    }

    static void bfs(int y, int x) {
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        field[y][x] = 0; // 방문
        queue.add(new int[]{y,x});

        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            int j = cur[0];
            int i = cur[1];

            for (int dir = 0; dir < 4; dir++) {
                int nextJ = j + dy[dir];
                int nextI = i + dx[dir];
                if (nextI>=0 && nextI<M && nextJ>=0 && nextJ<N && field[nextJ][nextI] == 1) {
                    field[nextJ][nextI] = 0; // 방문 확인
                    queue.add(new int[]{nextJ, nextI});
                }
            }
        }
    }
}