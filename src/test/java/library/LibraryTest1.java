package library;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest1 {

    Library library = new Library();

    @BeforeEach
    void setUp() {
        library.addMember("12345", "Antonia");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addMember() {
        assertTrue(library.addMember("78488", "Jaime"));
    }

    @Test
    void addMemberTest() {
        assertFalse(library.addMember("12345", "Antonia"));
    }

}