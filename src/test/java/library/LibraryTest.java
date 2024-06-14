package library;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    Library library = new Library();

    @BeforeEach
    void setUp() {

        library.addBook("1234Re", "el jinete sin cabeza", "pepe");

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addBookTest() {
        assertTrue(library.addBook("123", "pepe", "pepe"));
    }
    @Test
    void addBookTest1() {
        assertTrue(library.addBook("11234R","las mil y una noche","Pepe"));
    }

}