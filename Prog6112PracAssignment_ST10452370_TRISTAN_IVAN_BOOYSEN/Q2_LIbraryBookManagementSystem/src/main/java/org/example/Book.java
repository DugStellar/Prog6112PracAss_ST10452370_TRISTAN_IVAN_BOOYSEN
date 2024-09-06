package org.example;
public class Book {
    private String id;
    private String title;
    private String author;
    private String isbn;    //international standard book number
    private boolean isAvailable;

    public Book(String id, String title, String author, String isbn) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }

    // Getters and setters for each attribute
}
