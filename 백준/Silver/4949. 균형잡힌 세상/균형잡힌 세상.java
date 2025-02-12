import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = "";
        StringBuilder sb = new StringBuilder();

        while (true) {
            st = br.readLine();

            if (st.equals(".")) break;

            if (isBalanced(st))
                sb.append("yes\n");

            else sb.append("no\n");
        }
        System.out.println(sb);
    }

    public static boolean isBalanced(String st) {
        Stack<Character> stack = new Stack<>();

        for (char c : st.toCharArray()) {
            if (c == '(' || c == '[')
                stack.push(c);

            else if ((c == ')' || c == ']')) {
                if (stack.isEmpty())
                    return false;

                else {
                    char top = stack.pop();

                    if ((top == '(' && c != ')') || (top == '[' && c != ']'))
                        return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
