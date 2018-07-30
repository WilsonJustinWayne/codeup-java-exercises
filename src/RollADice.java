import java.util.Scanner;

public class RollADice {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String participle;
        //Ask the user to enter the number of sides for a pair of dice.
        System.out.print("How many sides are there on the die(4, 6, 8, 10, 12, or 20): ");
        int userInput = checkInput(in);
        switch (userInput) {
            case 4:
            case 6:
            case 10:
            case 12:
            case 20:
                participle = "a";
                break;
            default:
                participle = "an";
                break;

        }
        System.out.printf("You have chosen %s %s-sided dice!\n", participle, userInput);
        roll(userInput, in);
    }

    private static int checkInput(Scanner in) {
        int input = in.nextInt();
        switch (input) {
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
            case 20:
                return input;
        }
        System.out.print("Please choose one of the options(4, 6, 8, 10, 12, or 20): ");
        return checkInput(in);
    }

    private static void roll(int n, Scanner in) {
        //"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.

        System.out.print("Would you like to roll two die[y/n]: ");
        String input = in.next();
        if (input.equals("y")) {
            System.out.println("The red die landed on: " + (int) Math.floor(Math.random() * n + 1) + "\nThe blue die landed on: " + (int) Math.floor(Math.random() * n + 1));
            roll(n, in);
        } else {
            System.out.print("Do you want to change die?[y/n]: ");
            String change = in.next();
            if (change.equals("y")) {
                main(null);
            }
        }
    }
}

