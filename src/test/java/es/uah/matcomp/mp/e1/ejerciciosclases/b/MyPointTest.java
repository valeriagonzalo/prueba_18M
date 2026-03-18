package es.uah.matcomp.mp.e1.ejerciciosclases.b;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPointTest {

    @Test
    void testConstructors() {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(3, 4);

        assertEquals(0, p1.getX());
        assertEquals(4, p2.getY());
    }

    @Test
    void testSetters() {
        MyPoint p = new MyPoint();
        p.setXY(5, 6);

        assertEquals(5, p.getX());
        assertEquals(6, p.getY());
    }

    @Test
    void testDistance() {
        MyPoint p1 = new MyPoint(0,0);
        MyPoint p2 = new MyPoint(3,4);

        assertEquals(5.0, p1.distance(p2));
    }
}