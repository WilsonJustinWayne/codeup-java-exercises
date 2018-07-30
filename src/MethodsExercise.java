import java.util.Scanner;
import java.text.NumberFormat;

public class MethodsExercise {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = 0;
        long factorial = 1L;
        int i = 1;
//        System.out.println(addition(5, 10));
//        System.out.println(subtraction(5, 10));
//        multiplication(5, 10, result);
//        System.out.println(division(5, 10));
//        System.out.println(modulus(5, 10));
        boolean keepGoing = true;
        while (keepGoing) {
            System.out.print("Enter a number between 1 and 20: ");
            int userInput = getInteger(1, 20, in);
            factorial(userInput, factorial, i);
            System.out.print("Keep going? [y/n]: ");
            String secondInput = in.next();
            System.out.println();
            if (secondInput.equals("y")) {
                keepGoing = true;
            } else {
                keepGoing = false;
            }
        }
    }

//
//    public static int addition(int x, int y) {
//        return x + y;
//    }
//
//    public static int subtraction(int x, int y) {
//        return x - y;
//    }
//
//    private static void multiplication(int x, int y, int result) {
//        if (y <= 0) {
//            System.out.println(result);
//            return;
//        }
//        result += x;
//        multiplication(x, y - 1, result);
//    }
//
//    public static int division(int x, int y) {
//        return x / y;
//    }
//
//    public static int modulus(int x, int y) {
//        return x % y;
//    }

    private static int getInteger(int lower, int upper, Scanner in) {
        int n = in.nextInt();
        if ((lower <= n) && (n <= upper)) {
            return n;
        }
        System.out.print("Input was not in between 1 and 20, try again: ");
        return getInteger(1, 20, in);
    }

    private static void factorial(int userInput, long factorial, int i) {
        if (i > userInput) {
            StringBuilder output = new StringBuilder();
            for (int a = userInput; a > 0; a--) {
                if (a == 1) {
                    output.append(a);
                } else {
                    output.append(a).append(" x ");
                }
            }
            System.out.printf("%s! = %s = %s%n",userInput, output, NumberFormat.getIntegerInstance().format(factorial));
            return;
        }
        factorial *= i;
        i++;
        factorial(userInput, factorial, i);
    }
}
