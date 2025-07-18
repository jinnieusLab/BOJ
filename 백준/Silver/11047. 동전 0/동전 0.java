import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int []arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        int multiplicand = K;

        for (int j = N-1; j>=0; j--) {
            int countOfEach;
            if (arr[j] > multiplicand)
                continue;

            countOfEach = multiplicand/arr[j];
            count += countOfEach;
            multiplicand -= countOfEach*arr[j];
        }

        System.out.println(count);

    }
}