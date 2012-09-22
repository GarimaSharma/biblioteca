package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {
    BookManager bookManager;
    private Console console;

    Library(Console console) {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("xyz1"));
        books.add(new Book("xyz2"));
        books.add(new Book("xyz3"));
        books.add(new Book("xyz4"));
        books.add(new Book("xyz5"));
        books.add(new Book("xyz6"));
        books.add(new Book("xyz7"));
        books.add(new Book("xyz8"));
        books.add(new Book("xyz9"));
        bookManager = new BookManager(books);
        this.console = console;
    }

    public void startMenu() {
        console.println("Welcome");
        while (true) {
            firstDisplayMenu();
            int userSelection = console.scanData();
            switch (userSelection) {
                case 1:
                    listAllBooks();
                    break;
                case 2:
                    reserveABook();
                    break;
                case 3:
                    printLibraryNumber();
                    break;
                case 4:
                    return;
                default:
                    enterValidOption();
                    break;
            }
        }
    }

    private void enterValidOption() {
        console.println("Please enter valid option");
    }

    private void firstDisplayMenu() {
        console.println("Menu");
        console.println("1. List Book Catalog");
        console.println("2. Check out Book");
        console.println("3. Check Library Number");
        console.println("4. Exit");
        console.println("Your Selection: ");
    }

    private void printLibraryNumber() {
        console.println("Please talk to librarian.");
    }

    private void reserveABook() {
        listAllBooks();
        console.println("enter the book number");
        int userSelection = console.scanData();
        try {
            bookManager.reserveBook(userSelection);
            console.println("thank you enjoy the book");
        } catch (Exception exception) {
            console.println("sorry we don't have book yet");
        }


    }

    private void listAllBooks() {
        List<String> bookNames = bookManager.getBookNamesList();
        for (String bookName : bookNames) {
            console.println(bookName);
        }

    }
}
