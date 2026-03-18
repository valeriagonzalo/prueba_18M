package es.uah.matcomp.mp.e1.ejerciciosclases.d;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MovableCircleTest {

    @Test
    void testConstructor() {
        MovableCircle circle = new MovableCircle(5, 10, 2, 3, 4);
        assertNotNull(circle);

        assertEquals("(5, 10) speed = (2, 3), radius = 4", circle.toString());
    }

    @Test
    void testMoveUp() {
        MovableCircle circle = new MovableCircle(5, 10, 2, 3, 4);
        circle.moveUp();

        assertEquals("(5, 13) speed = (2, 3), radius = 4", circle.toString());
    }

    @Test
    void testMoveDown() {
        MovableCircle circle = new MovableCircle(5, 10, 2, 3, 4);
        circle.moveDown();

        assertEquals("(5, 7) speed = (2, 3), radius = 4", circle.toString());
    }

    @Test
    void testMoveLeft() {
        MovableCircle circle = new MovableCircle(5, 10, 2, 3, 4);
        circle.moveLeft();

        assertEquals("(3, 10) speed = (2, 3), radius = 4", circle.toString());
    }

    @Test
    void testMoveRight() {
        MovableCircle circle = new MovableCircle(5, 10, 2, 3, 4);
        circle.moveRight();

        assertEquals("(7, 10) speed = (2, 3), radius = 4", circle.toString());
    }

    @Test
    void testMovimientosCombinados() {
        MovableCircle circle = new MovableCircle(0, 0, 1, 1, 5);

        circle.moveRight();
        circle.moveUp();
        assertEquals("(1, 1) speed = (1, 1), radius = 5", circle.toString());

        circle.moveRight();
        circle.moveRight();
        circle.moveUp();
        assertEquals("(3, 2) speed = (1, 1), radius = 5", circle.toString());

        circle.moveLeft();
        circle.moveDown();
        assertEquals("(2, 1) speed = (1, 1), radius = 5", circle.toString());
    }

    @Test
    void testMovimientosConVelocidadesCero() {
        MovableCircle circle = new MovableCircle(5, 5, 0, 0, 3);

        circle.moveUp();
        circle.moveDown();
        circle.moveLeft();
        circle.moveRight();

        assertEquals("(5, 5) speed = (0, 0), radius = 3", circle.toString());
    }

    @Test
    void testMovimientosConVelocidadesNegativas() {
        MovableCircle circle = new MovableCircle(10, 10, -2, -3, 2);

        circle.moveUp();
        circle.moveRight();

        assertEquals("(8, 7) speed = (-2, -3), radius = 2", circle.toString());
    }

    @Test
    void testRadioDiferente() {
        MovableCircle circle1 = new MovableCircle(0, 0, 1, 1, 10);
        assertEquals("(0, 0) speed = (1, 1), radius = 10", circle1.toString());

        MovableCircle circle2 = new MovableCircle(0, 0, 1, 1, 1);
        assertEquals("(0, 0) speed = (1, 1), radius = 1", circle2.toString());

        MovableCircle circle3 = new MovableCircle(0, 0, 1, 1, 0);
        assertEquals("(0, 0) speed = (1, 1), radius = 0", circle3.toString());
    }

    @Test
    void testToString() {
        MovableCircle circle = new MovableCircle(3, 4, 5, 6, 7);
        assertEquals("(3, 4) speed = (5, 6), radius = 7", circle.toString());

        MovableCircle circle2 = new MovableCircle(-2, -3, 1, 2, 4);
        assertEquals("(-2, -3) speed = (1, 2), radius = 4", circle2.toString());
    }

    @Test
    void testImplementacionInterfaz() {
        MovableCircle circle = new MovableCircle(1, 2, 3, 4, 5);
        assertTrue(circle instanceof Movable);

        Movable movable = circle;
        movable.moveUp();
        movable.moveRight();

        assertEquals("(4, 6) speed = (3, 4), radius = 5", circle.toString());
    }

    @Test
    void testIndependenciaDeObjetos() {
        MovableCircle circle1 = new MovableCircle(0, 0, 1, 1, 2);
        MovableCircle circle2 = new MovableCircle(10, 10, 2, 2, 5);

        circle1.moveRight();
        circle1.moveUp();

        assertEquals("(1, 1) speed = (1, 1), radius = 2", circle1.toString());
        assertEquals("(10, 10) speed = (2, 2), radius = 5", circle2.toString());

        circle2.moveLeft();
        circle2.moveDown();

        assertEquals("(1, 1) speed = (1, 1), radius = 2", circle1.toString());
        assertEquals("(8, 8) speed = (2, 2), radius = 5", circle2.toString());
    }

    @Test
    void testDelegacionCorrecta() {
        MovableCircle circle = new MovableCircle(5, 5, 2, 3, 4);

        circle.moveUp();
        circle.moveRight();
        circle.moveDown();
        circle.moveLeft();

        assertEquals("(5, 5) speed = (2, 3), radius = 4", circle.toString());
    }
}