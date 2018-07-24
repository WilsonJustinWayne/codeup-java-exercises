import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int newInt = sc.nextInt();
        System.out.println(newInt);
        System.out.print("\n Please enter 3 words: ");
        String firstWord = sc.next();
        String secondWord = sc.next();
        String thirdWord = sc.next();
        System.out.printf("%s %s %s", firstWord, secondWord, thirdWord);


    }

}
