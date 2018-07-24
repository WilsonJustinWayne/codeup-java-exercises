import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//        while (i <= 15) {
//            System.out.printf("%s ", i);
//            i++;
//        }
//        System.out.println();

//        long i = 2L;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i < 1000000);

//        for (long i = 2L; i < 1000000; i *= i) {
//            System.out.println(j);
//        }

//        for (int i = 1; i <= 100; i++) {
//            String j = "";
//            if (i % 3 == 0) {
//                j += "Fizz";
//            }
//            if (i % 5 == 0) {
//                j += "Buzz";
//            }
//            if (j.equals("")) {
//                j = Integer.toString(i);
//            }
//            System.out.println(j);
//        }

//        What number would you like to go up to? 5
//
//        Here is your table!
//
//        number | squared | cubed
//        ------ | ------- | -----
//        1      | 1       | 1
//        2      | 4       | 8
//        3      | 9       | 27
//        4      | 16      | 64
//        5      | 25      | 125

        Scanner sc = new Scanner(System.in);
        System.out.print("What number would you like to go up to? ");
        int input = sc.nextInt();
        System.out.println("\nHere is your table!");
        System.out.println();
        String leftAlignFormat = " %-6s | %-7s | %-6s %n";

        System.out.format(" number | squared | cubed%n");
        System.out.format("--------|---------|------%n");
        for (int i = 1; i <= input; i++) {
            System.out.format(leftAlignFormat, i, Math.round(Math.pow(i, 2)), Math.round(Math.pow(i, 3)));
        }

    }
}
