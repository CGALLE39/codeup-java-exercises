import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;
public class ConsoleAdventureGame {
    static void slowPrint(String output) {
        for (int i = 0; i<output.length(); i++) {
            char c = output.charAt(i);
            System.out.print(c);
            try {
                TimeUnit.MILLISECONDS.sleep(30);
            } catch (InterruptedException e) {
            }
        }
    }
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String
            ANSI_RESET = "\u001B[0m";
    public static final String
            ANSI_PURPLE = "\u001B[35m";
    public static final String
            ANSI_BLACK = "\u001B[30m";
    public static final String
            ANSI_RED = "\u001B[31m";
    public static final String
            ANSI_GREEN = "\u001B[32m";
    public static final String
    ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String
            ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String
            ANSI_BLUE = "\u001B[34m";

    public static void main(String[] args) {
            Scanner player = new Scanner(System.in);
            Random rand = new Random();
        boolean running = true;

        DRAGONQUEST:
        while (running) {
            System.out.println();
            slowPrint(ANSI_YELLOW + "Greetings prospering child... Tell me... What is your name?");
            String playerInput = player.nextLine();
            if (playerInput.matches(".*[a-z].*")) {
                slowPrint("I see..." + playerInput + "..." + "That's a fierce name!");

            } else {
                slowPrint("Okay give me a real name dummy >:C");
            }

            slowPrint(" Now, " + playerInput + ", are you ready to start your adventure?[Y/N]");
            String userContinue = player.next();
            if (userContinue.equalsIgnoreCase("n")) {
                slowPrint("Dang okay fine! You're no fun >:(" + ANSI_RESET);
                running = false;
                break;
            }

            String[] monsters = {"Slime", "Jailcat", "Man-O-War", "Dracky", "Bubble Slime", "Fire Spirit"};
            int monsterHp = 15;
            int monsterDmg = 4;
            int heroHp = 25;
            int heroDmg = 5;
            int medicinalHerbs = 3;
            int medicinalHeal = 10;

                int enemyHealth = rand.nextInt(monsterHp);
                String monster = monsters[rand.nextInt(monsters.length)];
                slowPrint("\t# " + monster + " appeared! #\n");
            System.out.println("            _.------.                        .----.__\n" +
                    "           /         \\_.       ._           /---.__  \\\n" +
                    "          |  O    O   |\\\\___  //|          /       `\\ |\n" +
                    "          |  .vvvvv.  | )   `(/ |         | o     o  \\|\n" +
                    "          /  |     |  |/      \\ |  /|   ./| .vvvvv.  |\\\n" +
                    "         /   `^^^^^'  / _   _  `|_ ||  / /| |     |  | \\\n" +
                    "       ./  /|         | O)  O   ) \\|| //' | `^vvvv'  |/\\\\\n" +
                    "      /   / |         \\        /  | | ~   \\          |  \\\\\n" +
                    "      \\  /  |        / \\ Y   /'   | \\     |          |   ~\n" +
                    "       `'   |  _     |  `._/' |   |  \\     7        /\n" +
                    "         _.-'-' `-'-'|  |`-._/   /    \\ _ /    .    |\n" +
                    "    __.-'            \\  \\   .   / \\_.  \\ -|_/\\/ `--.|_\n" +
                    " --'                  \\  \\ |   /    |  |              `-\n" +
                    "                       \\uU \\UU/     |  /   :F_P:");
                while (monsterHp > 0) {
                    System.out.println(ANSI_GREEN + "\tYour HP: " + heroHp + ANSI_RESET);
                    slowPrint(ANSI_RED + "\t" + monster + "'s HP: " + monsterHp + ANSI_RESET);
                    System.out.println(ANSI_YELLOW + "\n What would you like to do, " + playerInput + "?" + ANSI_RESET);
                    System.out.println(ANSI_PURPLE + "\t1. Attack");
                    System.out.println("\t2. Use medicinal herb");
                    System.out.println("\t3. Run!" + ANSI_RESET);

                    String input = player.nextLine();
                    if (input.equals("1")) {
                        int damagDealt = rand.nextInt(heroDmg);
                        int damageTaken = rand.nextInt(monsterHp);

                        monsterHp -= damagDealt;
                        heroHp -= damageTaken;

                        slowPrint("\t> You Strike the " + monster + " for " + ANSI_BLUE + damagDealt + " damage" + ANSI_RESET);
                        slowPrint("\t> You recieve " + ANSI_RED + damageTaken + " damage " +  ANSI_RESET + " in retaliation!");

                        if (heroHp < 1) {
                            System.out.println("\t> Oh man bro, you died!");
                            break;
                        }

                    } else if (input.equals("2")) {
                        if (medicinalHerbs > 0) {
                            heroHp += medicinalHeal;
                             medicinalHerbs -= 1;
                            slowPrint("\t you use a medicinal herb to heal yourself for " + medicinalHeal + "." +  ANSI_GREEN + "\n\t You now have " + heroHp + " HP" + "\n\t" + medicinalHerbs + " medicinal herbs left. \n" + ANSI_RESET);

                        } else {
                            slowPrint( ANSI_RED +"\t You have no more medicinal herbs left!\n" + ANSI_RESET);
                        }
                    } else if (input.equals("3")) {
                        slowPrint("\tYou ran away from the " + monster + "... coward");
                        continue DRAGONQUEST;

                    } else {
                        slowPrint("\t You can't do that dummy");
                    }
                }
                if (heroHp < 1) {
                    slowPrint("You um... Lost ;(");
                    break;
                }
                slowPrint(" # " + monster + " was defeated! # ");
                slowPrint(" # You have " + ANSI_GREEN + heroHp + " hp" + ANSI_RESET + " remaining. #");

            }
            String input = player.nextLine();

            while (!input.equals("1") && !input.equals("2")) {
                slowPrint( ANSI_RED + "you cant do that, you literally DIED" + ANSI_RESET);
                input = player.nextLine();
            }
            if (input.equals("1")) {
                slowPrint("You continue your journey!");

            } else if (!input.equals("2")) {
                slowPrint("You win!");
//            break;
            }
        }
    }

//}
