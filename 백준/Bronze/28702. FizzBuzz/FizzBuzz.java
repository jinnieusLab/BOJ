import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] inputList = new String[3];

        int num = 0;

        for (int i = 0; i < 3; i++) {
            inputList[i] = sc.next();

            if (!inputList[i].equals("Fizz") && !inputList[i].equals("Buzz") && !inputList[i].equals("FizzBuzz")) {
                int inputInt = Integer.parseInt(inputList[i]);
                num = inputInt + 3-i;
                break;
            }
        }

        // test FizzBuzz
        if (num % 15 == 0)
            System.out.println("FizzBuzz");
        else if (num % 3 == 0) {
            System.out.println("Fizz");
        } else if (num % 5 == 0) {
            System.out.println("Buzz");
        } else System.out.println(num);
    }
}