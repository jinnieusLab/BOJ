import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A, B, V;
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        int day;

        // 나머지가 없을 시-> 달팽이가 정상에 오르는 날의 전날
        // 나머지가 있을 시-> 달팽이가 정상에 오르는 날의 전전날
        day = (V-A)/(A-B);

        // 나머지가 있으면 총 2일을 더해주어야 함
        if ((V-A)%(A-B) != 0)
            day++;

        // 나머지가 없다면 다음날이 바로 정상에 오르는 날이므로 1일만 더해주면 됨
        System.out.println(day+1);
    }
}