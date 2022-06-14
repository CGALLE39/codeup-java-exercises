import java.util.Scanner;

public class MethodsExercise1 {

//    public int addNumber(int userNum1, int userNum2) {
//        return userNum1 + userNum2;
//    }
//
//    public int subNumber(int userNum1, int userNum2) {
//        return userNum1 - userNum2;
//    }
//
//    public static int getDifference (int x, int y) {
//        return x - y;
//    }
//
//    public static int getSum (int x, int y) {
//        return x + y;
//    }
//
//    public static int getMulti (int x, int y) {
//        return x * y;
//    }
//
//    public static int getDiv (int x, int y) {
//        return x / y;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(getDifference(6, 5));
//        System.out.println(getSum(4,5));
//        System.out.println(getMulti(5, 5));
//        System.out.println(getDiv(36,3));
//        System.out.println(getInteger());
//    }

    //    public static int getInteger(int min, int max) {
//        Scanner reader = new Scanner(System.in);
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
//    }
//    public static void getNum(String[] args) {
//        Scanner reader = new Scanner(System.in);
//        System.out.print("Enter a number between 1 and 10: ");
//        int userNum = reader.nextInt();
//    }

//    static int factorial(int n) {
//        if (n == 0)
//            return 1;
//
//        return n * factorial(n - 1);
//    }

//    public static void main(String[] args) {
//        boolean continue =true;
//        while (continue){
//            Scanner reader = new Scanner(System.in);
//            System.out.print("Enter a number between 1 and 10: ");
//            int userNum = reader.nextInt();
//            long result = factorial(userNum);
//            int min = 1;
//            do {
//                System.out.println(min);
//                min++;
//            }
//            while (min <= userNum);
//            {
//                System.out.println(min + "! " + "" + result);
//            }
//            System.out.println("Do you want to continue? (Y/N)");
//            String userContinue = reader.next();
//            if (userContinue.equalsIgnoreCase("n")) {
//                continue = false;
//            }
//        }
//    }


//    static int countUp(int x) {
//
//        for (int i = 1; i <= x; ++i){
//           return i;
//        }
//    }

    static int factorial(int n) {
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }

}

//    int min = 1;
////        for (int i =1; i <= userNum; i++) {
//        do {
//                System.out.println(min);
//                min++;
//                }
//                while (min <= userNum); {

//            System.out.println(userNum + "! = " + result);
//            for (int j = 0; j <= userNum; ++j){
//                System.out.println(userNum + "! = " + result);
//            }
//    static int addUp(int x) {
//        int num = userNum;
//    }
////        int min = 0;
//        while (min <= userNum) {
//            System.out.println(min);
//            min++;
//        }
////

