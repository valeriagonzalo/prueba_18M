package es.uah.matcomp.mp.e1.ejerciciosclases.b;

import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

class BookTest {

    @Test
    void testConstructorAndGetters() {
        Author a = new Author("Ana", "ana@mail.com");
        // Constructor real: Book(String, String, Author, double)
        Book b = new Book("Libro", "Categoria", a, 20.0);

        assertEquals("Libro", b.getName());
        assertEquals(a, b.getAuthor());
        assertEquals(20.0, b.getPrice());
    }

    @Test
    void testSetPrice() {
        Author a = new Author("Ana", "ana@mail.com");
        Book b = new Book("Libro", "Categoria", a, 20.0);

        b.setPrice(30.0);
        assertEquals(30.0, b.getPrice());
    }

    @Test
    void testToString() {
        Author a = new Author("Ana", "ana@mail.com");
        Book b = new Book("Libro", "Categoria", a, 20.0);
        assertTrue(b.toString().contains("Libro"));
    }
}