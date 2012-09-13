package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class Library {
    private List<Book> unreservedBooks = new ArrayList<Book>();
    private HashMap<Book, Integer> reservedBooks = new HashMap<Book, Integer>();
    private HashMap<Integer, Customer> libraryNumberOfCustomer = new HashMap<Integer, Customer>();
    private int registrationNumber = 0;

    public Library(List<Book> books) {
        for (Book book : books) {
            unreservedBooks.add(book);
        }
    }

    public List viewBooks() {
        List<String> bookNames = new ArrayList<String>();
        for (Book book : reservedBooks.keySet()) {
            addBookNameToNameList(bookNames, book);
        }
        for (Book unreservedBook : unreservedBooks) {
            addBookNameToNameList(bookNames, unreservedBook);
        }
        return bookNames;
    }

    private void addBookNameToNameList(List<String> bookNames, Book book) {
        bookNames.add(book.getName());
    }


    public String viewSpecificBook(String category) {
        for (Book unreservedBook : unreservedBooks) {
            if (unreservedBook.isOfSpecificCategory(category)) return unreservedBook.getName();
        }
        for (Book book : reservedBooks.keySet()) {
            if (book.isOfSpecificCategory(category)) return book.getName();
        }
        throw new RuntimeException("book not available");
    }

    public boolean reserve(String name, Customer customer) {
        Book book = getBookCorrespondingToName(name);
        if (unreservedBooks.contains(book)) {
            addCustomerAndBookToReservedList(book, customer);
            return true;
        }
        if (!reservedBooks.containsKey(book)) throw new RuntimeException("Sorry we don't have that book yet ");
        return false;
    }

    private Book getBookCorrespondingToName(String name) {
        for (Book unreservedBook : unreservedBooks) {
            if (name.equals(unreservedBook.getName())) return unreservedBook;
        }
        for (Book book : reservedBooks.keySet()) {
            if (name.equals(book.getName())) return book;
        }
        throw new RuntimeException("Sorry we don't have that book yet ");
    }

    private void addCustomerAndBookToReservedList(Book book, Customer customer) {
        reservedBooks.put(book, getRegistrationNumberOf(customer));
        unreservedBooks.remove(book);
    }

    public Integer getRegistrationNumberOf(Customer customer) {
        for (Integer index : libraryNumberOfCustomer.keySet()) {
            if (libraryNumberOfCustomer.get(index) == customer) return index;
        }
        throw new RuntimeException("sorry some unexpected error has occured..");
    }

    public void registerCustomer(Customer customer) {
        libraryNumberOfCustomer.put(generateNextRegistrationNumber(), customer);
    }

    private int generateNextRegistrationNumber() {
        return ++registrationNumber;
    }


    public Customer getCustomerByRegistrationNumber(int registrationNumber) {
        if (libraryNumberOfCustomer.size() == 0) throw new RuntimeException("no customer registered..");
        if (libraryNumberOfCustomer.get(registrationNumber) == null) throw new RuntimeException("no such customer found");
        return libraryNumberOfCustomer.get(registrationNumber);
    }
}
