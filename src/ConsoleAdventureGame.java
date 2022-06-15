import java.util.Scanner;
import java.util.Random;
public class ConsoleAdventureGame {
    public static void main(String[] args) {
//        boolean continue = true;
//        while(continue) {
        Scanner player = new Scanner(System.in);
        Random rand = new Random();
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
        String[] monsters = {"Slime", "Jailcat", "Man-O-War"};
        int monsterHp = 15;
        int monsterDmg = 4;

        int heroHp = 17;
        int heroDmg = 5;
        int medicinalHerbs = 3;
        int medicinalHeal = 10;

        boolean running = true;

        DRAGONQUEST:
        while (running) {

            int enemyHealth = rand.nextInt(monsterHp);
            String monster = monsters[rand.nextInt(monsters.length)];
            System.out.println("\t#" + monster + " appeared! #\n");
            while (monsterHp > 0) {
                System.out.println("\tYour HP: " + heroHp);
                System.out.println("\t" + monster + "'s HP: " + monsterHp);
                System.out.println("\n\tWhat would you like to do, " + playerInput + "?");
                System.out.println("\t1. Attack");
                System.out.println("\t2. Use medicinal herb");
                System.out.println("\t3. Run!");

                String input = player.nextLine();
                if (input.equals("1")) {
                    int damagDealt = rand.nextInt(heroDmg);
                    int damageTaken = rand.nextInt(monsterHp);

                    monsterHp -= damagDealt;
                    heroHp -= damageTaken;

                    System.out.println("\t> You Strike the " + monster + " for " + damagDealt + " damage");
                    System.out.println("\t> You recieve " + damageTaken + " in retaliation!");

                    if (heroHp < 1) {
                        System.out.println("\t> Oh man bro, you died!");
                        break;
                    }
                } else if (input.equals("2")) {
                    if (medicinalHerbs > 0) {
                        heroHp += medicinalHeal;
                        System.out.println("\t> you use a medicinal herb to heal yourself for " + medicinalHeal + "." + "\n\t> You now have " + heroHp + "HP" + "\n\t>" + medicinalHerbs + " medicinal herbs left. \n");
                    } else {
                        System.out.println("\t> You have no more medicinal herbs left!\n");
                    }
                } else if (input.equals("3")) {
                    System.out.println("\tYou ran away from the " + monster + "... coward");
                    continue DRAGONQUEST;

                } else {
                    System.out.println("\t You can't do that dummy");
                }
            }
            if (heroHp < 1) {
                System.out.println("You limp out of the dungeon");
                break;
            }
            System.out.println(" # " + monster + "was defeated! # ");
            System.out.println(" # You have " + heroHp + "remaining. #");
        }
        String input = player.nextLine();

        while (!input.equals("1") && !input.equals("2")) {
            System.out.println("you cant do that!");
            input = player.nextLine();
        }
        if (input.equals("1")) {
            System.out.println("You continue your journey!");

        } else if (!input.equals("2")) {
            System.out.println("You win!");
//            break;
        }
    }
}

//}
