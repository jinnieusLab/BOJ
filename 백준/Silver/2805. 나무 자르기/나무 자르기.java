import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        int max=0;

        for (int i=0; i<N; i++){
            arr[i] = sc.nextInt();
            max = Math.max(arr[i], max); //가장 긴 나무
        }

        int min=0;

        while(min < max){
            long sum = 0;
            int mid = (min + max)/2; //mid가 cutter 길이

            for (int i=0; i<N; i++)
                if(arr[i]>mid)
                    sum += arr[i] - mid;

            if (sum<M) //적게 잘렸다면
                max=mid;
            else
                min=mid+1;
        }
        System.out.println(min-1);
    }
}