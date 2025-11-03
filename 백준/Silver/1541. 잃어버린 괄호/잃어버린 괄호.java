import java.io.*;
import java.util.*;

public class Main {
    private static int sumPlusGroup(String s) {
        int sum = 0;
        for (String t : s.split("\\+")) {
            if (!t.isEmpty()) sum += Integer.parseInt(t);
        }
        return sum;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String expr = br.readLine().trim();

        String[] groups = expr.split("-");
        int ans = sumPlusGroup(groups[0]); // 첫 그룹은 더하고
        
        for (int i = 1; i < groups.length; i++)   // 이후 그룹은 전부 빼기
            ans -= sumPlusGroup(groups[i]);

        System.out.println(ans);
    }
}