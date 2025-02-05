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
            char[] num_char = num_string.toCharArray();

            for (int j = 0; j+2 < num_char.length; j++) {
                if (num_char[j] == '6')
                    if(num_char[j+1] == '6')
                        if(num_char[j+2] == '6'){
                            arr[i] = num;
                            i++;
                            break;
                        }
            }

            num++;
        }

        System.out.println(arr[N-1]);
    }
}