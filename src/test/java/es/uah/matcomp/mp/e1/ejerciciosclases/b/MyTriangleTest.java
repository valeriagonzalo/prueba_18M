package es.uah.matcomp.mp.e1.ejerciciosclases.b;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyTriangleTest {

    @Test
    void testPerimeter() {
        MyTriangle t = new MyTriangle(0,0,3,0,0,4);
        assertEquals(12.0, t.getPerimeter());
    }

    @Test
    void testType() {
        MyTriangle t = new MyTriangle(0,0,1,0,0,1);
        assertNotNull(t.getType());
    }
}