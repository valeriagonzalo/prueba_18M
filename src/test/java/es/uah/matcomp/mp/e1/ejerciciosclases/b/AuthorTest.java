package es.uah.matcomp.mp.e1.ejerciciosclases.b;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AuthorTest {

    @Test
    void testConstructorAndGetters() {
        Author a = new Author("Juan", "juan@mail.com");
        assertEquals("Juan", a.getName());
        assertEquals("juan@mail.com", a.getEmail());
    }

    @Test
    void testSetEmail() {
        Author a = new Author("Juan", "juan@mail.com");
        a.setEmail("nuevo@mail.com");
        assertEquals("nuevo@mail.com", a.getEmail());
    }

    @Test
    void testToString() {
        Author a = new Author("Juan", "juan@mail.com");
        assertTrue(a.toString().contains("Juan"));
    }
}