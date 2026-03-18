package es.uah.matcomp.mp.e1.ejerciciosclases.c.Shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {

    @Test
    void testDefaultConstructor() {
        Circle circle = new Circle();
        assertEquals(1.0, circle.getRadius());
        assertEquals("red", circle.getColor());
        assertTrue(circle.isFilled());
        assertEquals(Math.PI, circle.getArea(), 0.001);
        assertEquals(2 * Math.PI, circle.getPerimeter(), 0.001);
    }

    @Test
    void testConstructorWithRadius() {
        Circle circle = new Circle(2.5);
        assertEquals(2.5, circle.getRadius());
        assertEquals("red", circle.getColor());
        assertTrue(circle.isFilled());
    }

    @Test
    void testConstructorWithAllParameters() {
        Circle circle = new Circle(3.0, "blue", false);
        assertEquals(3.0, circle.getRadius());
        assertEquals("blue", circle.getColor());
        assertFalse(circle.isFilled());
    }

    @Test
    void testSetRadius() {
        Circle circle = new Circle();
        circle.setRadius(4.2);
        assertEquals(4.2, circle.getRadius());
    }

    @Test
    void testGetArea() {
        Circle circle = new Circle(5.0);
        assertEquals(Math.PI * 25, circle.getArea(), 0.001);
    }

    @Test
    void testGetPerimeter() {
        Circle circle = new Circle(5.0);
        assertEquals(2 * Math.PI * 5, circle.getPerimeter(), 0.001);
    }

    @Test
    void testToString() {
        Circle circle = new Circle(2.0, "purple", true);
        assertEquals("Circle: [ Shape: [color = purple, filled = true], radius = 2.0]", circle.toString());
    }
}