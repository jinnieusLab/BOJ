import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i,j,temp;
        int sum=0;

        int[] height = new int[9];
        Scanner sc = new Scanner(System.in);

        //아홉 명 키 입력 받기
        for(i=0; i<9; i++)
            height[i] = sc.nextInt();

        for(i=0; i<9; i++)
            sum += height[i];

        for(i=0; i<8; i++)
            for(j=i+1; j<9; j++){
                //(아홉 명 키 합 - 두 명 키 합) 일곱 명 키 합 100
                if (sum - height[i]-height[j] == 100) {
                    height[i] = 100;
                    height[j] = 100;

                    //선택정렬
                    for(i=0; i<8; i++){
                        for(j=i+1; j<9; j++){
                            if(height[j] < height[i]){
                                temp = height[i];
                                height[i] = height[j];
                                height[j] = temp;
                            }
                        }
                    }

                    //일곱 명까지만 키 출력
                    for(i=0; i<7; i++)
                        System.out.println(height[i]);

                }
            }
    }
}