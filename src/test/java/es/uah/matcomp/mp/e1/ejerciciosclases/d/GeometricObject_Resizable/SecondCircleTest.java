package es.uah.matcomp.mp.e1.ejerciciosclases.d.GeometricObject_Resizable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondCircleTest {

    @Test
    void testConstructor() {
        SecondCircle circle = new SecondCircle(2.5);
        assertNotNull(circle);
    }

    @Test
    void testGetArea() {
        SecondCircle circle = new SecondCircle(3.0);
        assertEquals(Math.PI * 9, circle.getArea(), 0.001);

        SecondCircle circle2 = new SecondCircle(1.5);
        assertEquals(Math.PI * 2.25, circle2.getArea(), 0.001);
    }

    @Test
    void testGetPerimeter() {
        SecondCircle circle = new SecondCircle(3.0);
        assertEquals(2 * Math.PI * 3, circle.getPerimeter(), 0.001);

        SecondCircle circle2 = new SecondCircle(1.5);
        assertEquals(2 * Math.PI * 1.5, circle2.getPerimeter(), 0.001);
    }

    @Test
    void testToString() {
        SecondCircle circle = new SecondCircle(4.2);
        assertEquals("Circle: [radius = 4.2]", circle.toString());
    }

    @Test
    void testImplementacionInterfaz() {
        SecondCircle circle = new SecondCircle(2.0);
        assertTrue(circle instanceof GeometricObject);

        GeometricObject geo = circle;
        assertEquals(Math.PI * 4, geo.getArea(), 0.001);
        assertEquals(4 * Math.PI, geo.getPerimeter(), 0.001);
    }

    @Test
    void testAccesoProtected() {
        class TestCircle extends SecondCircle {
            public TestCircle(double r) {
                super(r);
            }

            public double getRadiusDirect() {
                return radius;
            }
        }

        TestCircle testCircle = new TestCircle(3.5);
        assertEquals(3.5, testCircle.getRadiusDirect(), 0.001);
    }
}