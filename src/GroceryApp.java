import java.util.Scanner;


public class GroceryApp {
    public static void main (String[] args) {

        boolean decision = true;
        while(decision) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Would you like to make a grocery list? uwu [Y/N]");
            String userPick = sc.next();
            if (userPick.equalsIgnoreCase("n")) {
                decision = false;
            }
            System.out.println("Please enter a an item");

        }




    }



}
