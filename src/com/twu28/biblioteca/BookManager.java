package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    List<Book> booksInLibrary = new ArrayList<Book>();

    public BookManager(List<Book> books) {
        this.booksInLibrary = books;
    }

    public List<String> getBookList() {
        List<String> booksName = new ArrayList<String>();
        for (Book book : booksInLibrary) {
            booksName.add(book.getName());
        }
        return booksName;
    }

    public void reservBook(Book book) {
        //To change body of created methods use File | Settings | File Templates.
    }
}
