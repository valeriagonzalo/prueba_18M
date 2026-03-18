package es.uah.matcomp.mp.e1.ejerciciosclases.d.GeometricObject_Resizable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ResizableCircleTest {

    @Test
    void testConstructor() {
        ResizableCircle circle = new ResizableCircle(5.0);
        assertNotNull(circle);
    }

    @Test
    void testGetArea() {
        ResizableCircle circle = new ResizableCircle(3.0);
        assertEquals(Math.PI * 9, circle.getArea(), 0.001);
    }

    @Test
    void testGetPerimeter() {
        ResizableCircle circle = new ResizableCircle(3.0);
        assertEquals(2 * Math.PI * 3, circle.getPerimeter(), 0.001);
    }

    @Test
    void testResize() {
        ResizableCircle circle = new ResizableCircle(10.0);

        // Reducir al 50%
        circle.resize(50);
        assertEquals(5.0, circle.radius, 0.001);
        assertEquals(Math.PI * 25, circle.getArea(), 0.001);

        // Aumentar al 200%
        circle.resize(200);
        assertEquals(10.0, circle.radius, 0.001);
        assertEquals(Math.PI * 100, circle.getArea(), 0.001);

        // Reducir al 75%
        circle.resize(75);
        assertEquals(7.5, circle.radius, 0.001);
        assertEquals(Math.PI * 56.25, circle.getArea(), 0.001);
    }

    @Test
    void testResizeConValoresExtremos() {
        ResizableCircle circle = new ResizableCircle(10.0);

        // Reducir al 0%
        circle.resize(0);
        assertEquals(0.0, circle.radius, 0.001);

        circle = new ResizableCircle(10.0);
        // Aumentar al 1000%
        circle.resize(1000);
        assertEquals(100.0, circle.radius, 0.001);
    }

    @Test
    void testResizeConDecimales() {
        ResizableCircle circle = new ResizableCircle(10.0);

        // Reducir al 33%
        circle.resize(33);
        assertEquals(3.3, circle.radius, 0.001);
    }

    @Test
    void testToString() {
        ResizableCircle circle = new ResizableCircle(4.5);
        assertEquals("ResizableCircle: [Circle: [radius = 4.5]]", circle.toString());
    }

    @Test
    void testImplementacionInterfaces() {
        ResizableCircle circle = new ResizableCircle(5.0);

        assertTrue(circle instanceof GeometricObject);
        assertTrue(circle instanceof Resizable);
        assertTrue(circle instanceof SecondCircle);

        // Test como GeometricObject
        GeometricObject geo = circle;
        assertEquals(Math.PI * 25, geo.getArea(), 0.001);
        assertEquals(10 * Math.PI, geo.getPerimeter(), 0.001);

        // Test como Resizable
        Resizable resizable = circle;
        resizable.resize(50);
        assertEquals(2.5, ((ResizableCircle)resizable).radius, 0.001);
    }
}