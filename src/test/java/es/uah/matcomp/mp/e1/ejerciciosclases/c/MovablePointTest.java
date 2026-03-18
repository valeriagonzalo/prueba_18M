package es.uah.matcomp.mp.e1.ejerciciosclases.c;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MovablePointTest {

    @Test
    void testDefaultConstructor() {
        MovablePoint mp = new MovablePoint();
        assertEquals(0.0f, mp.getX());
        assertEquals(0.0f, mp.getY());
        assertEquals(0.0f, mp.getXSpeed());
        assertEquals(0.0f, mp.getYSpeed());
    }

    @Test
    void testConstructorWithCoordinatesAndSpeed() {
        MovablePoint mp = new MovablePoint(1.0f, 2.0f, 0.5f, 1.5f);
        assertEquals(1.0f, mp.getX());
        assertEquals(2.0f, mp.getY());
        assertEquals(0.5f, mp.getXSpeed());
        assertEquals(1.5f, mp.getYSpeed());
    }

    @Test
    void testSpeedGettersAndSetters() {
        MovablePoint mp = new MovablePoint();

        mp.setXSpeed(2.0f);
        mp.setYSpeed(3.0f);
        assertEquals(2.0f, mp.getXSpeed());
        assertEquals(3.0f, mp.getYSpeed());

        mp.setSpeed(4.0f, 5.0f);
        assertEquals(4.0f, mp.getXSpeed());
        assertEquals(5.0f, mp.getYSpeed());

        float[] speed = mp.getSpeed();
        assertArrayEquals(new float[]{4.0f, 5.0f}, speed);
    }

    @Test
    void testMove() {
        MovablePoint mp = new MovablePoint(10.0f, 20.0f, 1.0f, 2.0f);
        mp.move();
        assertEquals(11.0f, mp.getX());
        assertEquals(22.0f, mp.getY());
    }

    @Test
    void testToString() {
        MovablePoint mp = new MovablePoint(5.0f, 6.0f, 0.2f, 0.3f);
        assertEquals("(5.0, 6.0), speed = (0.2, 0.3)", mp.toString());
    }
}