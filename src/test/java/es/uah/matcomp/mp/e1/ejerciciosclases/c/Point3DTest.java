package es.uah.matcomp.mp.e1.ejerciciosclases.c;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Point3DTest {

    @Test
    void testDefaultConstructor() {
        Point3D point = new Point3D();
        assertEquals(0.0f, point.getX());
        assertEquals(0.0f, point.getY());
        assertEquals(0.0f, point.getZ());
    }

    @Test
    void testConstructorWithCoordinates() {
        Point3D point = new Point3D(1.1f, 2.2f, 3.3f);
        assertEquals(1.1f, point.getX());
        assertEquals(2.2f, point.getY());
        assertEquals(3.3f, point.getZ());
    }

    @Test
    void testGettersAndSetters() {
        Point3D point = new Point3D();

        point.setZ(4.4f);
        assertEquals(4.4f, point.getZ());

        point.setXYZ(5.5f, 6.6f, 7.7f);
        assertEquals(5.5f, point.getX());
        assertEquals(6.6f, point.getY());
        assertEquals(7.7f, point.getZ());

        float[] xyz = point.getXYZ();
        assertArrayEquals(new float[]{5.5f, 6.6f, 7.7f}, xyz);
    }

    @Test
    void testToString() {
        Point3D point = new Point3D(8.8f, 9.9f, 10.1f);
        assertEquals("(8.8,9.9,10.1)", point.toString());
    }
}