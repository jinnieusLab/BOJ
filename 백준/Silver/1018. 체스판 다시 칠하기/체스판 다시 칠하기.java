import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] board = new char[N][M];

        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int minChanges = Integer.MAX_VALUE;

        // 8x8 board 영역 정하기
        for (int i = 0; i <= N-8; i++) {
            for (int j = 0; j <= M-8; j++) {
                // 시작 색을 W로 두었을 때
                int changes1 = countChanges(board, i, j, 'W');

                // 시작 색을 B로 두었을 때
                int changes2 = countChanges(board, i, j, 'B');
                minChanges = Math.min(minChanges, Math.min(changes1, changes2));
            }
        }

        System.out.println(minChanges);
    }

    static int countChanges(char[][] board, int x, int y, char startColor) {
        char currentColor = startColor;
        int changes = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(board[i+x][j+y] != currentColor)
                    changes++;

                currentColor = (currentColor == 'W') ? 'B' : 'W';
            }
            // 다음 줄 검사
            currentColor = (currentColor == 'W') ? 'B' : 'W';
        }
        return changes;
    }
}
