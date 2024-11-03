import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int []position = new int[2*T];
        int [][] result = new int[1000000][14];

        for (int i = 0; 2*i+1 < 2*T; i++) {
            position[2*i] = Integer.parseInt(br.readLine());
            position[2*i+1] = Integer.parseInt(br.readLine());
        }

        // 0층 1호부터
        for (int i = 0; i < 14; i++) {
            result[0][i] = i+1;
        }
        
        // 1호
        for (int i = 1; i < 1000000; i++) {
            result[i][0] = 1;
        }

        // 1층 2호부터
        for (int k = 1; k < 1000000; k++) {
            for (int n = 1; n < 14; n++) {
                result[k][n] = result[k-1][n] + result[k][n-1];
            }
        }

        for (int i = 0; i < T; i++) {
            int k = position[2*i];
            int n = position[2*i+1];
            System.out.println(result[k][n-1]);
        }
    }

}
