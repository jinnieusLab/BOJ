import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 일반 배열로 큐 구현
        int front = 0;
        int rear = 1;
        int[] q = new int[1000000];
        int[] result = new int[N];
        int j = 0;
        int size = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String st1 = st.nextToken();

            int num = 0;
            if(st.hasMoreTokens())
                num = Integer.parseInt(st.nextToken());

            switch (st1) {
                case "push":
                    q[rear] = num;
                    rear++;
                    size++;
                    break;

                case "pop":
                    if(q[front+1] == 0){
                        result[j] = -1;
                        j++;
                    }

                    else {
                        result[j] = q[front+1];
                        j++;
                        front++;
                        size--;
                    }
                    break;

                case "size":
                    result[j] = size;
                    j++;
                    break;

                case "empty":
                    if (front==rear-1){
                        result[j] = 1;
                        j++;
                    }

                    else {
                        result[j] = 0;
                        j++;
                    }
                    break;

                case "front":
                    if (front==rear-1){
                        result[j] = -1;
                        j++;
                    }

                    else{
                        result[j] = q[front+1];
                        j++;
                    }
                    break;

                case "back":
                    if (front==rear-1){
                        result[j] = -1;
                        j++;
                    }

                    else{
                        result[j] = q[rear-1];
                        j++;
                    }
                    break;
            }
        }

        for (int i = 0; i < j; i++) {
            System.out.println(result[i]);
        }
    }
}