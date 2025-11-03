import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        // 피연산자 (숫자)
        StringBuilder num = new StringBuilder();
        // - 합계
        boolean minus = false;
        int sum = 0;
        int i = 0;

        // 현재 연산자
        for (char c: input.toCharArray()) {
            i++;
            // A+B..
            if (c == '+') {
                // 괄호로 묶어 연산
                if (minus) {
                    sum -= Integer.parseInt(num.toString());
                    // num 초기화
                    num.delete(0, num.length());
                }

                else {
                    sum+= Integer.parseInt(num.toString());
                    // num 초기화
                    num.delete(0, num.length());
                }
            }

            // -
            else if (c == '-') {
                // - 처음 등장
                if (i==1) {
                    minus = true;
                }

                if (minus && i!=1) {
                    sum -= Integer.parseInt(num.toString());
                    // num 초기화
                    num.delete(0, num.length());
                }

                // 이전까지 +였다면
                if (!minus) {
                    sum += Integer.parseInt(num.toString());
                    // num 초기화
                    num.delete(0, num.length());
                    minus = true;
                }
            }

            else {
                num.append(c);
            }
        }

        // 마지막 피연산자 계산
        if (minus)
            sum -= Integer.parseInt(num.toString());

        else sum += Integer.parseInt(num.toString());

        System.out.println(sum);
    }
}