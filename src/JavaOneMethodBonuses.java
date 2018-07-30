import java.util.Scanner;

public class JavaOneMethodBonuses {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
//        String[] tester = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen",
//                "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty-one", "twenty-two", "twenty-three",
//                "twenty-four", "twenty-five", "twenty-six", "twenty-seven", "twenty-eight", "twenty-nine", "thirty", "thirty-one", "thirty-two",
//                "thirty-three", "thirty-four", "thirty-five", "thirty-six", "thirty-seven", "thirty-eight", "thirty-nine", "forty", "forty-one",
//                "forty-two", "forty-three", "forty-four", "forty-five", "forty-six", "forty-seven", "forty-eight", "forty-nine", "fifty", "fifty-one",
//                "fifty-two", "fifty-three", "fifty-four", "fifty-five", "fifty-six", "fifty-seven", "fifty-eight", "fifty-nine", "sixty", "sixty-one",
//                "sixty-two", "sixty-three", "sixty-four", "sixty-five", "sixty-six", "sixty-seven", "sixty-eight", "sixty-nine", "seventy",
//                "seventy-one", "seventy-two", "seventy-three", "seventy-four", "seventy-five", "seventy-six", "seventy-seven", "seventy-eight",
//                "seventy-nine", "eighty", "eighty-one", "eighty-two", "eighty-three", "eighty-four", "eighty-five", "eighty-six", "eighty-seven",
//                "eighty-eight", "eighty-nine", "ninety", "ninety-one", "ninety-two", "ninety-three", "ninety-four", "ninety-five", "ninety-six",
//                "ninety-seven", "ninety-eight", "ninety-nine"};
        System.out.println("Hello, and Welcome to Dewie's Bonus Exercises!");
        System.out.print("Please Enter a word or words: ");
        String stringVariable = in.nextLine();
        capitalCount(stringVariable);
        countVowels(stringVariable);
        int countLetters = 0;
        letterPrint(stringVariable, countLetters);
        System.out.printf("Palindrome: %s%n", isPalindrome(stringVariable));
        convertNumber(stringVariable);
        System.out.printf("%s, %s, %s, %s, %s%n",getType(1), getType(true), getType("String"), getType('y'), getType(1.0));

    }

    private static void countVowels(String input) {
        int numberOfAs = countVowel(input, 'a');
        int numberOfEs = countVowel(input, 'e');
        int numberOfIs = countVowel(input, 'i');
        int numberOfOs = countVowel(input, 'o');
        int numberOfUs = countVowel(input, 'u');
        // Display table
        System.out.println("|======== VOWEL COUNT ========|");
        System.out.println("| A's | E's | I's | O's | U's |");
        System.out.printf("| %3s | %3s | %3s | %3s | %3s |%n", numberOfAs, numberOfEs, numberOfIs, numberOfOs, numberOfUs);
        System.out.println("|=============================|");
    }

    private static int countVowel(String input, char vowel) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.toLowerCase(input.charAt(i)) == vowel) {
                count++;
            }
        }
        return count;
    }

    private static void capitalCount(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.toUpperCase(input.charAt(i)) == input.charAt(i) && input.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println("Your \"word\" has " + count + " capitalized letters in it!");
    }

    private static String getType(int input) {
        return "int";
    }

    private static String getType(boolean input) {
        return "Boolean";
    }

    private static String getType(String input) {
        return "String";
    }

    private static String getType(char input) {
        return "char";
    }

    private static String getType(double input) {
        return "double";
    }

    private static void letterPrint(String input, int i) {
        if (i == (input.length() - 1)) {
            System.out.println(input.charAt(i));
            return;
        }
        System.out.printf("%s, ", input.charAt(i));
        letterPrint(input, i + 1);
    }

    private static boolean isPalindrome(String input) {
        String text = "";
        String reverseText = "";
        for (int i = 0; i < input.length(); i++) {
            if (Character.toLowerCase(input.charAt(i)) != ' ') {
                text = text + input.charAt(i);
            }
        }
        for (int i = input.length() - 1; i >= 0; i--) {
            if (Character.toLowerCase(input.charAt(i)) != ' ') {
                reverseText = reverseText + input.charAt(i);
            }
        }
        System.out.println(text);
        System.out.println(reverseText);
        return text.toLowerCase().equals(reverseText.toLowerCase());
    }

    private static void convertNumber(String input) {
        if (input.indexOf('-') != -1) {
            System.out.println("" + convertIt(input.substring(0, input.indexOf('-')).toLowerCase()) +
                    convertIt(input.substring(input.indexOf('-') + 1).toLowerCase()));
            // CREDIT TO JUSTIN
        } else if (input.contains("teen")) {
            System.out.println("1" + convertIt(input));
        } else if (input.contains("ty")) {
            System.out.println("" + convertIt(input) + "0");
        } else {
            System.out.println("" + convertIt(input));
        }
    }

    private static String convertIt(String number) {
        String digit;
        if (number.equals("twelve")) {
            digit = "12";
        }else if (number.equals("eleven")) {
            digit = "11";
        }else if (number.equals("ten")) {
            digit = "10";
        }else if (number.contains("nin")) {
            digit = "9";
        } else if (number.contains("eight")) {
            digit = "8";
        } else if (number.contains("seven")) {
            digit = "7";
        } else if (number.contains("six")) {
            digit = "6";
        } else if (number.contains("fi")) {
            digit = "5";
        } else if (number.contains("fo")) {
            digit = "4";
        } else if (number.contains("th")) {
            digit = "3";
        } else if (number.contains("tw")) {
            digit = "2";
        } else if (number.contains("one")) {
            digit = "1";
        } else {
            digit = "0";
        }
        return digit;
    }

    //------ 7 ------
    //Create a command line calculator
    //- the user may enter a number
    //- the user may enter an operator
    //- the user may enter a second number
    //- the program should output a result, then prompt the user for another calculation
    //------ 8 ------
    //Build a time conversion application:
    //  The user should be prompted which time to enter (12 hour or 24 hour time), then the user should be able to enter a given time. The user should then see the converted time (12 hour to 24 hour or 24 hour to 12 hour)
    //------ 9 ------
    //Create a command line Hangman game:
    //  - prompt player 1 for a word
    //  - player 2 (p2) has 9 guesses to correctly identify the word
    //  - each round, display to the user...
    //    1. the current visible letters of the word
    //    2. the letters already incorrectly guessed
    //    3. the number of guesses remaining
    //  - at any round, they may guess a letter or multiple letters to complete the word
    //    - if p2 guesses correctly, they WIN! and ask if they want to play again
    //    - if p2 guesses wrong, they LOSE!
    //    - if p2 runs out of guesses, they LOSE!
    //------ 10 ------
    //Create date format converter application.
    //Take in the following format:
    //MM/DD/YYYY
    //Output the following:
    //MonthName DD, YYYY
    //Example:
    //input - 12/01/1999
    //output - December 12, 1999
}