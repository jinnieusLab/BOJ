import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String isbn = br.readLine();

        long sum = 0;
        int missingIDX = 1;
        int m = Character.getNumericValue(isbn.charAt(12));

        for (int idx = 0; idx < 12; idx++) {
            char c = isbn.charAt(idx);
            // missingIDX 찾기
            if (c == '*') {
                if (idx%2 == 1) {
                    missingIDX = 3;
                }
            }

            // sum 구하기
            else {
                if (idx % 2 == 0)
                    sum += Character.getNumericValue(c);

                else sum += (long) Character.getNumericValue(c) * 3;
            }
        }

        int missing = 0;
        for (int j = 0; j <= 9; j++) {
            if ((sum + j * missingIDX + m) % 10 == 0){
                missing = j;
                break;
            }
        }

        System.out.println(missing);
    }
}