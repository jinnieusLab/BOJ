import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int floors = sc.nextInt();
        int[] stairs = new int[floors+1];
        int[] dp = new int[floors+1];

        for (int i = 1; i <= floors; i++)
            stairs[i] = sc.nextInt();

        if (floors==1) {
            System.out.println(stairs[1]);
            return;
        }

        // 만약 총 계단 수가 1개일 때
        dp[1] = stairs[1];
        // 만약 총 계단 수가 2개일 때
        dp[2] = stairs[1] + stairs[2];

        for (int i = 3; i <= floors; i++) {
            dp[i] = Math.max(dp[i-2], dp[i-3] + stairs[i-1]) + stairs[i];
        }

        System.out.println(dp[floors]);
    }
}
