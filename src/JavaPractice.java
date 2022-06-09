import java.sql.SQLOutput;
import java.util.Locale;

public class JavaPractice {
    public static void main(String[] args) {
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        String newTxt = "random text to capitalize...";
        System.out.println(newTxt.toUpperCase());

        String txt1 = "GONNA PUT THIS TEXT IN LOWER CASE";
        System.out.println(txt1.toLowerCase());

        String txt2 = "Gonna look for the uwu in this text";
        System.out.println(txt2.indexOf("uwu"));

        String firstName = "Juwulio";
        String lastName = "Bautistahhhh";
        System.out.println(firstName + " " + lastName);

        String animeProtag = "Eren ";
        String animeAntag = "Yaeger";
        System.out.println(animeProtag.concat(animeAntag));

        int coolNum = 10;
        int coolNum2 = 20;
        int coolNumSum = coolNum + coolNum2;
        System.out.println(coolNumSum);

        String quotations = "So what is I want to use \"quotations\"?";
        System.out.println(quotations);

        String slashes = "The character \\ is called backslash.";
        System.out.println(slashes);

        /////selects highest value
        System.out.println(Math.max(5,10));

        System.out.println(Math.sqrt(64));

        System.out.println(Math.abs(-4.7));

        int randomNum = (int)(Math.random() * 101); //random # 0 to 100
        System.out.println(randomNum);








    }
}
