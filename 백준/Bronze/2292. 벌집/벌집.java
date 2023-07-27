import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int room = 1;
        int i = 2;
        int k = 0;
        int t = 1;

        while(t!=0){
            if (N==1) break;

            else if (N>=i && N<=(i+5+6*k)) {
                room++;
                break;
            }

            else{
                i= i+5+6*k+1;
                room++;
                k++;
            }
        }
        System.out.println(room);
    }
}