package es.uah.matcomp.mp.e1.ejerciciosclases.d.GeometricObject_Resizable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    @Test
    void testConstructor() {
        Rectangle rectangle = new Rectangle(2.0, 3.0);
        assertNotNull(rectangle);
    }

    @Test
    void testGetArea() {
        Rectangle rectangle = new Rectangle(2.0, 3.0);
        assertEquals(6.0, rectangle.getArea(), 0.001);

        Rectangle rectangle2 = new Rectangle(2.5, 4.0);
        assertEquals(10.0, rectangle2.getArea(), 0.001);
    }

    @Test
    void testGetPerimeter() {
        Rectangle rectangle = new Rectangle(2.0, 3.0);
        assertEquals(10.0, rectangle.getPerimeter(), 0.001);

        Rectangle rectangle2 = new Rectangle(2.5, 4.0);
        assertEquals(13.0, rectangle2.getPerimeter(), 0.001);
    }

    @Test
    void testToString() {
        Rectangle rectangle = new Rectangle(3.5, 5.2);
        assertEquals("Rectangle[width = 3.5, lenght = 5.2]", rectangle.toString());
    }

    @Test
    void testImplementacionInterfaz() {
        Rectangle rectangle = new Rectangle(2.0, 3.0);
        assertTrue(rectangle instanceof GeometricObject);

        GeometricObject geo = rectangle;
        assertEquals(6.0, geo.getArea(), 0.001);
        assertEquals(10.0, geo.getPerimeter(), 0.001);
    }
}