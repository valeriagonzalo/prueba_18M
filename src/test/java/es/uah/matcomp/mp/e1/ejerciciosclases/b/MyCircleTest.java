package es.uah.matcomp.mp.e1.ejerciciosclases.b;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCircleTest {

    @Test
    void testConstructor() {
        MyCircle c = new MyCircle(1,2,3);
        assertEquals(3, c.getRadius());
    }

    @Test
    void testAreaPerimeter() {
        MyCircle c = new MyCircle(0,0,1);
        assertEquals(Math.PI, c.getArea());
        assertEquals(2*Math.PI, c.getCircumference());
    }

    @Test
    void testDistance() {
        MyCircle c1 = new MyCircle(0,0,1);
        MyCircle c2 = new MyCircle(3,4,1);

        assertEquals(5.0, c1.distance(c2));
    }
}