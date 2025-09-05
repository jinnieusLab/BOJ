import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        long[] p = new long[101];
        p[1] = 1;
        p[2] = 1;
        p[3] = 1;

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(sc.nextLine());

            for (int j = 4; j <= N; j++) {
                if (p[j] == 0)
                    p[j] = p[j-3] + p[j-2];
            }
            result.append(p[N]).append("\n");
        }

        System.out.print(result);
    }
}