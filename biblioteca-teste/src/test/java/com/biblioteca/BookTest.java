package com.biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {
    private Book book1;
    private Book book2;

    @BeforeEach
    void setUp() {
        book1 = new Book(1, "O Senhor dos Anéis", "Ficção", "J.R.R. Tolkien");
        book2 = new Book(2, "1984", "Drama", "George Orwell");
    }

    @Test
    public void getNameTest() {
        assertEquals("O Senhor dos Anéis", book1.getName());
        assertEquals("1984", book2.getName());
    }

    @Test
    public void setNameTest() {
        String newName1 = "O Senhor dos Anéis Teste";
        book1.setName(newName1);
        assertEquals(newName1, book1.getName());

        String newName2 = "1984 Teste";
        book2.setName(newName2);
        assertEquals(newName2, book2.getName());
    }

    @Test
    public void getIdTest() {
        assertEquals(1, book1.getId());
        assertEquals(2, book2.getId());
    }

    @Test
    public void setIdTest() {
        book1.setId(3); 
        assertEquals(3, book1.getId());

        book2.setId(4);
        assertEquals(4, book2.getId());
    }

    @Test
    public void getCategoryTest() {
        assertEquals("Ficção", book1.getCategory());
        assertEquals("Drama", book2.getCategory());
    }

    @Test
    public void setCategoryTest() {
        String newCategory1 = "Ficção Teste";
        book1.setCategory(newCategory1);
        assertEquals(newCategory1, book1.getCategory());

        String newCategory2 = "Drama Teste";
        book2.setCategory(newCategory2);
        assertEquals(newCategory2, book2.getCategory());
    }

    @Test
    public void getAuthorTest() {
        assertEquals("J.R.R. Tolkien", book1.getAuthor());
        assertEquals("George Orwell", book2.getAuthor());
    }

    @Test
    public void setAuthorTest() {
        String newAuthor1 = "J.R.R. Tolkien Teste";
        book1.setAuthor(newAuthor1);
        assertEquals(newAuthor1, book1.getAuthor());

        String newAuthor2 = "George Orwell Teste";
        book2.setAuthor(newAuthor2);
        assertEquals(newAuthor2, book2.getAuthor());
    }
}