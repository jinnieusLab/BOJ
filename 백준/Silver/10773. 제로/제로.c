//3번 문제
#include <stdio.h>

#define MAX_SIZE 100000

int stack[MAX_SIZE];
int top = -1; 
int main() {
    int K;
    scanf("%d", &K);

    for (int i = 0; i < K; i++) {
        int num;
        scanf("%d", &num);

        if (num == 0) {
            top--;
        } else {
            stack[++top] = num; 
        }
    }

    int sum = 0;
   
    for (int i = 0; i <= top; i++) {
        sum += stack[i];
    }

    printf("%d\n", sum);

    return 0;
}