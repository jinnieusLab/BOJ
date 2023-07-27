import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 입력
        int count = 0;

        while (N>0) {
            if (N % 5 == 0) {
                count += N / 5;
                System.out.println(count);
                return;
            }
            if (N<2){
                System.out.println(-1);
                return;
            }
            N-=3;
            count++;
        }
        System.out.println(count);
    }
}