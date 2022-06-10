public class ConditionsPractice {
    public static void main(String[] args) {
        if (20 > 18) {
            System.out.println("20 is greater than 18");
        }

        int luckyNum = 7;
        if (luckyNum == 7) {
            System.out.println("You win!");
        } else {
            System.out.println("You win NOTHING");
        }

        int luckyNumber = 8;
        String result = (luckyNumber == 7) ? "You win!" : "You win NOTHING";
        System.out.println(result);





    }
}