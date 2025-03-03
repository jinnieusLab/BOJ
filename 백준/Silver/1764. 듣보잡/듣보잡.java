import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] neverHeardOrSeen = new String[N+M];

        for (int i = 0; i < N+M; i++) {
            neverHeardOrSeen[i] = br.readLine();
        }

        Arrays.sort(neverHeardOrSeen);
        StringBuilder result = new StringBuilder();

        int count = 0; // 듣보잡 개수

        for (int i = 1; i < N+M; i++) {
            if (neverHeardOrSeen[i-1].equals(neverHeardOrSeen[i])){
                result.append(neverHeardOrSeen[i-1]+"\n");
                count++;
            }
        }

        result.insert(0, count+"\n");

        System.out.print(result);
    }
}