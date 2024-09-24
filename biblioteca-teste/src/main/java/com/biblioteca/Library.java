package com.biblioteca;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Livro adicionado: " + book.getName());
    }

    public void removeBook(int id) { 
        for (Book book : books) {
            if (book.getId() == id) { 
                books.remove(book);
                System.out.println("Livro removido: " + book.getName());
                return;
            }
        }
        System.out.println("Livro não encontrado com ID: " + id);
    }

    public void editBook(int id, String newName, String newAuthor, String newCategory) { 
        for (Book book : books) {
            if (book.getId() == id) { 
                book.setName(newName);
                book.setAuthor(newAuthor);
                book.setCategory(newCategory);
                System.out.println("Livro editado: " + newName);
                return;
            }
        }
        System.out.println("Livro não encontrado para edição com ID: " + id);
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("Nenhum livro na biblioteca."); 
        } else {
            for (Book book : books) {
                System.out.println(book.getName()); 
            }
        }
    }

    public Book searchBook(int id) { 
        for (Book book : books) {
            if (book.getId() == id) { 
                System.out.println("Livro encontrado: " + book.getName());
                return book; 
            }
        }
        System.out.println("Livro não encontrado com ID: " + id);
        return null;
    }


    public List<Book> getBooks() {
        return books;
    }
}