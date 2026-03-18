package es.uah.matcomp.mp.e1.ejerciciosclases.a;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void nextSecondNormal() {
        Time t = new Time(10, 20, 30);
        t.nextSecond();
        assertEquals(31, t.getSecond());
    }

    @Test
    void nextSecondOverflow() {
        Time t = new Time(23, 59, 59);
        t.nextSecond();

        assertEquals(0, t.getHour());
        assertEquals(0, t.getMinute());
        assertEquals(0, t.getSecond());
    }

    @Test
    void previousSecondNormal() {
        Time t = new Time(10, 20, 30);
        t.previousSecond();
        assertEquals(29, t.getSecond());
    }

    @Test
    void previousSecondUnderflow() {
        Time t = new Time(0, 0, 0);
        t.previousSecond();

        assertEquals(23, t.getHour());
        assertEquals(59, t.getMinute());
        assertEquals(59, t.getSecond());
    }

    @Test
    void toStringTest() {
        Time t = new Time(10, 20, 30);
        assertTrue(t.toString().contains("10"));
    }
}