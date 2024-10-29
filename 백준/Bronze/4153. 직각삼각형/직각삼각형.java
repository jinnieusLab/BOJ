import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[100000];
        String result ="";
        int i = 0;

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine()); // 라인 하나

            int a = Integer.parseInt(st.nextToken()); // 숫자 하나씩
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            // 0 0 0 줄을 만나면 종료
            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            // 배열에 숫자 저장
            arr[i++] = a;
            arr[i++] = b;
            arr[i++] = c;
        }

        for (int j = 0; j<i; j+=3) {
            boolean rightTri = testRight(arr[j], arr[j + 1], arr[j + 2]);

            if (rightTri)
                result += "right\n";

            else result += "wrong\n";
        }
        System.out.println(result);
    }

    public static boolean testRight(int a, int b, int c) {
        // Test if right triangle
        if ((c*c == a*a + b*b) || (b*b == a*a + c*c) || (a*a == b*b + c*c))
            return true;

        else return false;
    }
}