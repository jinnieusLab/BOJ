import java.io.*;

public class Main {
    static int[][] memo = new int[41][2];

    public static int[] fibonacci(int n) {
        if (n == 0) {
            memo[0][0] = 1;
            memo[0][1] = 0;
        } else if (n == 1) {
            memo[1][0] = 0;
            memo[1][1] = 1;
        } else if (memo[n][0] == 0 && memo[n][1] == 0) {
            int[] fib1 = fibonacci(n - 1);
            int[] fib2 = fibonacci(n - 2);
            memo[n][0] = fib1[0] + fib2[0];
            memo[n][1] = fib1[1] + fib2[1];
        }
        return memo[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] result = fibonacci(n);
            sb.append(result[0]).append(" ").append(result[1]).append("\n");
        }

        System.out.print(sb);
    }
}