package es.uah.matcomp.mp.e1.ejerciciosclases.c.Shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {

    @Test
    void testDefaultConstructor() {
        Square square = new Square();
        assertEquals(1.0, square.getWidth());
        assertEquals(1.0, square.getLenght());
        assertEquals(1.0, square.getSide());
        assertEquals("red", square.getColor());
        assertTrue(square.isFilled());
    }

    @Test
    void testConstructorWithSide() {
        Square square = new Square(2.5);
        assertEquals(2.5, square.getWidth());
        assertEquals(2.5, square.getLenght());
        assertEquals(2.5, square.getSide());
        assertEquals("red", square.getColor());
        assertTrue(square.isFilled());
    }

    @Test
    void testConstructorWithAllParameters() {
        Square square = new Square(3.0, "purple", false);
        assertEquals(3.0, square.getWidth());
        assertEquals(3.0, square.getLenght());
        assertEquals(3.0, square.getSide());
        assertEquals("purple", square.getColor());
        assertFalse(square.isFilled());
    }

    @Test
    void testSetSide() {
        Square square = new Square();
        square.setSide(4.2);
        assertEquals(4.2, square.getWidth());
        assertEquals(4.2, square.getLenght());
        assertEquals(4.2, square.getSide());
    }

    @Test
    void testSetWidth() {
        Square square = new Square(2.0);
        square.setWidth(3.5);
        assertEquals(3.5, square.getWidth());
        assertEquals(3.5, square.getLenght());
        assertEquals(3.5, square.getSide());
    }

    @Test
    void testSetLenght() {
        Square square = new Square(2.0);
        square.setLenght(3.5);
        assertEquals(3.5, square.getWidth());
        assertEquals(3.5, square.getLenght());
        assertEquals(3.5, square.getSide());
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
        Square square = new Square(2.5, "cyan", true);
        assertEquals("Square: [Rectangle[ Shape: [color = cyan, filled = true], width = 2.5, height = 2.5]]", square.toString());
    }
}
