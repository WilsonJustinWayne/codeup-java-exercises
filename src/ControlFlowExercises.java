import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        int i = 5;
        while (i <= 15) {
            System.out.printf("%s ", i);
            i++;
        }
        System.out.println();

        long longNumber1 = 2L;
        do {
            System.out.println(i);
            longNumber1 *= longNumber1;
        } while (longNumber1 < 1000000);

        for (long longNumber2 = 2L; longNumber2 < 1000000; longNumber2 *= longNumber2) {
//            System.out.println(j);
        }

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


        Scanner sc = new Scanner(System.in);
        boolean keepGoing = true;
        while (keepGoing) {
            System.out.print("What number would you like to go up to? ");
            int input = sc.nextInt();
            System.out.println("\nHere is your table!");
            System.out.println();
            String leftAlignFormat = " %-6s | %-7s | %-6s %n";
            System.out.format(" number | squared | cubed%n");
            System.out.format("--------|---------|------%n");
            for (int k = 1; k <= input; k++) {
                System.out.format(leftAlignFormat, k, Math.round(Math.pow(k, 2)), Math.round(Math.pow(k, 3)));
            }
            System.out.print("Keep going? [y/n]: ");
            System.out.println();
            String secondInput = sc.next();
            if (secondInput.equals("y")) {
                keepGoing = true;
            } else {
                keepGoing = false;
            }
        }

        boolean keepGoing2 = true;
        while (keepGoing2) {
            System.out.print("Please enter grade value: ");
            int gradeInput = sc.nextInt();
            String letterGrade;
            if (gradeInput >= 97) {
                letterGrade = "A+";
            } else if (gradeInput >= 93) {
                letterGrade = "A";
            } else if (gradeInput >= 90) {
                letterGrade = "A-";
            } else if (gradeInput >= 87) {
                letterGrade = "B+";
            } else if (gradeInput >= 83) {
                letterGrade = "B";
            } else if (gradeInput >= 80) {
                letterGrade = "B-";
            } else if (gradeInput >= 77) {
                letterGrade = "C+";
            } else if (gradeInput >= 73) {
                letterGrade = "C";
            } else if (gradeInput >= 70) {
                letterGrade = "C-";
            } else if (gradeInput >= 67) {
                letterGrade = "D+";
            } else if (gradeInput >= 63) {
                letterGrade = "D";
            } else if (gradeInput >= 60) {
                letterGrade = "D-";
            } else {
                letterGrade = "F";
            }
            System.out.println("Your letter grade: " + letterGrade + "\n");
            System.out.print("Keep going? [y/n]: ");
            System.out.println();
            String secondInput = sc.next();
            if (secondInput.equals("y")) {
                keepGoing2 = true;
            } else {
                keepGoing2 = false;
            }
        }
    }
}