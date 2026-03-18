package es.uah.matcomp.mp.e1.ejerciciosclases.a;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BallTest {

    @Test
    void constructorYGetters() {
        Ball b = new Ball(1.0f, 2.0f, 3, 4.0f, 5.0f);

        assertEquals(1.0f, b.getX());
        assertEquals(2.0f, b.getY());
        assertEquals(3, b.getRadius());
        assertEquals(4.0f, b.getXDelta());
        assertEquals(5.0f, b.getYDelta());
    }

    @Test
    void setXY() {
        Ball b = new Ball(0, 0, 1, 0, 0);
        b.setX(5.0f);
        b.setY(6.0f);

        assertEquals(5.0f, b.getX());
        assertEquals(6.0f, b.getY());
    }

    @Test
    void move() {
        Ball b = new Ball(1.0f, 2.0f, 1, 3.0f, 4.0f);
        b.move();

        assertEquals(4.0f, b.getX()); // 1 + 3
        assertEquals(6.0f, b.getY()); // 2 + 4
    }

    @Test
    void reflectHorizontal() {
        Ball b = new Ball(0, 0, 1, 2.0f, 3.0f);
        b.reflectHorizontal();

        assertEquals(-2.0f, b.getXDelta());
        assertEquals(3.0f, b.getYDelta());
    }

    @Test
    void reflectVertical() {
        Ball b = new Ball(0, 0, 1, 2.0f, 3.0f);
        b.reflectVertical();

        assertEquals(2.0f, b.getXDelta());
        assertEquals(-3.0f, b.getYDelta());
    }

    @Test
    void testToString() {
        Ball b = new Ball(1, 2, 3, 4, 5);
        assertTrue(b.toString().contains("1"));
    }
}