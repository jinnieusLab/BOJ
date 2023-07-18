#include <stdio.h>
#define MAX(a,b) ((a>b) ? (a): (b))
int main() {
    int N,K;

    scanf("%d %d",&K,&N);

    long long arr[10000];
    long long max = 0;

    //이미 가지고 있는 랜선들 길이 입력 받기
    for (int i = 0; i < K; ++i){
        scanf("%lld",&arr[i]);
        max = MAX(max,arr[i]);
    }

    max++;
    long long min = 1;

    while(min<max){
        long long mid = (min+max)/2;
        long long cnt = 0;

        for (int i = 0 ; i < K; ++i) {
            cnt += arr[i]/mid;
        }

        if(cnt<N) //랜선 수 아직 부족 -> 더 작게 잘라야함
            max = mid;

        else //랜선 수 너무 많음 -> 크게 잘라야 함
            min = mid+1;
    }

    printf("%lld",min-1);

    return 0;
}
