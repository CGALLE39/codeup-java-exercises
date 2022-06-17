import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] arg) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers.length);


        String[] Person = {"Antonio", " Diego", " Frank"};
        for (int i = 0; i < Person.length; i++) {
            System.out.println(Person[i]);
        }

    }
    public static Person[] addPerson(Person[] people, Person peopleNew) {
        Person[] newArray = Arrays.copyOf(people, people.length + 1);
        newArray[people.length] = peopleNew;
        return newArray;
    }




}
