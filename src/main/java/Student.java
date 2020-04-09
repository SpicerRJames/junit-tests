import java.lang.reflect.Array;
import java.util.ArrayList;
//import java.util.List;

public class Student {

    private int grades;
    static long counter;
    private long id;
    private String name;

    public Student(){
        counter++;
        id = counter;
        this.name = "James";
        this.grades = 10;
    }

    // returns the student's id
    public long getId(){
        return id;
    }
    // returns the student's name
    public String getName(){
        return name;
    }
    // adds the given grade to the grades list
    public void addGrade(int grade){
        grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        return grades;
    }


//    public void setGrades(List<Integer> grades) {
//        this.grades = grades;
//    }


}
