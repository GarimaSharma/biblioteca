package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class LibraryBooks {
    List<Book> books = new ArrayList<Book>();


    public void addBooks(Book book){
        books.add(book);
    }
    public List<Book> selectAllBooks(){
        return books;

    }

}
