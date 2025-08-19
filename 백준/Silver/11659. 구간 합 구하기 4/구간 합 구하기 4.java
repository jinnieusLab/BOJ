import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] numbers;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer lineFirst = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(lineFirst.nextToken());
        int M = Integer.parseInt(lineFirst.nextToken());

        numbers = new int[N+1];

        StringTokenizer numbersInput = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            numbers[i] = Integer.parseInt(numbersInput.nextToken());
        }

        StringBuilder result = new StringBuilder();
        accumulate(N);

        for (int i = 0; i < M; i++) {
            StringTokenizer indices = new StringTokenizer(br.readLine());
            int indexI = Integer.parseInt(indices.nextToken());
            int indexJ = Integer.parseInt(indices.nextToken());
            result.append(rangeSum(indexI, indexJ)).append("\n");
        }

        System.out.print(result);
    }

//    bottom-up
    static void accumulate(int j) {
        for (int i = 1; i <= j; i++) {
            numbers[i] = numbers[i] + numbers[i-1];
        }
    }

    static int rangeSum(int i, int j) {
        return numbers[j] - numbers[i-1];
    }
}