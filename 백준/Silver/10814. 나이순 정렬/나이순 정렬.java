import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String [][] arr = new String [N][3];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
            arr[i][2] = Integer.toString(i);
        }

//        Arrays.sort(arr, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                if (o1[0] == o2[0])
//                    return o1[2] - o2[2];
//
//                else
//                    return o1[0] - o2[0];
//            }
//        });

        Arrays.sort(arr, (o1, o2) -> {
            if (o1[0].equals(o2[0]))
                    return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);

            else
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);

        });

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }
}