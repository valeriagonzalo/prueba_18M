package es.uah.matcomp.mp.e1.ejerciciosclases.d.AbstractShape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {

    @Test
    void testDefaultConstructor() {
        Square square = new Square();
        assertEquals(1.0, square.getWidth());
        assertEquals(1.0, square.getLength());
        assertEquals(1.0, square.getSide());
        assertEquals("red", square.getColor());
        assertTrue(square.isFilled());
    }

    @Test
    void testConstructorWithSide() {
        Square square = new Square(2.5);
        assertEquals(2.5, square.getWidth());
        assertEquals(2.5, square.getLength());
        assertEquals(2.5, square.getSide());
        assertEquals("red", square.getColor());
        assertTrue(square.isFilled());
    }

    @Test
    void testConstructorWithAllParameters() {
        Square square = new Square(3.0, "purple", false);
        assertEquals(3.0, square.getWidth());
        assertEquals(3.0, square.getLength());
        assertEquals(3.0, square.getSide());
        assertEquals("purple", square.getColor());
        assertFalse(square.isFilled());
    }

    @Test
    void testSetSide() {
        Square square = new Square();
        square.setSide(4.2);
        assertEquals(4.2, square.getWidth());
        assertEquals(4.2, square.getLength());
        assertEquals(4.2, square.getSide());
    }

    @Test
    void testSetWidth() {
        Square square = new Square(2.0);
        square.setWidth(3.5);
        assertEquals(3.5, square.getWidth());
        assertEquals(3.5, square.getLength());
        assertEquals(3.5, square.getSide());
    }

    @Test
    void testSetLength() {
        Square square = new Square(2.0);
        square.setLength(3.5);
        assertEquals(3.5, square.getWidth());
        assertEquals(3.5, square.getLength());
        assertEquals(3.5, square.getSide());
    }

    @Test
    void testSetColor() {
        Square square = new Square(2.0);
        square.setColor("cyan");
        assertEquals("cyan", square.getColor());
    }

    @Test
    void testSetFilled() {
        Square square = new Square(2.0);
        square.setFilled(false);
        assertFalse(square.isFilled());
        square.setFilled(true);
        assertTrue(square.isFilled());
    }

    @Test
    void testGetArea() {
        Square square = new Square(4.0);
        assertEquals(16.0, square.getArea(), 0.001);
    }

    @Test
    void testGetPerimeter() {
        Square square = new Square(4.0);
        assertEquals(16.0, square.getPerimeter(), 0.001);
    }

    @Test
    void testToString() {
        Square square = new Square(2.5, "magenta", true);
        assertEquals("Square: [Rectangle: [Shape: [color = magenta, filled = true], width = 2.5, length = 2.5]]", square.toString());
    }
}