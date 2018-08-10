package grades;

import java.util.HashMap;

public class GradesApplication {
    static Student Linda = new Student("Linda");
    static Student Justin = new Student("Justin");
    static Student Dewie = new Student("Dewie");
    static Student Aaron = new Student("Aaron");

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Linda.addGrade(98);
        Linda.addGrade(95);
        Linda.addGrade(92);
        Justin.addGrade(89);
        Justin.addGrade(86);
        Justin.addGrade(83);
        Dewie.addGrade(80);
        Dewie.addGrade(77);
        Dewie.addGrade(74);
        Aaron.addGrade(80);
        Aaron.addGrade(77);
        Aaron.addGrade(74);
        students.put("AaronTheIllest", Aaron);
        students.put("DewieDawg", Dewie);
        students.put("Waifu4Laifu", Linda);
        students.put("Justin", Justin);

        System.out.println("Welcome!\n\nHere are the github usernames of our students:\n\n");
//        for (Student student : students) {
//            System.out.print();
//        }
        //What student would you like to see more information on?
        //
        //> pizza
        //
        //Sorry, no student found with the gihub username of "pizza".
        //
        //Would you like to see another student?
        //
        //> y
        //
        //What student would you like to see more information on?
        //
        //> zgulde
        //
        //Name: Zach - Gihub Username: zgulde
        //Current Average: 87.4
        //
        //Would you like to see another student?
        //
        //> no
        //
        //Goodbye, and have a wonderful day!


    }

}
