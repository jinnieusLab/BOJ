import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        String sentence;

        while(true){
            sentence = sc.next();

            if(!sentence.equals("0"))
                arr.add(sentence);
            else break;
        }

        int i = 0;
        while(i < arr.size()){
            sentence = arr.get(i);

            Deque<Character> deque = new ArrayDeque<>();
            for (int j = 0; j < sentence.length(); j++) {
                deque.add(sentence.charAt(j));
            }

            if(dequePalindrome(deque) == 1)
                result.add("no");

            else result.add("yes");
            i++;
        }

        for (int j = 0; j < arr.size(); j++) {
            System.out.println(result.get(j));
        }
    }

    public static int dequePalindrome(Deque<Character> deque) {
        while(deque.size()>1) {
            if(deque.pollFirst() != deque.pollLast())
                return 1;
        }
        return 0;
    }
}