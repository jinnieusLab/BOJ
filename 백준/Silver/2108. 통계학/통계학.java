import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] count_arr = new int[8001];
        int avg, sum = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            // 산술 평균) 합 구하기
            sum += arr[i];

            // 최빈값 배열 채우기
            count_arr[arr[i]+4000]++;
        }

        // 산술 평균
        avg = Math.round((float)sum / N);

        // 중앙값
        Arrays.sort(arr);
        int mid = arr[N/2];

        // 최빈값
        int mode = 0;
        int count = 0;

        for (int i = 0; i < 8001; i++) {
            if (count_arr[i] > count){
                count = count_arr[i];
                mode = i - 4000;
            }
        }

        // 최빈값이 여러 개
        int j = 0;
        for (int i = 0; i < 8001; i++) {
            if (count == count_arr[i])
                j++;

            if (j == 2){
                mode = i - 4000;
                break;
            }
        }

        // 최댓값과 최솟값
        int min = arr[0];
        int max = arr[N-1];
        int range = max - min;

        System.out.println(avg + "\n" + mid + "\n" + mode + "\n" + range);
    }
}