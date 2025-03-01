import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringBuilder result = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int num = 1;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());

            int target = arr[i];

            while (num <= target) {
                stack.push(num);
                result.append("+\n");
                num++;
            }

            if (stack.peek() == target) {
                stack.pop();
                result.append("-\n");
            }

            else {
                System.out.println("NO");
                return;
            }
        }

        System.out.print(result);
    }
}