package es.uah.matcomp.mp.e1.ejerciciosclases.c;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StaffTest {

    @Test
    void testConstructor() {
        Staff staff = new Staff("Dr. Smith", "123 School St", "Engineering School", 75000.0);
        assertEquals("Dr. Smith", staff.getName());
        assertEquals("123 School St", staff.getAdress());
        assertEquals("Engineering School", staff.getSchool());
        assertEquals(75000.0, staff.getPay());
    }

    @Test
    void testSetters() {
        Staff staff = new Staff("Prof. Johnson", "456 College Ave", "Science Dept", 65000.0);
        staff.setSchool("Math Dept");
        staff.setPay(70000.0);

        assertEquals("Math Dept", staff.getSchool());
        assertEquals(70000.0, staff.getPay());
    }

    @Test
    void testToString() {
        Staff staff = new Staff("Dr. Williams", "789 University Blvd", "Medical School", 90000.0);
        String expected = "Staff: [[Person: [name = Dr. Williams, adress = 789 University Blvd]], pay = 90000.0]";
        assertEquals(expected, staff.toString());
    }
}