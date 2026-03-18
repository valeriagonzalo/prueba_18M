package es.uah.matcomp.mp.e1.ejerciciosclases.c;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Point2DTest {

    @Test
    void testDefaultConstructor() {
        Point2D point = new Point2D();
        assertEquals(0.0f, point.getX());
        assertEquals(0.0f, point.getY());
        assertArrayEquals(new float[]{0.0f, 0.0f}, point.getXY());
    }

    @Test
    void testConstructorWithCoordinates() {
        Point2D point = new Point2D(1.5f, 2.5f);
        assertEquals(1.5f, point.getX());
        assertEquals(2.5f, point.getY());
    }

    @Test
    void testSetters() {
        Point2D point = new Point2D();
        point.setX(3.3f);
        point.setY(4.4f);
        assertEquals(3.3f, point.getX());
        assertEquals(4.4f, point.getY());

        point.setXY(5.5f, 6.6f);
        assertEquals(5.5f, point.getX());
        assertEquals(6.6f, point.getY());
    }

    @Test
    void testToString() {
        Point2D point = new Point2D(7.7f, 8.8f);
        assertEquals("(7.7, 8.8)", point.toString());
    }
}