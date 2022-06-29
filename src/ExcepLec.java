//public class ExcepLec {
//
//    static void isEven(int num) throws Exception {
//
//    }
//
//
//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3};
//        System.out.println(numbers[999]);
//
//        try {
//            isEven(9);
//            isEven(6);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println("What about me");
//
//        try {
//            System.out.println("lets see...");
//            int result = 1/0;
//            System.out.println("I can divde by zero");
//        } catch (ArithmeticException e ) {
//            System.out.println("MAth still works");
//        }
//
//        int[] numbers = {1, 2, 3};
//        int x;
//        try {
//            x = numbers[1];
//        } catch (Exception e) {
//            System.out.println("Caught a generic exception");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("caught array index exception");
//        } finally {
//            System.out.println("this will always run");
//        }
//    }
//}
