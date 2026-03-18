package es.uah.matcomp.mp.e1.ejerciciosclases.c;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {

    @Test
    void testDefaultConstructor() {
        Animal animal = new Animal();
        assertEquals("Animal: [name = ]", animal.toString());
    }

    @Test
    void testConstructorWithName() {
        Animal animal = new Animal("Generic Animal");
        assertEquals("Animal: [name = Generic Animal]", animal.toString());
    }
}