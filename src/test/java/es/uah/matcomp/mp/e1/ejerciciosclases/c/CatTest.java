package es.uah.matcomp.mp.e1.ejerciciosclases.c;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class CatTest {

    @Test
    void testConstructor() {
        Cat cat = new Cat("Whiskers");
        assertEquals("Cat: [Mammal: [Animal: [name = Whiskers]]]", cat.toString());
    }

    @Test
    void testGreets() {
        Cat cat = new Cat("Whiskers");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        cat.greets();

        assertEquals("Meow\n", outContent.toString());
        System.setOut(System.out);
    }
}