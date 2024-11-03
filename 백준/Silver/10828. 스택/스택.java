import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int []stack = new int[N];
        int top = -1;
        int num = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String stmt = st.nextToken();

            if(st.hasMoreTokens())
                num = Integer.parseInt(st.nextToken());

            switch (stmt) {
                case "push":{
                    top++;
                    stack[top] = num;
                    break;
                }

                case "pop": {
                    if(top == -1) // stack is empty
                        System.out.println(-1);
                    else {
                        System.out.println(stack[top]);
                        top--;
                    }
                    break;
                }

                case "empty": {
                    if(top == -1) // stack is empty
                        System.out.println(1);
                    else System.out.println(0);
                    break;
                }

                case "size": {
                    System.out.println(top+1);
                    break;
                }

                case "top": {
                    if(top == -1) // stack is empty
                        System.out.println(-1);
                    else System.out.println(stack[top]);
                    break;
                }
            }
        }
    }
}