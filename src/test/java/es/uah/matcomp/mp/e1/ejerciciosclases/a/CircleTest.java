package es.uah.matcomp.mp.e1.ejerciciosclases.a;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        Circle c = new Circle(2.0);
        assertEquals(2.0, c.getRadius());
    }

    @Test
    void setRadius() {
        Circle c = new Circle();
        c.setRadius(3.0);
        assertEquals(3.0, c.getRadius());
    }

    @Test
    void getArea() {
        Circle c = new Circle(1.0);
        assertEquals(Math.PI, c.getArea(), 0.0001);
    }

    @Test
    void getCircumference() {
        Circle c = new Circle(1.0);
        assertEquals(2 * Math.PI, c.getCircumference(), 0.0001);
    }

    @Test
    void testToString() {
        Circle c = new Circle(2.0);
        assertTrue(c.toString().contains("2.0"));
    }

    @Test
    void radiusZero() {
        Circle c = new Circle(0);
        assertEquals(0, c.getArea(), 0.0001);
    }
}
