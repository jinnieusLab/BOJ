import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            Map<String, Integer> outfitMap = new HashMap<>();

            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                String type = st.nextToken();

                outfitMap.put(type, outfitMap.getOrDefault(type, 0) + 1);
            }

            int answer = 1;
            for (int count : outfitMap.values()) {
                // 안 입는 경우 포함
                answer *= (count+1);
            }

            // 알몸 제외
            result.append(answer-1).append("\n");
        }

        System.out.print(result);
    }
}