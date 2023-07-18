#include <stdio.h>
#define SIZE 100000
int stack[SIZE];
int top =-1;

// push&pop 함수
void push(int data){
    top++;
    stack[top] = data;
}

void pop(){
    stack[top] = 0;
    top--;
}

int main() {
    int K, i, data;
    scanf("%d",&K);

    for(i=0;i<K;i++) {
        scanf("%d",&data);

        if (data==0)
            pop();

        else
            push(data);
    }

    int sum=0;

    for (i=0;i<=top;i++){
        sum+= stack[i];
    }
    printf("%d",sum);
    return 0;
}
