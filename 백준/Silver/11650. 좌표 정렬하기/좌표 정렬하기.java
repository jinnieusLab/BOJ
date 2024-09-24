import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < 2; j++) {
//                arr[i][j] = Integer.parseInt(br.readLine());
//            }
//        }

//        Arrays.sort(arr, new Comparator<int[]>() {
//            public int compare(int[] e1, int[] e2) {
//                if (e1[0] == e2[0])
//                    return e1[1] - e2[1];
//                else return e1[0] - e2[0];
//            }
//        });

        Arrays.sort(arr, (e1, e2) -> {
            if(e1[0] == e2[0])
                return e1[1] - e2[1];

            else return e1[0] - e2[0];
        });

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }
}
