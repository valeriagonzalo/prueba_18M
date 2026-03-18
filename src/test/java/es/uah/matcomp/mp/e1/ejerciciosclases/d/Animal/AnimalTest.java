package es.uah.matcomp.mp.e1.ejerciciosclases.d.Animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {

    @Test
    void testConstructorYHerencia() {
        Cat cat = new Cat("Whiskers");
        Dog dog = new Dog("Rex");
        BigDog bigDog = new BigDog("Thor");
        assertNotNull(cat);
        assertNotNull(dog);
        assertNotNull(bigDog);
    }
}