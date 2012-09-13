package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
public class TestLibrary {

    private Library setLibrary(List<Book> books) {
        return new Library(books);
    }

    private void setData(List<Book> books) {
        books.add(new Book("java", "XYZ1"));
        books.add(new Book("java", "XYZ2"));
        books.add(new Book("java", "XYZ3"));
        books.add(new Book("java", "XYZ4"));
        books.add(new Book("java", "XYZ5"));
        books.add(new Book("java", "XYZ6"));
    }
    private List<Book> setData() {
        List<Book> books = new ArrayList<Book>();
        setData(books);
        Book book = new Book("Health", "xyz7");
        return books;
    }

    @Test
    public void libraryCanShowAllBooks() {
        List<Book> books = new ArrayList<Book>();
        setData(books);
        Book book = new Book("Health", "xyz7");
        Library library = setLibrary(books);
        List<String> bookNames = new ArrayList<String>();
        for (Book bookIndex : books) {
            bookNames.add(bookIndex.getName());
        }

        Assert.assertEquals(bookNames, library.viewBooks());
    }

    @Test (expected = RuntimeException.class)
    public void libraryThrowsExceptionWhenInvalidCustomerRequests() {
        List<Book> books = new ArrayList<Book>();
        setData(books);
        Book book = new Book("Health", "xyz7");
        Library library = setLibrary(books);
        List<String> bookNames = new ArrayList<String>();
        Customer customer = new Customer(library);
        library.getCustomerByRegistrationNumber(9);
    }
    @Test  (expected = RuntimeException.class)
    public void libraryThrowsExceptionOnRequestWhenItDoNotHaveAnyCustomer() {
        List<Book> books = new ArrayList<Book>();
        setData(books);
        Book book = new Book("Health", "xyz7");
        Library library = setLibrary(books);
        List<String> bookNames = new ArrayList<String>();
        library.getCustomerByRegistrationNumber(9);
    }
    @Test
    public void libraryCanFindCustomerByHisRegistrationNumber() {
        List<Book> books = new ArrayList<Book>();
        setData(books);
        Book book = new Book("Health", "xyz7");
        Library library = setLibrary(books);
        List<String> bookNames = new ArrayList<String>();
        Customer customer = new Customer(library);
        library.getCustomerByRegistrationNumber(customer.getRegistrationNumber());
    }
    @Test  (expected = RuntimeException.class)
    public void libraryThrowsExceptionWhenNullCBookNamePassed() {
        List<Book> books = new ArrayList<Book>();
        setData(books);
        Book book = new Book("Health", "xyz7");
        books.add(book);
        Library library = setLibrary(books);
        Assert.assertTrue(("xyz7").equals(library.viewSpecificBook(null)));
    }

    @Test
    public void libraryCanShowSpecificBook() {

        List<Book> books = new ArrayList<Book>();
        setData(books);
        Book book = new Book("Health", "xyz7");
        books.add(book);
        Library library = setLibrary(books);
        Assert.assertTrue(("xyz7").equals(library.viewSpecificBook("Health")));

    }

    @Test
    public void unreservedBookCanBeReserved() {
        List<Book> books = new ArrayList<Book>();
        setData(books);
        Book book = new Book("Health", "xyz7");
        books.add(book);
        Library library = setLibrary(books);
        Assert.assertTrue(library.reserve("xyz7", new Customer(library)));
    }
    @Test
    public void libraryCanRegisterCustomer() {
        List<Book> books = new ArrayList<Book>();
        setData(books);
        Book book = new Book("Health", "xyz7");
        books.add(book);
        Library library = setLibrary(books);
        Customer customer = new Customer(library);
        Assert.assertEquals(1, (int) library.getRegistrationNumberOf(customer));
    }
    @Test
    public void libraryCanRegisterMoreThanOneCustomer() {
        List<Book> books = new ArrayList<Book>();
        setData(books);
        Book book = new Book("Health", "xyz7");
        books.add(book);
        Library library = setLibrary(books);
        new Customer(library);
        new Customer(library);
        new Customer(library);
        Customer customer3 = new Customer(library);
        Assert.assertEquals(4,(int)library.getRegistrationNumberOf(customer3));
    }

    @Test(expected = RuntimeException.class)
    public void libraryCannotReserveUnavailableBook() {
        List<Book> books = new ArrayList<Book>();
        setData(books);
        Book book = new Book("Health", "xyz7");
        Library library = setLibrary(books);
        library.reserve("xyz7", new Customer(library));
    }


    @Test
    public void libraryCannotReserveReservedBook() {
        List<Book> books = new ArrayList<Book>();
        setData(books);
        Book book = new Book("Health", "xyz7");
        books.add(book);
        Library library = setLibrary(books);
        new Customer(library).reserveBook("xyz7");
        Assert.assertFalse(library.reserve("xyz7", new Customer(library)));
    }

    @Test(expected = RuntimeException.class)
    public void libraryCannotShowUnavailableBook() {
        List<Book> books = setData();
        Library library = setLibrary(books);
        library.viewSpecificBook("Health");
    }


}
