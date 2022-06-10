import java.util.Scanner;



public class ControlFlowExercises {
    public static void main(String[] args) {
//int i = 5;
//while (i < 16) {
//    System.out.println(i);
//    i++;
//        }


int x = 0;
    do {
        System.out.println(x * 2);
        x++;
    }
    while (x < 51);

    //////

        long k = 2;
        do {
            System.out.println(k);
            k *= k;
        } while(k < 1000000);

        for (int i = 1; i <= 100; i++)
        {
            if (((i % 5) == 0) && ((i % 7) == 0))
                System.out.println("fizzbuzz");
            else if ((i % 5) == 0)
                System.out.println("fizz");
            else if ((i % 7) == 0)
                System.out.println("buzz");
            else
                System.out.println(i);
        }


        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userNum = reader.nextInt();
//        int daLoop = 1;
//        while (daLoop < userNum) {
//        System.out.println(daLoop);
//        daLoop++;
//        }
        System.out.println("number" + "|" + "squared" + "|" + "cubed");
        System.out.println("------" + "------" + "------");
        for (int daLoop = 0; daLoop <= userNum; daLoop ++)
        {
            int readerCube = (userNum * userNum * userNum);
            int readerSquare = (userNum * userNum);
            System.out.println(userNum + "      " + readerSquare + "      " + readerCube);
        }
    }
}
