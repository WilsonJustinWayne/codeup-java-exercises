import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Game picks a random number between 1 and 100.
        int ranNum = (int) Math.floor(Math.random() * 100 + 1);
        //Prompts user to guess the number
        guessing(ranNum, in);
    }

    private static void guessing(int ranNum, Scanner in) {
        System.out.println(ranNum);
        System.out.print("Guess the randomly generated number: ");
        int guess = in.nextInt();
        //All user inputs are validated
        if (guess < ranNum) {
            //If user's guess is less than the number, it outputs "HIGHER"
            System.out.println("HIGHER");
        guessing(ranNum, in);
        }
        if (guess > ranNum) {
            //If user's guess is more than the number, it outputs "LOWER"
            System.out.println("LOWER");
        guessing(ranNum, in);
        }
        //If a user guesses the number, the game should declare "GOOD GUESS!"
        if (guess == ranNum) {
            System.out.println("GOOD GUESS");
            System.out.println("Play again?[y/n]");
            if (in.next().equals("y")) {
                main(null);
            }
        }
    }
}
