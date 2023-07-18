#include <stdio.h>

int main() {
    int N, i, v, count;
    count = 0;

    scanf("%d",&N);

    int num_list[N];

    for (i=0; i<N; i++){
        scanf("%d",&num_list[i]);
    }

    scanf("%d",&v);

    for (i=0; i<N; i++) {
        if (num_list[i] == v)
            count+=1;
    }

    printf("%d",count);

    return 0;
}
