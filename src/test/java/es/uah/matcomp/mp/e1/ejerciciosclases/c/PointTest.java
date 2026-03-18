package es.uah.matcomp.mp.e1.ejerciciosclases.c;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PointTest {

    @Test
    void testDefaultConstructor() {
        Point point = new Point();
        assertEquals(0.0f, point.getX());
        assertEquals(0.0f, point.getY());
        assertArrayEquals(new float[]{0.0f, 0.0f}, point.getXYZ());
    }

    @Test
    void testConstructorWithCoordinates() {
        Point point = new Point(2.5f, 3.7f);
        assertEquals(2.5f, point.getX());
        assertEquals(3.7f, point.getY());
    }

    @Test
    void testSetters() {
        Point point = new Point();
        point.setX(4.2f);
        point.setY(5.8f);
        assertEquals(4.2f, point.getX());
        assertEquals(5.8f, point.getY());

        point.setXY(1.1f, 2.2f);
        assertEquals(1.1f, point.getX());
        assertEquals(2.2f, point.getY());
    }

    @Test
    void testToString() {
        Point point = new Point(3.14f, 2.71f);
        assertEquals("(3.14, 2.71)", point.toString());
    }
}