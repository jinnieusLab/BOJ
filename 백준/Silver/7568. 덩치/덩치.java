import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int [N][3];

        // 2차원 배열에 x, y 저장
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = 1;
        }

        // 덩치 등수 =  자신보다 더 큰 덩치 사람 수
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1])
                    arr[i][2]++;
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(arr[i][2]+" ");
        }
    }
}