#include <stdio.h>

int main() {
    int N, count;
    count = 0;
    int x,y, sum;

    scanf("%d",&N);

    int initial = N;


    while (1){
        x = N/10;
        y = N%10;
        sum = x+y;
        N = y*10 + sum%10;

        count++;

        if (N == initial)
            break;
    }

    printf("%d",count);

    return 0;
}
