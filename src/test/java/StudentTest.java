import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest {

    Student studentId1 = new Student();
    Student studentId2 = new Student();
    Student studentId3 = new Student();

    @Test
    public void getStudentID() {
        assertEquals(1, studentId1.getId());
        assertEquals(2, studentId2.getId());
    }

    @Test
    public void getStudentGrade(){
        ArrayList<Integer> studentArrayList;
        studentId1.studentGrades(90);
        assertEquals(studentArrayList, studentId1.studentGrades(90));
    }

}

