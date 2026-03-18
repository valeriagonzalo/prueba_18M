package es.uah.matcomp.mp.e1.ejerciciosclases.c;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {

    @Test
    void testDefaultConstructor() {
        Circle circle = new Circle();
        assertEquals(1.0, circle.getRadius());
        assertEquals("red", circle.getColor());
        assertEquals(Math.PI, circle.getArea(), 0.001);
    }

    @Test
    void testConstructorWithRadius() {
        Circle circle = new Circle(2.5);
        assertEquals(2.5, circle.getRadius());
        assertEquals("red", circle.getColor());
        assertEquals(Math.PI * 2.5 * 2.5, circle.getArea(), 0.001);
    }

    @Test
    void testConstructorWithRadiusAndColor() {
        Circle circle = new Circle(3.0, "blue");
        assertEquals(3.0, circle.getRadius());
        assertEquals("blue", circle.getColor());
    }

    @Test
    void testSetters() {
        Circle circle = new Circle();
        circle.setRadius(5.0);
        circle.setColor("green");
        assertEquals(5.0, circle.getRadius());
        assertEquals("green", circle.getColor());
    }

    @Test
    void testToString() {
        Circle circle = new Circle(4.2, "yellow");
        assertEquals("Circle[radius = 4.2, color = yellow]", circle.toString());
    }
}