package es.uah.matcomp.mp.e1.ejerciciosclases.b;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    @Test
    void testConstructorAndGetters() {
        Customer c = new Customer(1, "Luis", 10);
        Invoice i = new Invoice(1, c, 100.0);

        assertEquals(1, i.getId());
        assertEquals(c, i.getCustomer());
        assertEquals(100.0, i.getAmount());
    }

    @Test
    void testSetAmount() {
        Customer c = new Customer(1, "Luis", 10);
        Invoice i = new Invoice(1, c, 100.0);

        i.setAmount(200.0);
        assertEquals(200.0, i.getAmount());
    }

    @Test
    void testGetCustomerNameAndDiscount() {
        Customer c = new Customer(1, "Luis", 10);
        Invoice i = new Invoice(1, c, 100.0);

        assertEquals("Luis", i.getCustomerName());
        assertEquals(10, i.getCustomerDiscount());
    }

    @Test
    void testGetAmountAfterDiscount() {
        Customer c = new Customer(1, "Luis", 10);
        Invoice i = new Invoice(1, c, 100.0);

        assertEquals(90.0, i.getAmountAfterDiscount());
    }
}