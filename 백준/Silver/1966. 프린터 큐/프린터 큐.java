import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < testCase; i++) {
            StringTokenizer documents = new StringTokenizer(br.readLine());
            StringTokenizer importance = new StringTokenizer(br.readLine());

            int num = Integer.parseInt(documents.nextToken());
            int test = Integer.parseInt(documents.nextToken());

            Queue<Integer> queue = new LinkedList<>();

            // 큐에 중요도 넣기
            for (int j = 0; j < num; j++) {
                queue.add(Integer.parseInt(importance.nextToken()));

                // test 위치 확인용 0 삽입
                if (j == test)
                    queue.add(0);
            }

            // 출력 순서 확인
            result.append(checkPrintSeq(queue)).append("\n");
        }

        System.out.print(result);
    }

    static String checkPrintSeq (Queue<Integer> q) {
        int max = 1;
        int count = 0;
        int qSize = q.size();

        // 초기 max 중요도 확인
        for (int i = 0; i < qSize; i++) {
            if (q.peek() > max)
                max = q.peek();

            q.add(q.poll());
        }

        while (true) {
            if (q.peek() < max)
                q.add(q.poll());

            // 중요도 max인 요소 만났을 때 빼기
            else {
                q.poll();
                count++; // 빠진 순서

                // 바로 다음이 0이라면 종료
                if (q.peek() == 0)
                    break;

                // 요소가 빠졌다면 중요도 다시 확인
                max = 1;
                qSize = q.size();

                for (int j = 0; j < qSize; j++) {
                    int top = q.poll();

                    if (top > max)
                        max = top;

                    q.add(top);
                }
            }
        }

        return Integer.toString(count);
    }
}