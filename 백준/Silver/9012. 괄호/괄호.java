import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++)
            System.out.println(solve(sc.next()));
    }

    public static String solve(String s){
        Stack<Character> st = new Stack<Character>();

        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);

            // 문자열에서 ( 만나면 스택에 push
            if (c=='(')
                st.push(c);

            else if (st.empty()) //(의 수가 )보다 적을 때
                return "NO";

            // ) 만나면 스택 pop
            else
                st.pop();
        }

        if (st.empty())
            return "YES";
        else
            return "NO";
    }
}