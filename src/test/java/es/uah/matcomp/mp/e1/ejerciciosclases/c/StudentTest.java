package es.uah.matcomp.mp.e1.ejerciciosclases.c;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    void testConstructor() {
        Student student = new Student("Alice", "123 Uni Ave", "CS", 2023, 15000.0);
        assertEquals("Alice", student.getName());
        assertEquals("123 Uni Ave", student.getAdress());
        assertEquals("CS", student.getProgram());
        assertEquals(2023, student.getYear());
        assertEquals(15000.0, student.getFee());
    }

    @Test
    void testSetters() {
        Student student = new Student("Bob", "456 College Rd", "Math", 2022, 12000.0);
        student.setProgram("Physics");
        student.setYear(2024);
        student.setFee(14000.0);

        assertEquals("Physics", student.getProgram());
        assertEquals(2024, student.getYear());
        assertEquals(14000.0, student.getFee());
    }

    @Test
    void testToString() {
        Student student = new Student("Charlie", "789 Campus Dr", "Engineering", 2023, 16000.0);
        String expected = "Student: [[Person: [name = Charlie, adress = 789 Campus Dr]], program = Engineering, year = 2023, fee = 16000.0]";
        assertEquals(expected, student.toString());
    }
}