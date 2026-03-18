package es.uah.matcomp.mp.e1.ejerciciosclases.d.Animal;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class BigDogTest {

    @Test
    void testConstructor() {
        BigDog bigDog = new BigDog("Thor");
        assertNotNull(bigDog);
    }

    @Test
    void testGreetsSinParametros() {
        BigDog bigDog = new BigDog("Thor");

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        bigDog.greets();

        System.setOut(System.out);

        assertEquals("Wooow\n", outContent.toString());
    }

    @Test
    void testGreetsConDog() {
        BigDog bigDog = new BigDog("Thor");
        Dog dog = new Dog("Rex");

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        bigDog.greets(dog);

        System.setOut(System.out);

        assertEquals("Wooooooow\n", outContent.toString());
    }

    @Test
    void testGreetsConBigDog() {
        BigDog bigDog1 = new BigDog("Thor");
        BigDog bigDog2 = new BigDog("Hulk");

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        bigDog1.greets(bigDog2);

        System.setOut(System.out);

        assertEquals("Wooooooooooow\n", outContent.toString());
    }

    @Test
    void testPolimorfismoConDog() {
        Dog dog = new BigDog("Zeus");

        assertTrue(dog instanceof BigDog);
        assertTrue(dog instanceof Dog);
        assertTrue(dog instanceof Animal);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        dog.greets();

        System.setOut(System.out);

        assertEquals("Wooow\n", outContent.toString());
    }

    @Test
    void testPolimorfismoConAnimal() {
        Animal animal = new BigDog("Atlas");

        assertTrue(animal instanceof BigDog);
        assertTrue(animal instanceof Dog);
        assertTrue(animal instanceof Animal);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        animal.greets();

        System.setOut(System.out);

        assertEquals("Wooow\n", outContent.toString());
    }

    @Test
    void testTodosLosMetodosGreets() {
        BigDog bigDog = new BigDog("Thor");
        Dog dog = new Dog("Rex");
        BigDog anotherBigDog = new BigDog("Hulk");

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        bigDog.greets();
        bigDog.greets(dog);
        bigDog.greets(anotherBigDog);

        System.setOut(System.out);

        String expected = "Wooow\nWooooooow\nWooooooooooow\n";
        assertEquals(expected, outContent.toString());
    }
}