import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long[] arr = new long[10000];
        arr[0] = 666;
        long num = 1666;

        int i = 1;

        while (i < N) {
            String num_string = Long.toString(num);

            if(num_string.contains("666")){
                arr[i] = num;
                i++;
            }
                
            num++;
        }

        System.out.println(arr[N - 1]);
    }
}
