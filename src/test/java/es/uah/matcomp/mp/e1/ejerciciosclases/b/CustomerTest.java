package es.uah.matcomp.mp.e1.ejerciciosclases.b;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void testConstructor() {
        Customer c = new Customer(1, "Luis", 10);
        assertEquals(1, c.getId());
        assertEquals("Luis", c.getName());
        assertEquals(10, c.getDiscount());
    }

    @Test
    void testSetDiscount() {
        Customer c = new Customer(1, "Luis", 10);
        c.setDiscount(20);
        assertEquals(20, c.getDiscount());
    }

    @Test
    void testToString() {
        Customer c = new Customer(1, "Luis", 10);
        assertTrue(c.toString().contains("Luis"));
    }
}