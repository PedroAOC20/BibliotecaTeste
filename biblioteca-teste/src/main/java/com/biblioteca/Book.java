package com.biblioteca;

public class Book {
  private int id;
  private String name;
  private String category;
  private String author;

  public Book(int id, String name, String category, String author) {
      this.id = id;
      this.name = name;
      this.author = author;
      this.category = category;
  }

  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }

  public int getId() {
      return this.id;
  }

  public void setId(int id) {
      this.id = id;
  }

  public String getCategory() {
      return this.category;
  }

  public void setCategory(String category) { 
      this.category = category;
  }

  public String getAuthor() {
      return this.author;
  }

  public void setAuthor(String author) {
      this.author = author;
  }
}