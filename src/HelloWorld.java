import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        byte tinyNum = 127; //Stores whole numbers from -128 to 127
        System.out.println(tinyNum);
        short myNum = 5000; //stores whole numbers from -32768-32767
        System.out.println(myNum);
        int myFavoriteNumber = 39; //integer
        System.out.println(myFavoriteNumber);
        boolean myBoo = true; //boolean
        System.out.println(myBoo);
        char myLetter = 'C'; //character
        System.out.println(myLetter);
        float myFloatNum = 3.99f; //floating number
        System.out.println(myFloatNum);
        double dblNum = 19.99d;
        System.out.println(dblNum);
        boolean isJavaFun = true;
        System.out.println(isJavaFun);     // Outputs true
        boolean isFishTasty = false;
        System.out.println(isFishTasty);   // Outputs false
        String myText = "Awesome"; //String
        System.out.println(myText);
        System.out.println("Hello, World!");
        System.out.println("Hello, again");
        System.out.println("Hello, test");
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);
        //////////
        int newInt = 10;
        double addDouble = newInt;
        System.out.println(newInt);
        System.out.println(addDouble);
        int y = 100 + 50;
        System.out.println(y);
        int sum1 = 30 * 4;
        System.out.println(sum1);
        int x = 5;
        System.out.println(++x);
        System.out.println(x);
        int a = 4;
        a += 5;
        System.out.println(a);

        int num1 = 3;
        int num2 = 4;
        num2 *= num1;
        System.out.println(num2);

        int calc1 = 10;
        int calc2 = 2;
        calc1 /= calc2;
        calc2 -= calc1;
        System.out.println(calc1);
        System.out.println(calc2);
        System.out.println(10*5);

        double pi = 3.14159;
        System.out.printf("%.2f",pi);
        System.out.println("");

        Scanner user = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String randomWord = user.nextLine();

        Scanner user2 = new Scanner(System.in);
        System.out.println("Enter another word: ");
        String randomWord2 = user2.nextLine();

        Scanner user3 = new Scanner(System.in);
        System.out.println("Enter ANOTHER word: ");
        String randomWord3 = user3.nextLine();

        System.out.println(randomWord + " " + randomWord2 + " " + randomWord3);
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userNum = reader.nextInt();

        Scanner theStorySoFar = new Scanner(System.in);
        System.out.println("Tell me a funny story: ");
        String coolPhrase = theStorySoFar.nextLine();


        Scanner width1 = new Scanner(System.in);
        System.out.println("soooo whats the width");
        int widthInput = width1.nextInt();

        Scanner length1 = new Scanner(System.in);
        System.out.println("soooo whats the length");
        int lengthInput = length1.nextInt();

        int width2 = widthInput;
        width2 *=2;
        int length2 = lengthInput;
        length2 *=2;
        int perimeter = width2 + length2;
        int area = widthInput * lengthInput;
        System.out.print("the perimeter of the classroom is " + perimeter);
        System.out.println("");
        System.out.println("the area of the classroom is " + area);

        int coconut = 5;
        while (coconut < 16) {
            System.out.println(coconut);
            coconut++;
        }

    }
}

