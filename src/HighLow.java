import java.util.Scanner;
import java.util.Random;



public class HighLow {
public static void diceGame() {
    Scanner sc = new Scanner(System.in);
    boolean decision = true;
    int randomNum = (int) (Math.random() * 100) + 1;
    int guessCount = 5;

    while (decision) {
        if (guessCount == 0) {

            System.out.println("You're out of guesses, you LOST!");
            break;
        }
        System.out.println("Guess a number between 1 and 100!!!");
        int userPick = sc.nextInt();
        if (userPick == randomNum) {
            System.out.println("WOW you guessed right!");
            System.out.println("Would you like to play again?[Y/N]");
            String userChoice = sc.next();
            if (userChoice.equalsIgnoreCase("n")) {
                decision = false;
            }
        } else if (userPick < randomNum) {
            System.out.println("HIGHER");
        } else if (userPick > randomNum) {
            System.out.println("LOWER");
        }
        guessCount--;
        System.out.println("Number of guess left " + guessCount);


    }
}

    public static void main (String[] args) { diceGame(); }
}
