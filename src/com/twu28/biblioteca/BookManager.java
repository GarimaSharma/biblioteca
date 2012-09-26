package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
   LibraryBooks libraryBooks = new LibraryBooks();
    List<Book> books=libraryBooks.selectAllBooks();
    public BookManager(){
        libraryBooks.addBooks(new Book("xyz1"));
        libraryBooks.addBooks(new Book("xyz2"));
        libraryBooks.addBooks(new Book("xyz3"));
        libraryBooks.addBooks(new Book("xyz4"));
        libraryBooks.addBooks(new Book("xyz5"));
        libraryBooks.addBooks(new Book("xyz6"));
        libraryBooks.addBooks(new Book("xyz7"));
        libraryBooks.addBooks(new Book("xyz8"));
        libraryBooks.addBooks(new Book("xyz9"));

    }
    public List<String> getBookNamesList() {
        List<String> booksName = new ArrayList<String>();

        for (Book book : books) {
            booksName.add(book.getName());
        }
        return booksName;
    }

    public void reserveBook(int index) {
        Book book = books.get(index);
        if (!book.isAlreadyReserved()) throw new RuntimeException("booked");
        book.reserve();
    }
}
