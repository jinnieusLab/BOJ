import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, b;

        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        
        int max = 1;
        int min = a*b;
        
        // 최대공약수 
        for (int i = 1; (i <= a && i <= b); i++) {
            if (a%i == 0 && b%i ==0)
                max = i;
        }
        
        // 최소공배수
        for (int i = 1; i <= b; i++) {
            for (int j = 1; j <= a; j++) {
                if (a*i == b*j && min > a*i) {
                    min = a*i;
                }
            }
        }

        System.out.println(max + "\n" + min);
    }
}