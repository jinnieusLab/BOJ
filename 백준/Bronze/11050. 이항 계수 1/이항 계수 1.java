import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[][] table = new int[11][1000];

        table[0][0] = 1;

        for (int i = 1; i < 11 ; i++) {
            table[i][0] = 1;
            for (int j = 1; j < 1000; j++) {
                if(table[i-1][j-1] == 0 && table[i-1][j] == 0)
                    break;
                table[i][j] = table[i-1][j-1] + table[i-1][j];
            }
        }

        System.out.println(table[N][K]);
    }
}