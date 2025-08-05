import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int[] S = new int[21];

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String instruction = st.nextToken();

            if (instruction.equals("add")) {
                int x = Integer.parseInt(st.nextToken());
                S[x] = 1;
            }

            else if (instruction.equals("remove")) {
                int x = Integer.parseInt(st.nextToken());
                S[x] = 0;
            }

            else if (instruction.equals("check")) {
                int x = Integer.parseInt(st.nextToken());
                result.append(S[x]).append("\n");
            }

            else if (instruction.equals("toggle")) {
                int x = Integer.parseInt(st.nextToken());

                if (S[x] == 1)
                    S[x] = 0;

                else S[x] = 1;
            }

            else if (instruction.equals("all"))
                Arrays.fill(S, 1);

            else if (instruction.equals("empty"))
                Arrays.fill(S, 0);
        }

        System.out.println(result);
    }
}