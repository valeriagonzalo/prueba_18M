package es.uah.matcomp.mp.e1.ejerciciosclases.a;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void getName() {
        Employee e = new Employee(1, "Juan", "Perez", 1000);
        assertEquals("Juan Perez", e.getName());
    }

    @Test
    void getSalary() {
        Employee e = new Employee(1, "Juan", "Perez", 1000);
        assertEquals(1000, e.getSalary());
    }

    @Test
    void setSalary() {
        Employee e = new Employee(1, "Juan", "Perez", 1000);
        e.setSalary(1200);
        assertEquals(1200, e.getSalary());
    }

    @Test
    void getAnnualSalary() {
        Employee e = new Employee(1, "Juan", "Perez", 1000);
        assertEquals(12000, e.getAnnualSalary());
    }

    @Test
    void raiseSalary() {
        Employee e = new Employee(1, "Juan", "Perez", 1000);
        e.raiseSalary(10);
        assertEquals(1100, e.getSalary());
    }

    @Test
    void testToString() {
        Employee e = new Employee(1, "Juan", "Perez", 1000);
        assertTrue(e.toString().contains("Juan"));
    }


}