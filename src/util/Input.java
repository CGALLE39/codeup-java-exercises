package util;
import java.util.Scanner;

public class Input {

    private static Scanner scanner = new Scanner(System.in);

    public Input() {}



    public String getString() {
        System.out.println("Gimmie a string idiot");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase(" ")) {;
        } return input;
    }

public boolean yesNo() {
    System.out.println("yes or no");
        String input = scanner.nextLine();
    if (input.equalsIgnoreCase(("y"))) {
        return true;
    } else {
        return false;
    }

}

public int getInt(int min, int max) {
    System.out.println("gimmie a number betweem %d and %d");
    int input = scanner.nextInt();
    if(input < min || input > max) {
    }
    return input;
}


public double getDouble(double min, double max) {
    System.out.println("gimmie a number dummy");
    double input = scanner.nextDouble();
    if( input < min || input > max) {
//        return getDouble(min,max);
    }
    return input;
}

public double getDouble() {
    System.out.println("gimmie a number");
    double input = scanner.nextDouble();
        return input + input;
}

    public static void main(String[] args) {

    }


}
