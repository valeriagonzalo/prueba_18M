package es.uah.matcomp.mp.e1.ejerciciosclases.d;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MovablePointTest {

    @Test
    void testConstructor() {
        MovablePoint point = new MovablePoint(5, 10, 2, 3);
        assertEquals(5, point.x);
        assertEquals(10, point.y);
        assertEquals(2, point.xSpeed);
        assertEquals(3, point.ySpeed);
    }

    @Test
    void testMoveUp() {
        MovablePoint point = new MovablePoint(5, 10, 2, 3);
        point.moveUp();
        assertEquals(5, point.x);
        assertEquals(13, point.y);
        assertEquals(2, point.xSpeed);
        assertEquals(3, point.ySpeed);
    }

    @Test
    void testMoveDown() {
        MovablePoint point = new MovablePoint(5, 10, 2, 3);
        point.moveDown();
        assertEquals(5, point.x);
        assertEquals(7, point.y);
        assertEquals(2, point.xSpeed);
        assertEquals(3, point.ySpeed);
    }

    @Test
    void testMoveLeft() {
        MovablePoint point = new MovablePoint(5, 10, 2, 3);
        point.moveLeft();
        assertEquals(3, point.x);
        assertEquals(10, point.y);
        assertEquals(2, point.xSpeed);
        assertEquals(3, point.ySpeed);
    }

    @Test
    void testMoveRight() {
        MovablePoint point = new MovablePoint(5, 10, 2, 3);
        point.moveRight();
        assertEquals(7, point.x);
        assertEquals(10, point.y);
        assertEquals(2, point.xSpeed);
        assertEquals(3, point.ySpeed);
    }

    @Test
    void testMovimientosCombinados() {
        MovablePoint point = new MovablePoint(0, 0, 1, 1);

        point.moveRight();
        point.moveUp();
        assertEquals(1, point.x);
        assertEquals(1, point.y);

        point.moveRight();
        point.moveRight();
        point.moveUp();
        assertEquals(3, point.x);
        assertEquals(2, point.y);

        point.moveLeft();
        point.moveDown();
        assertEquals(2, point.x);
        assertEquals(1, point.y);
    }

    @Test
    void testMovimientosConVelocidadesCero() {
        MovablePoint point = new MovablePoint(5, 5, 0, 0);

        point.moveUp();
        point.moveDown();
        point.moveLeft();
        point.moveRight();

        assertEquals(5, point.x);
        assertEquals(5, point.y);
    }

    @Test
    void testMovimientosConVelocidadesNegativas() {
        MovablePoint point = new MovablePoint(10, 10, -2, -3);

        point.moveUp();
        point.moveRight();

        assertEquals(8, point.x);
        assertEquals(7, point.y);
    }

    @Test
    void testToString() {
        MovablePoint point = new MovablePoint(5, 10, 2, 3);
        assertEquals("(5, 10) speed = (2, 3)", point.toString());

        MovablePoint point2 = new MovablePoint(-3, 7, -1, 5);
        assertEquals("(-3, 7) speed = (-1, 5)", point2.toString());
    }

    @Test
    void testImplementacionInterfaz() {
        MovablePoint point = new MovablePoint(1, 2, 3, 4);
        assertTrue(point instanceof Movable);

        Movable movable = point;
        movable.moveUp();
        movable.moveRight();

        assertEquals(4, ((MovablePoint)movable).x);
        assertEquals(6, ((MovablePoint)movable).y);
    }
}