package es.uah.matcomp.mp.e1.ejerciciosclases.c;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class DogTest {

    @Test
    void testConstructor() {
        Dog dog = new Dog("Rex");
        assertEquals("Dog: [Mammal: [Animal: [name = Rex]]]", dog.toString());
    }

    @Test
    void testGreetsNoArg() {
        Dog dog = new Dog("Rex");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        dog.greets();

        assertEquals("Woof\n", outContent.toString());
        System.setOut(System.out);
    }

    @Test
    void testGreetsWithAnotherDog() {
        Dog dog1 = new Dog("Rex");
        Dog dog2 = new Dog("Buddy");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        dog1.greets(dog2);

        assertEquals("Woooof\n", outContent.toString());
        System.setOut(System.out);
    }
}