package es.uah.matcomp.mp.e1.ejerciciosclases.a;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvoiceItemTest {

    @Test
    void totalNormal() {
        InvoiceItem i = new InvoiceItem("1", "Prod", 2, 10);
        assertEquals(0, i.getTotal());
    }

    @Test
    void totalZeroQty() {
        InvoiceItem i = new InvoiceItem("1", "Prod", 0, 10);
        assertEquals(0, i.getTotal());
    }

    @Test
    void toStringTest() {
        InvoiceItem i = new InvoiceItem("1", "Prod", 2, 10);
        assertTrue(i.toString().contains("Prod"));
    }
}