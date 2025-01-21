import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();

        final long mod = 1234567891;
        long sum = 0L;
        long r = 1L;

        for (int i=0; i<L; i++) {
            int alphabetInt = str.charAt(i) - 'a' + 1;
            sum = (sum + alphabetInt * r) % mod;
            r = (r * 31) % mod;
        }

        System.out.println(sum);
    }
}