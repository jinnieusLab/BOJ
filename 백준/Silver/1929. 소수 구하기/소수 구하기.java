import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M, N;
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        // boolean 초기값 false
        boolean []prime = new boolean[N+1];

        // 배열 인덱스가 그 숫자!!
        prime[0] = prime[1] = true;

        //2...의 배수 모두 제외
        // 소수인 것 false
        // 소수 아닌 것 true
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (prime[i] == true)
                continue;
            // i*i 즉 배수들을 걸러준다. true -> 소수 아님(합성수)
            for (int j = i*i; j < prime.length; j = j+i) {
                prime[j] = true;
            }
        }

        for (int k = M; k <= N; k++) {
            if (!prime[k])
                System.out.println(k);
        }
    }
}