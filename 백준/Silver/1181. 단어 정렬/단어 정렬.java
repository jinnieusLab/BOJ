import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] arr = new String[N];

        for (int i = 0; i < N; i++)
            arr[i] = sc.next();

        // 같은 단어 미리 빼기
        LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(arr));
        arr = set.toArray(new String[0]);

        Arrays.sort(arr, (s1, s2) -> {
            if (s1.length() != s2.length()) // 길이 순
                return s1.length()-s2.length();
            else  // 길이가 같다면 사전 순
                return s1.compareTo(s2);
        });

        // 중복된 단어 빼기...
        for (String str : arr) {
            System.out.println(str);
        }

        sc.close();
    }
}