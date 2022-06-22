package grades;
import org.w3c.dom.ls.LSOutput;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GradesApplication {


//    public String recordAttendance(String date, String value) {
//
//    }

    public static void main (String[] args) {
        HashMap<String, String> usernames = new HashMap<String, String>();
        Scanner sc = new Scanner(System.in);
//        public void setUsernames (HashMap < String, String > usernames){
//            this.usernames = usernames;
//        }


        boolean decision = true;

        while(decision) {

            usernames.put("francisco", "nekopheliac");
            usernames.put("Isabelle", "isajazzyArt");
            usernames.put("Diego", "samsamburg");
            usernames.put("Antonio", "kasnoy");
            System.out.println(usernames);

            Student francisco = new Student("Francisco");
            francisco.addGrade(85);
            francisco.addGrade(95);
            francisco.addGrade(87);
//            System.out.println(francisco.getGrades());
//            System.out.println(francisco.getGradeAverage());


            Student diego = new Student("Diego");
            diego.addGrade(75);
            diego.addGrade(80);
            diego.addGrade(85);
//            System.out.println(diego.getGrades());
//            System.out.println(diego.getGradeAverage());


            Student isabelle = new Student("Isabelle");
            isabelle.addGrade(65);
            isabelle.addGrade(70);
            isabelle.addGrade(73);
//            System.out.println(isabelle.getGrades());
//            System.out.println(isabelle.getGradeAverage());


            Student antonio = new Student("Antonio");
            antonio.addGrade(100);
            antonio.addGrade(99);
            antonio.addGrade(100);
//            System.out.println(antonio.getGrades());
//            System.out.println(antonio.getGradeAverage());

            System.out.println("Welcome!");
            System.out.println("Here are the GitHub usernames of our students: ");
            for (String i : usernames.values()) {
                System.out.println(i);
            }
            System.out.println("What student would you like to see more information on?");
            String userPick = sc.next();
            if (userPick.contains("kasnoy")) {
                System.out.println("GitHub Username: " );
                System.out.println(antonio.getGrades());
                System.out.println(antonio.getGradeAverage());
            }
            if (userPick.contains("samsamburg")) {
                System.out.println("GitHub Username: " );
                System.out.println(diego.getGrades());
                System.out.println(diego.getGradeAverage());
            }
            if (userPick.contains("nekopheliac")) {
                System.out.println("GitHub Username: ");
                System.out.println(francisco.getGrades());
                System.out.println(francisco.getGradeAverage());
            }
            if (userPick.contains("isajazzyArt")) {
                System.out.println("GitHub Username: ");
                System.out.println(isabelle.getGrades());
                System.out.println(isabelle.getGradeAverage());
            }


//            else {
//                System.out.println("She doesn't even go here...");
//            }


            }


            System.out.println("Would you like to continue?(Y/N)");
            String userChoice = sc.next();
            if (userChoice.equalsIgnoreCase("n")) {
                decision = false;
            }
        }
    }



