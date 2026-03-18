package es.uah.matcomp.mp.e1.ejerciciosclases.c.Shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    @Test
    void testDefaultConstructor() {
        Rectangle rectangle = new Rectangle();
        assertEquals(1.0, rectangle.getWidth());
        assertEquals(1.0, rectangle.getLenght());
        assertEquals("red", rectangle.getColor());
        assertTrue(rectangle.isFilled());
    }

    @Test
    void testConstructorWithParameters() {
        Rectangle rectangle = new Rectangle(2.5, 3.0, "green", false);
        assertEquals(2.5, rectangle.getWidth());
        assertEquals(3.0, rectangle.getLenght());
        assertEquals("green", rectangle.getColor());
        assertFalse(rectangle.isFilled());
    }

    @Test
    void testSetters() {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(4.0);
        rectangle.setLenght(5.0);
        rectangle.setColor("yellow");
        rectangle.setFilled(true);

        assertEquals(4.0, rectangle.getWidth());
        assertEquals(5.0, rectangle.getLenght());
        assertEquals("yellow", rectangle.getColor());
        assertTrue(rectangle.isFilled());
    }

    @Test
    void testGetArea() {
        Rectangle rectangle = new Rectangle(3.0, 4.0, "blue", true);
        assertEquals(12.0, rectangle.getArea(), 0.001);
    }

    @Test
    void testGetPerimeter() {
        Rectangle rectangle = new Rectangle(3.0, 4.0, "blue", true);
        assertEquals(14.0, rectangle.getPerimeter(), 0.001);
    }

    @Test
    void testToString() {
        Rectangle rectangle = new Rectangle(2.0, 3.0, "orange", false);
        assertEquals("Rectangle[ Shape: [color = orange, filled = false], width = 2.0, height = 3.0]", rectangle.toString());
    }
}