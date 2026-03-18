package es.uah.matcomp.mp.e1.ejerciciosclases.d.Animal;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.testng.AssertJUnit.*;

public class DogTest {

    @Test
    void testConstructor() {
        Dog dog = new Dog("Rex");
        assertNotNull(dog);
    }

    @Test
    void testGreetsSinParametros() {
        Dog dog = new Dog("Rex");

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        dog.greets();

        System.setOut(System.out);

        assertEquals("Woof\n", outContent.toString());
    }

    @Test
    void testGreetsConOtroDog() {
        Dog dog1 = new Dog("Rex");
        Dog dog2 = new Dog("Buddy");

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        dog1.greets(dog2);

        System.setOut(System.out);

        assertEquals("Woooof\n", outContent.toString());
    }

    @Test
    void testPolimorfismoConAnimal() {
        Animal animal = new Dog("Max");

        assertTrue(animal instanceof Dog);
        assertTrue(animal instanceof Animal);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        animal.greets();

        System.setOut(System.out);

        assertEquals("Woof\n", outContent.toString());
    }
}