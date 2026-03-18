package es.uah.matcomp.mp.e1.ejerciciosclases.c;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MammalTest {

    @Test
    void testDefaultConstructor() {
        Mammal mammal = new Mammal();
        assertEquals("Mammal: [Animal: [name = ]]", mammal.toString());
    }

    @Test
    void testConstructorWithName() {
        Mammal mammal = new Mammal("Generic Mammal");
        assertEquals("Mammal: [Animal: [name = Generic Mammal]]", mammal.toString());
    }
}