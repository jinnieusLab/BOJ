import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, K;
        N = sc.nextInt();
        K = sc.nextInt();
        int[] arr = new int[1001];
        int[] result = new int [N];

        for (int i = 1; i <= N; i++) {
            arr[i] = i;
        }

        int idx = 1;

        for (int j = 0; j < N; j++) {
            for (int i = 0; i < K; idx++) {
                if (idx > N){
                    idx %= N;
                }

                if (arr[idx] == 0){
                    continue;
                }

                if (i == K-1){
                    result[j] = arr[idx];
                    arr[idx] = 0;
                }

                i++;
            }
        }

        System.out.print("<");
        for (int i = 0; i < N-1; i++) {
            System.out.print(result[i]+", ");
        }

        System.out.println(result[N-1]+">");
    }
}