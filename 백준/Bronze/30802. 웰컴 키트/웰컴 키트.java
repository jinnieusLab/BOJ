import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st2.nextToken());
        int P = Integer.parseInt(st2.nextToken());

        int n;

        int t_bundle = 0;
        int pen_bundle = N/P;
        int pen = N%P;

        for (int i = 0; i < 6; i++) {
            if (st1.hasMoreTokens()){
                n = Integer.parseInt(st1.nextToken());

                if(n % T == 0)
                    t_bundle += n/T;

                else t_bundle += n/T + 1;
            }
        }
        
        System.out.println(t_bundle);
        System.out.println(pen_bundle + " " + pen);
    }
}