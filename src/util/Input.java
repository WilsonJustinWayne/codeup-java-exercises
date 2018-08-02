package util;
import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    private String getString() {
        return scanner.nextLine();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return getString();
    }

    private boolean yesNo() {
        String input = scanner.next();
        // checks for y, yes, sure, and ok
        return (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("sure") || input.equalsIgnoreCase("ok"));
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        return yesNo();
    }

    private int getInt(int min, int max) {
        int input = scanner.nextInt();
        if (min < input && input > max) {
            return input;
        }
        System.out.println("Input is not within the correct range");
        return getInt(min, max);
    }

    public int getInt(int min, int max, String prompt) {
        System.out.println(prompt);
        return getInt(min, max);
    }

    private int getInt() {
        return scanner.nextInt();
    }

    public int getInt(String prompt) {
        System.out.print(prompt + "\n");
        return getInt();
    }

    private double getDouble(double min, double max) {
        double input = scanner.nextDouble();
        if (input < min || input > max) {
            return input;
        }
        System.out.println("Input is not within the correct range");
        return getDouble(min, max);
    }

    public double getDouble(double min, double max, String prompt) {
        System.out.println(prompt);
        return getDouble(min, max);
    }

    private double getDouble() {
        return scanner.nextDouble();
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        return getDouble();
    }

}