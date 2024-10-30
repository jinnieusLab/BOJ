import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] count = new int[10001];
        int[] sorted = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            count[arr[i]]++; // 입력과 동시에 count (인덱스=배열 요소, 값=그 배열 요소의 개수)
        }
        
        br.close();
        
//        // count_new (accumulated) 만들기
//        for (int i = 1; i < count.length; i++) {
//            count[i] += count[i-1];
//        }

//        for (int i = N-1; i >=0; i--) {
//            int value = arr[i];
//            count[value]--;
//            sorted[count[value]] = arr[i];
//
////            sorted[count[arr[i]] - 1] = arr[i];
//        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 10001; i++) {
            while(count[i]>0){
                sb.append(i).append("\n");
                count[i]--;
            }
        }
        System.out.println(sb);
    }
}
