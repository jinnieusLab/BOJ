import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            String[][] cases = new String[n][2];

            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String dressName = st.nextToken();
                String dressType = st.nextToken();
                cases[j][0] = dressName;
                cases[j][1] = dressType;
            }

            Arrays.sort(cases, (a, b) -> {
                int cmp = a[1].compareTo(b[1]);

                if (cmp == 0) return a[0].compareTo(b[0]);

                return cmp;
            });

            result.append(findOutfitNum(cases, n)).append("\n");
        }

        System.out.print(result);
    }

    static int findOutfitNum(String[][] arr, int n) {
        if (n==0) return 0;

        int multiplicand = 1;
        int count = 1;

        for (int i = 1; i < n; i++) {
            if(arr[i-1][1].equals(arr[i][1]))
                count++;

            else {
                multiplicand *= (count+1);
                count = 1;
            }
        }

        // 마지막 경우 반영
        multiplicand *= (count+1);

        return multiplicand - 1;
    }
}