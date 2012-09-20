package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestBookManager {
    List<Book> books = new ArrayList<Book>();
    Book book = new Book("xyz7");
    @Before
    public void setBookList(){
        books.add(new Book("xyz1"));
        books.add(new Book("xyz2"));
        books.add(new Book("xyz3"));
        books.add(new Book("xyz4"));
        books.add(new Book("xyz5"));
        books.add(new Book("xyz6"));
        books.add(new Book("xyz7"));
    }
    @Test
    public void booksCanBeDisplayed(){
        List<String> booksName = new ArrayList<String>();
        booksName.add("xyz1");
        booksName.add("xyz2");
        booksName.add("xyz3");
        booksName.add("xyz4");
        booksName.add("xyz5");
        booksName.add("xyz6");
        booksName.add("xyz7");
        BookManager bookManager = new BookManager(books);
        Assert.assertEquals(booksName,bookManager.getBookList());


    }
    @Test
    public void bookCanBeReserved(){
        books.add(book);
        BookManager bookManager = new BookManager(books);
        bookManager.reservBook(book);
    }

}
