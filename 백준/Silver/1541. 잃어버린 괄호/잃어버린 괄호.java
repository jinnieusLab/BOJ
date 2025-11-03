import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();

        int sum = 0;
        int num = 0;
        boolean minus = false; // 한 번이라도 '-'가 등장했는가

        for (int k = 0; k < s.length(); k++) {
            char c = s.charAt(k);

						// 정수 누적식
            if (c >= '0' && c <= '9') {
                num = num * 10 + (c - '0');
            } else { // '+' or '-'
                sum += minus ? -num : num; // 지금까지의 숫자 반영
                num = 0; // 숫자 초기화 (다음 숫자 위해)
                if (c == '-') minus = true; // 이후 숫자들은 전부 뺀다
            }
        }

        // 마지막 숫자 반영
        sum += minus ? -num : num;

        System.out.println(sum);
    }
}