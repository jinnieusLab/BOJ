#include <stdio.h>

int main() {
    int N, M;
    scanf("%d %d",&N,&M);

    int arr[N];
    int sum, max=0;

    for (int i=0; i<N; i++)
        scanf("%d",&arr[i]);

    for (int i=0; i<N-2; i++)
        for (int j=i+1; j<N-1; j++)
            for (int k=j+1; k<N; k++){
                sum = 0;
                sum += arr[i]+arr[j]+arr[k];
                if(sum >= max && sum<=M)
                    max = sum;
            }

    printf("%d",max);

    return 0;
}