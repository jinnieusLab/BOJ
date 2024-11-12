import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int []queue = new int[1000000];

        // 배열 초기화
        for (int i = 0; i < N; i++) {
            queue[i] = i+1;
        }

        int gap = N-1;
        int i = 1;

        while(gap>=2) {
            queue[i+gap] = queue[i];
            i = i + 2;
            gap--;
        }

        i = i-2;
        gap++;

        System.out.println(queue[i+gap]);
    }
}