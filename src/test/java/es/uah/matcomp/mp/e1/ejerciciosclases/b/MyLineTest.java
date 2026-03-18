package es.uah.matcomp.mp.e1.ejerciciosclases.b;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLineTest {

    @Test
    void testLength() {
        MyLine l = new MyLine(0,0,3,4);
        assertEquals(5.0, l.getLenght());
    }

    @Test
    void testGradient() {
        MyLine l = new MyLine(0,0,1,1);
        assertEquals(Math.atan2(1,1), l.getGradient());
    }
}