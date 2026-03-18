package es.uah.matcomp.mp.e1.ejerciciosclases.c;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    void testConstructor() {
        Person person = new Person("John Doe", "123 Main St");
        assertEquals("John Doe", person.getName());
        assertEquals("123 Main St", person.getAdress());
    }

    @Test
    void testSetAdress() {
        Person person = new Person("Jane Doe", "456 Oak Ave");
        person.setAdress("789 Pine Rd");
        assertEquals("789 Pine Rd", person.getAdress());
    }

    @Test
    void testToString() {
        Person person = new Person("Bob Smith", "321 Elm St");
        assertEquals("Person: [name = Bob Smith, adress = 321 Elm St]", person.toString());
    }
}