package es.uah.matcomp.mp.e1.ejerciciosclases.d.Animal;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class CatTest {

    @Test
    void testConstructor() {
        Cat cat = new Cat("Whiskers");
        assertNotNull(cat);
    }

    @Test
    void testGreets() {
        Cat cat = new Cat("Whiskers");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        cat.greets();
        System.setOut(System.out);

        assertEquals("Meow\n", outContent.toString());
    }

    @Test
    void testPolimorfismoConAnimal() {
        Animal animal = new Cat("Luna");

        assertTrue(animal instanceof Cat);
        assertTrue(animal instanceof Animal);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        animal.greets();

        System.setOut(System.out);

        assertEquals("Meow\n", outContent.toString());
    }
}