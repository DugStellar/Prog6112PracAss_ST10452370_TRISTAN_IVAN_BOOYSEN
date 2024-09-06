package org.example;
public class Library {
    private Book[] books;
    private int numBooks;

    public Library(int capacity) {
        books = new Book[capacity];
        numBooks = 0;
    }

    // Methods for adding, searching, borrowing, returning, and tracking overdue books
}
