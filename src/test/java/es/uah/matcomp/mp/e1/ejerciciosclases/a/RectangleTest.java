package es.uah.matcomp.mp.e1.ejerciciosclases.a;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void areaNormal() {
        Rectangle r = new Rectangle(2, 3);
        assertEquals(6, r.getArea());
    }

    @Test
    void areaZero() {
        Rectangle r = new Rectangle(0, 5);
        assertEquals(0, r.getArea());
    }

    @Test
    void perimeter() {
        Rectangle r = new Rectangle(2, 3);
        assertEquals(10, r.getPerimeter());
    }

    @Test
    void toStringTest() {
        Rectangle r = new Rectangle(2, 3);
        assertTrue(r.toString().contains("2"));
    }
}