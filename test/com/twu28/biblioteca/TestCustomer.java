package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
public class TestCustomer {
    @Test
    public void customerCanViewBook() {
        List<Book> books = new ArrayList<Book>();
        setData(books);
        Book book = new Book("Health", "xyz7");
        Library library = new Library(books);
        Customer customer = new Customer(library);
        List<String> bookNames = new ArrayList<String>();
        for (Book bookIndex : books) {
            bookNames.add(bookIndex.getName());
        }
        Assert.assertEquals(bookNames, customer.viewAllBooks());
    }
    @Test
    public void customerCanViewHisRegistrationNumber() {
        List<Book> books = new ArrayList<Book>();
        setData(books);
        Book book = new Book("Health", "xyz7");
        Library library = new Library(books);
        Customer customer = new Customer(library);
        List<String> bookNames = new ArrayList<String>();
        Assert.assertEquals(1,customer.getRegistrationNumber());
    }

    private void setData(List<Book> books) {
        books.add(new Book("java", "XYZ1"));
        books.add(new Book("java", "XYZ2"));
        books.add(new Book("java", "XYZ3"));
        books.add(new Book("java", "XYZ4"));
        books.add(new Book("java", "XYZ5"));
        books.add(new Book("java", "XYZ6"));
    }

    @Test
    public void customerCanViewSpecificBook() {
        List<Book> books = new ArrayList<Book>();
        setData(books);
        Book book = new Book("Health", "xyz7");
        books.add(book);
        Library library = new Library(books);
        Customer customer = new Customer(library);
        String recivedBook = customer.viewBookByCategory("Health");
        Assert.assertTrue(recivedBook.equals("xyz7"));
    }

    @Test(expected = RuntimeException.class)
    public void customerCannotViewUnavailableBook() {
        List<Book> books = new ArrayList<Book>();
        setData(books);
        Book book = new Book("Health", "xyz7");
        //books.add(book);
        Library library = new Library(books);
        Customer customer = new Customer(library);
        customer.viewBookByCategory("Health");
    }

    @Test
    public void customerCanReserveUnreservedBook() {
        List<Book> books = new ArrayList<Book>();
        setData(books);
        Book book = new Book("Health", "xyz7");
        books.add(book);
        Library library = new Library(books);
        Customer customer = new Customer(library);
        Assert.assertTrue(customer.reserveBook("xyz7"));

    }

    @Test
    public void customerCannotReserveReservedBook() {
        List<Book> books = new ArrayList<Book>();
        setData(books);
        Book book = new Book("Health", "xyz7");
        books.add(book);
        Library library = new Library(books);
        Customer customer = new Customer(library);
        customer.reserveBook("xyz7");
        Assert.assertFalse(customer.reserveBook("xyz7"));

    }

    @Test(expected = RuntimeException.class)
    public void customerCannotReserveUnavailableBook() {
        List<Book> books = new ArrayList<Book>();
        setData(books);
        Library library = new Library(books);
        Customer customer = new Customer(library);
        customer.reserveBook("xyz5");
        Assert.assertFalse(customer.reserveBook("xyz5"));

    }
}


