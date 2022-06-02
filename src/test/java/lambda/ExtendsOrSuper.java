package lambda;

import org.testng.annotations.Test;
import people.Aged;
import people.Human;
import people.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static lambda.LambdaDemo.humanAgeSup;
import static org.testng.Assert.assertEquals;
import static people.Gender.FEMALE;
import static people.Gender.MALE;

public class ExtendsOrSuper {
    Student student = new Student("Abc", "Abc", "Abc", 18, MALE, "OmSU", "FMIT", "Progs");
    Student student1 = new Student("Bcd", "Bcd", "Bcd", 18, MALE, "OmSU", "FMIT", "Progs");

    /**
     *  Student extends Human(extends Aged)
     *
     *  Student = (? super Human);
     *  Student != (? extends Human);
     *
     *  Aged = (? extends Human);
     *  Aged != (? super Human);
     */
    @Test
    public void studentsTest(){
        List<? extends Human> listExt = new ArrayList<>();
//        Collections.addAll(listExt, student, student2);
//        Student != ? extends Human;

        List<? super Human> listSup = new ArrayList<>();
        Collections.addAll(listSup, student, student1);
//        Student = ? super Human;

//        assertEquals(humanAgeExt.applyAsInt(student), 18);
        assertEquals(humanAgeSup.applyAsInt(student), 18);
    }
}
