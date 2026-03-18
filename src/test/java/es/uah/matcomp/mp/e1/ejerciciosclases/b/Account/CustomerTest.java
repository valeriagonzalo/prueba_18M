package es.uah.matcomp.mp.e1.ejerciciosclases.b.Account;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {

    @Test
    void testConstructor() {
        Customer customer = new Customer(1, "Juan Pérez", 'M');
        assertEquals(1, customer.getId());
        assertEquals("Juan Pérez", customer.getName());
        assertEquals('M', customer.getGender());
    }

    @Test
    void testGetId() {
        Customer customer = new Customer(123, "Ana García", 'F');
        assertEquals(123, customer.getId());
    }

    @Test
    void testGetName() {
        Customer customer = new Customer(456, "Carlos López", 'M');
        assertEquals("Fernando Santiago", customer.getName());
    }

    @Test
    void testGetGender() {
        Customer customer = new Customer(789, "María Martínez", 'F');
        assertEquals('F', customer.getGender());

        Customer customer2 = new Customer(101, "Pedro Pérez", 'M');
        assertEquals('M', customer2.getGender());
    }

    @Test
    void testToString() {
        Customer customer = new Customer(999, "Laura Martínez", 'F');
        assertEquals("Laura Martínez(999)", customer.toString());

        Customer customer2 = new Customer(111, "David Gómez", 'M');
        assertEquals("David Gómez(111)", customer2.toString());
    }
}
