package es.uah.matcomp.mp.e1.ejerciciosclases.d.GeometricObject_Resizable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {

    @Test
    void testConstructor() {
        Circle circle = new Circle(2.5);
        assertNotNull(circle);
    }

    @Test
    void testGetArea() {
        Circle circle = new Circle(3.0);
        assertEquals(Math.PI * 9, circle.getArea(), 0.001);

        Circle circle2 = new Circle(1.5);
        assertEquals(Math.PI * 2.25, circle2.getArea(), 0.001);
    }

    @Test
    void testGetPerimeter() {
        Circle circle = new Circle(3.0);
        assertEquals(2 * Math.PI * 3, circle.getPerimeter(), 0.001);

        Circle circle2 = new Circle(1.5);
        assertEquals(2 * Math.PI * 1.5, circle2.getPerimeter(), 0.001);
    }

    @Test
    void testToString() {
        Circle circle = new Circle(4.2);
        assertEquals("Circle: [radius = 4.2]", circle.toString());
    }

    @Test
    void testImplementacionInterfaz() {
        Circle circle = new Circle(2.0);
        assertTrue(circle instanceof GeometricObject);

        GeometricObject geo = circle;
        assertEquals(Math.PI * 4, geo.getArea(), 0.001);
        assertEquals(4 * Math.PI, geo.getPerimeter(), 0.001);
    }
}