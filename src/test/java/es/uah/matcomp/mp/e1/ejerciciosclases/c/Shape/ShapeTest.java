package es.uah.matcomp.mp.e1.ejerciciosclases.c.Shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShapeTest {

    @Test
    void testDefaultConstructor() {
        Shape shape = new Shape();
        assertEquals("red", shape.getColor());
        assertTrue(shape.isFilled());
    }

    @Test
    void testConstructorWithParameters() {
        Shape shape = new Shape("blue", false);
        assertEquals("blue", shape.getColor());
        assertFalse(shape.isFilled());
    }

    @Test
    void testSetters() {
        Shape shape = new Shape();
        shape.setColor("green");
        shape.setFilled(false);

        assertEquals("green", shape.getColor());
        assertFalse(shape.isFilled());
    }

    @Test
    void testToString() {
        Shape shape = new Shape("yellow", true);
        assertEquals(" Shape: [color = yellow, filled = true]", shape.toString());

        shape.setFilled(false);
        assertEquals(" Shape: [color = yellow, filled = false]", shape.toString());
    }
}