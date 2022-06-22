package grades;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    private String name;

    public String date;

    public String value;



    private ArrayList<Double> grades = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    // returns the student's name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//
//    Integer[] arrOfGrades = {};
//    ArrayList<Integer> grade = new ArrayList<>(Arrays.asList(arrOfGrades));


    // adds the given grade to the grades property
    public void addGrade(double grade) {
        grades.add(grade);
    }

    public ArrayList<Double> getGrades() {
        return grades;
    }

    public double getGradeAverage() {
        double sum = 0;
        for (Double grade : grades) {
            sum += grade;
        }
        return sum/grades.size();
    }




// returns the average of the students grades
//    public double getGradeAverage() {
//        return grade.???? / grade.size;
//    }





}