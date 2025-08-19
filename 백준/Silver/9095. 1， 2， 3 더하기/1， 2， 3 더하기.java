import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] arr = new int[12];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder result = new StringBuilder();
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;

        for (int i = 0; i < T; i++) {
            int caseNum= Integer.parseInt(br.readLine());
            result.append(addUp(caseNum)).append("\n");
        }

        System.out.print(result);
    }

    static int addUp(int n) {
        if(arr[n] != 0)
            return arr[n];

        else {
            return arr[n] = addUp(n-1) + addUp(n-2) + addUp(n-3);
        }
    }
}