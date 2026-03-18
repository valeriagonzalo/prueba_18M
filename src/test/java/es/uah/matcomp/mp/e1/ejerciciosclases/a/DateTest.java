package es.uah.matcomp.mp.e1.ejerciciosclases.a;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
    void setDate() {
        Date d = new Date(1, 1, 2000);
        d.setDate(31, 12, 2025);

        assertEquals(31, d.getDay());
        assertEquals(12, d.getMonth());
        assertEquals(2025, d.getYear());
    }

    @Test
    void changeYear() {
        Date d = new Date(1, 1, 2000);
        d.setYear(2024);
        assertEquals(2024, d.getYear());
    }

    @Test
    void toStringTest() {
        Date d = new Date(15, 3, 2024);
        assertTrue(d.toString().contains("15"));
    }
}