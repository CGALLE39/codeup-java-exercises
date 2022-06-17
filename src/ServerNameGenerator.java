import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ServerNameGenerator {

    public static void main(String[] arg) {

        System.out.println("Your gamer name is now: " + getRandom() + " " + getRandom2());

    }

    public static String getRandom()
    {
        String[] Adjectives = {"cute", "kawaii", "soft", "beautiful", "colorful", "silly", "gnarly", "sassy", "milky", "fruity"};
        int random = ThreadLocalRandom.current().nextInt(Adjectives.length);
        String randomEl = Adjectives[random];
        return randomEl;
    }

    public static String getRandom2()
    {
        String[] nouns =  {"cow", "kitty", "banana", "tsundere", "Tofu", "hime", "bubblegum", "bunny", "pancake", "yandere"};
        int random = ThreadLocalRandom.current().nextInt(nouns.length);
        String randomEl2 = nouns[random];
        return randomEl2;
    }




}
