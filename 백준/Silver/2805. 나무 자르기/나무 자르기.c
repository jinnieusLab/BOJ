#include <stdio.h>
#define MAX(a,b) ((a>b) ? (a) : (b))

int main() {
    int N, M;
    scanf("%d %d",&N,&M);

    long long arr[1000000];

    long long max = 0;

    for (int i=0; i<N; i++){
        scanf("%lld",&arr[i]);
        max = MAX(arr[i], max); //가장 긴 나무
    }

    long long min=0;

    while(min < max){
        long long sum = 0;
        long long mid = (min + max)/2; //mid가 cutter 길이

        for (int i=0; i<N; i++)
            if(arr[i]>mid)
                sum += arr[i] - mid;

        if (sum<M) //적게 잘렸다면 -> cutter의 길이 짧게
            max=mid;
        else
            min=mid+1; //너무 많이 잘랐다 -> cutter의 길이 길게
        //혹은 sum과 M미터의 나무 길이가 같다 -> 그래도 cutter 최댓값 구할 수 있게 cutter 높이기
    }

    printf("%lld", min-1);

    return 0;
}