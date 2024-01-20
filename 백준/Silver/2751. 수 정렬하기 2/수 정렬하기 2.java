import java.io.*;
import java.util.Scanner;

class MergeSort {
    static int N; // 초기 arr의 size를 전역 변수로 선언
    static int []arr;
    static int []sorted;

    public static void initializeArr(){
        arr = new int[N];
        sorted = new int[N];
    }

    public static void mergeSort(int p, int r){
        if (p<r){
            int q = (p+r)/2;
            mergeSort(p,q);
            mergeSort(q+1,r);
            merge(p,q,r);
        }
    }

    public static void merge(int p, int q, int r){
        // int []sorted = new int[N];
        int k = p; // sorted의 index
        // 두 개의 분할된 list의 index
        int i = p, j = q+1;

        while (i<= q && j<=r){
            if (arr[i] <= arr[j]){
                sorted[k] = arr[i];
                k++; i++;
            }

            else{
                sorted[k] = arr[j];
                k++; j++;
            }
        }

        // sorted에 아직 안 들어간 남은 요소들 넣기
        while (i <= q) {
            sorted[k] = arr[i];
            k++;
            i++;
        }

        while (j <= r) {
            sorted[k] = arr[j];
            k++;
            j++;
        }

        // arr를 sorted 요소로 다 바꾸기 (정렬 완료)
        for (int l = p; l <= r; l++)
            arr[l] = sorted[l];

    }
}

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // 줄 개수 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MergeSort.N = Integer.parseInt(br.readLine());

        // 배열 초기화 (사이즈 맞게)
        MergeSort.initializeArr();

        // 배열 요소 입력 받기
        for (int i = 0; i < MergeSort.N; i++)
            MergeSort.arr[i] = Integer.parseInt(br.readLine());

        MergeSort.mergeSort(0, MergeSort.N-1);

        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < MergeSort.N; i++)
            bw.write((MergeSort.arr[i])+"\n");
        bw.close();
    }
}