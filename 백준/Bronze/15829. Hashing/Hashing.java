import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int sum = 0;
        int i = 0;
        int r = 1;

        for (char alphabet : str.toCharArray()) {
            int alphabetInt = (int)alphabet - 96;

            if (i != 0)
                r *= 31;

            sum += alphabetInt * r;

            i++;
        }

        System.out.println(sum % 1234567891);
    }
}