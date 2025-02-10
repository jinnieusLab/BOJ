import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int count = 0;

        // N! 숫자가 0 몇개 있는지 세는 문제
        for (int i = 1; i <= N; i++) {
            for (int five = 5; five <= i; five *= 5) {
                if(i % five == 0)
                    count++;
            }
        }

        System.out.println(count);
    }
}
