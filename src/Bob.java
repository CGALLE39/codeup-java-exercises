import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

//        String response = "Sure.";
//    String exclamation = "Whoa, chill out!";
//    String mad = "Fine. Be that way!";
//    String sassy = "Whatever.";
//        System.out.println(s2.equalsIgnoreCase("below"));
//        System.out.println();
//
//        Scanner sc = new Scanner(System.in);
//if (char c = sc.findInLine("?").charAt(0)); {
//            System.out.println(response);


        Scanner talk2Bob = new Scanner(System.in);
        String userInput = "";
        while (true) {
            System.out.println("What's up...");
            userInput = talk2Bob.nextLine();
            if (userInput.contains("?")) {
                System.out.println("Sure.");
            } else if (userInput.contains("!")) {
                System.out.println("Wow dude, chill...");
            } else if (userInput.contains(" ")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }

        }
    }
}
