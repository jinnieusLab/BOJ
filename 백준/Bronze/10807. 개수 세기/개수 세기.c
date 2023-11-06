#include <stdio.h>

int main() {
   int a, c;
   int count = 0;
   scanf("%d ", &a);
   int b[a];
   for (int i = 0; i < a; i++) {
      scanf("%d", &b[i]);
   }
   scanf("%d", &c);
   for (int i = 0;i < a;i++) {
      if (c == b[i])
         count++;
   }
    
   printf("%d",count);
    
   return 0;
}