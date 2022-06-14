import java.util.Scanner;

public class ConsoleAdventureGame {
    public static void main(String[] args) {
//        boolean continue = true;
//        while (continue){
            Scanner player = new Scanner(System.in);
            System.out.println("Greetings prospering child... Tell me... What is your name?");
            String playerInput = player.nextLine();
            if (playerInput.matches(".*[a-z].*")) {
                System.out.println("I see..." + playerInput + "..." + "That's a fierce name!");
            } else {
                System.out.println("Okay give me a real name dummy >:C");
            }
            System.out.println("Now, " + playerInput + ", are you ready to start your adventure?[Y/N]");
            String userContinue = player.next();
            if (userContinue.equalsIgnoreCase("N")) {
                System.out.println("Dang okay fine! You're no fun >:(");
//                continue = false;
            }
        System.out.println("Great...!");
        System.out.println("          ██████████          \n" +
                "      ████░░░░░░░░░░████      \n" +
                "    ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██    \n" +
                "  ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██  \n" +
                "  ██▒▒▒▒██▒▒▒▒▒▒▒▒▒▒██▒▒▒▒██  \n" +
                "██▒▒▒▒▒▒██▒▒▒▒▒▒▒▒▒▒██▒▒▒▒▒▒██\n" +
                "██▒▒▒▒▒▒██▒▒▒▒▒▒▒▒▒▒██▒▒▒▒▒▒██\n" +
                "██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██\n" +
                "██▒▒▒▒▒▒▒▒██▒▒▒▒▒▒██▒▒▒▒▒▒▒▒██\n" +
                "██▓▓▒▒▒▒▒▒▒▒██████▒▒▒▒▒▒▒▒▓▓██\n" +
                "  ██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██  \n" +
                "    ██████████████████████    \n");
        System.out.println("Oh no! a Slime appears! Would would you like to do " +playerInput+ "?");
            int Slime = 3;
            int Slimeattack = 1;
            int Health = 12;
            int MedicinalHerb = 10;
            int Attack = 5;

        }
    }
//}
