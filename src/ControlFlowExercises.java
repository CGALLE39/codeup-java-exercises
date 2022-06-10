import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
//
int coconut = 5;
while (coconut < 16) {
    System.out.println(coconut);
    coconut++;
        }

//////////////////////////
//
        int x = 0;
        do {
            System.out.println(x * 2);
            x++;
        }
        while (x < 51);

//        for(long dog = 0; dog <= 100; dog = dog * 2){
//            System.out.println(dog);
//        }

       for(int cat = 100; cat >= 5; cat = cat - 5) {
           System.out.println(cat);
       }

        ///////////////////////////////////

        long k = 2;
        do {
            System.out.println(k);
            k *= k;
        } while (k < 1000000);



        for (int i = 1; i <= 100; i++) {
            if (((i % 5) == 0) && ((i % 7) == 0))
                System.out.println("fizzbuzz");
            else if ((i % 5) == 0)
                System.out.println("fizz");
            else if ((i % 7) == 0)
                System.out.println("buzz");
            else
                System.out.println(i);
        }
        ////////////// wrong solution bc I'm whack
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int userNum = reader.nextInt();
//        System.out.println("number" + "|" + "squared" + "|" + "cubed");
//        System.out.println("------" + "------" + "------");
//        int readerCube = (userNum * userNum * userNum);
//        int readerSquare = (userNum * userNum);
//        int daLoop = 0;
//        while (daLoop < userNum) {
//            System.out.println(daLoop + "      " + (daLoop * readerSquare) + "      " + (daLoop * readerCube));
//            daLoop++;
//        }

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userNum = reader.nextInt();
        System.out.println("number" + "|" + "squared" + "|" + "cubed");
        System.out.println("------" + "------" + "------");
        int daLoop = 0;
        while (daLoop < userNum) {
            System.out.println(daLoop + "   |   " + (daLoop * daLoop) + "   |   " + (daLoop * daLoop * daLoop));
            daLoop++;
        }

        ////////////////////////

        Scanner student = new Scanner(System.in);
        System.out.println("Gimmie your grade nerd: ");
        int grade = student.nextInt();
        if (grade > 87)
        {
            System.out.println("A");

        } else if (grade > 79)
        {
            System.out.println("B");

        } else if (grade > 69)
        {
            System.out.println("C");

        } else if (grade > 59)
        {
        System.out.println("D");

    } else {
            System.out.println("F");
        }





    }
}
