package com.biblioteca;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class LibraryTest {
    private Library library;
    private Book book;

    @BeforeEach
    void setUp() {
        library = new Library();
        book = new Book(1, "O Senhor dos Anéis", "Fantasia", "J.R.R. Tolkien");
    }

    @Test
    public void addBookTest() {
        library.addBook(book);
        assertEquals(1, library.getBooks().size());
    }

    @Test
    public void removeBookTest_ifExist() {
        library.addBook(book);
        library.removeBook(book.getId());
        assertEquals(0, library.getBooks().size());
    }

    @Test
    public void removeBookTest_ifNotExist() {
        int initialSize = library.getBooks().size();
        library.removeBook(100); // ID que não existe
        assertEquals(initialSize, library.getBooks().size());
    }

    @Test
    public void editBookTest_ifExist() {
        library.addBook(book);
        String newName = "O Senhor dos Anéis Teste";
        library.editBook(book.getId(), newName, "", "");
        assertEquals(newName, library.getBooks().get(0).getName());
    }

    @Test
    public void editBookTest_ifNotExist() {
        library.editBook(100, "Teste", "", "");
        assertTrue(true); 
    }

    @Test
    public void displayBooksTest_empty() {
        library.displayBooks(); 
    }

    @Test
    public void displayBooksTest_withBook() {
        library.addBook(book);
        library.displayBooks(); 
    }

    @Test
    public void searchBookTest_ifExist() {
        library.addBook(book);
        Book foundBook = library.searchBook(book.getId());
        assertNotNull(foundBook);
    }

    @Test
    public void searchBookTest_ifNotExist() {
        Book foundBook = library.searchBook(100); // ID que não existe
        assertNull(foundBook);
    }
}
