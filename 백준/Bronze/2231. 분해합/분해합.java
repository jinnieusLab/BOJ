import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = 0;

        for (int i = 1; i < N; i++) {
            if(i + sumOfDigits(i) == N){
                M = i;
                break;
            }
        }

        System.out.println(M);
    }

    public static int sumOfDigits(int i) {
        if (i==0)
            return 0;
        else
            return i%10 + sumOfDigits(i/10);
    }
}