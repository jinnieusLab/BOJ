import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int cut = (int)(Math.round(n*0.15));
        int start = cut;
        int end = n-cut;
        int total = 0;

        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        for (int i = start; i < end; i++)
            total += arr[i];

        int avg = Math.round((float)total / (n - cut*2));

        System.out.print(avg);
    }
}