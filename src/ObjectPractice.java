
public class ObjectPractice {
    int x = 5;
    int y = 6;

//    int age = "16";
    //    final int z = 10;
    String fname = "Miku";
    String lname = "Hatsune";


    public static void main(String[] args) {
        ObjectPractice myObj = new ObjectPractice();
        ObjectPractice myObj1 = new ObjectPractice();  // Object 1
        ObjectPractice myObj2 = new ObjectPractice();  // Object 2
        System.out.println(myObj1.x);
        System.out.println(myObj2.y);
        myObj.x = 25;
        myObj.y = 30;
        System.out.println(myObj.x);
        System.out.println(myObj.y);
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
//        System.out.println("Age: " + myObj.age);
//        myMethod("Francisco");
//        myMethod("Isa");
//        myMethod("Antonio");
    }

    static void myMethod(String fname, int age) {
        System.out.println(fname + " is ");
//        System.out.println(fname + " Jascizek");
    }
}


