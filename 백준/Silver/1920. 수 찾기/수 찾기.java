import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 이진 탐색
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arrN = new int[N];

        StringTokenizer st1 = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arrN[i] = Integer.parseInt(st1.nextToken());
        }

        Arrays.sort(arrN);

        int M = Integer.parseInt(br.readLine());
        int[] arrM = new int[M];
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            arrM[i] = Integer.parseInt(st2.nextToken());
            arrM[i] = binarySearch(arrM[i], arrN, 0, arrN.length-1);
            System.out.println(arrM[i]);
        }
    }

    public static int binarySearch(int num, int[] arr, int start, int end) {
        if(start > end)
            return 0;

        int mid = (start+end)/2;

        if (num < arr[mid])
            return binarySearch(num, arr, start, mid-1);

        else if (num > arr[mid])
            return binarySearch(num, arr, mid+1, end);

        else return 1;
    }
}
