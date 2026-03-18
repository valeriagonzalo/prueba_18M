package es.uah.matcomp.mp.e1.ejerciciosclases.c;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CylinderTest {

    @Test
    void testDefaultConstructor() {
        Cylinder cylinder = new Cylinder();
        assertEquals(1.0, cylinder.getRadius());
        assertEquals("red", cylinder.getColor());
        assertEquals(1.0, cylinder.getHeight());
        assertEquals(2 * Math.PI + 2 * Math.PI, cylinder.getArea(), 0.001);
        assertEquals(Math.PI, cylinder.getVolume(), 0.001);
    }

    @Test
    void testConstructorWithHeight() {
        Cylinder cylinder = new Cylinder(5.0);
        assertEquals(1.0, cylinder.getRadius());
        assertEquals(5.0, cylinder.getHeight());
    }

    @Test
    void testConstructorWithRadiusAndHeight() {
        Cylinder cylinder = new Cylinder(2.0, 3.0);
        assertEquals(2.0, cylinder.getRadius());
        assertEquals(3.0, cylinder.getHeight());
        assertEquals("red", cylinder.getColor());
    }

    @Test
    void testConstructorWithRadiusHeightAndColor() {
        Cylinder cylinder = new Cylinder(2.5, 4.0, "purple");
        assertEquals(2.5, cylinder.getRadius());
        assertEquals(4.0, cylinder.getHeight());
        assertEquals("purple", cylinder.getColor());
    }

    @Test
    void testGetArea() {
        Cylinder cylinder = new Cylinder(3.0, 2.0);
        double expectedArea = 2 * 2.0 * Math.PI + 2 * (Math.PI * 3.0 * 3.0);
        assertEquals(expectedArea, cylinder.getArea(), 0.001);
    }

    @Test
    void testGetVolume() {
        Cylinder cylinder = new Cylinder(3.0, 2.0);
        double expectedVolume = 2.0 * (Math.PI * 3.0 * 3.0);
        assertEquals(expectedVolume, cylinder.getVolume(), 0.001);
    }

    @Test
    void testToString() {
        Cylinder cylinder = new Cylinder(1.5, 2.5, "orange");
        String expected = "Cylinder: subclass of Circle[radius = 1.5, color = orange]height = 2.5";
        assertEquals(expected, cylinder.toString());
    }
}