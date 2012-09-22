package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {
    BookManager bookManager;
    MovieManager movieManager;
    private Console console;
    UserManager userManager;

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
        movieManager = new MovieManager();
        userManager = new UserManager();
        this.console = console;
    }

    public void startMenu() {
        console.println("Welcome");
        while (true) {
            firstDisplayMenu();
            int userSelection = Integer.parseInt(console.scanData());
            switch (userSelection) {
                case 1:
                    listAllBooks();
                    break;
                case 2:
                    loginAttempt();
                    reserveABook();
                    break;
                case 3:
                    loginAttempt();
                    printLibraryNumber();
                    break;
                case 4:
                    viewMovies();
                    break;
                case 5:
                    return;
                default:
                    enterValidOption();
                    break;
            }
        }
    }

    private void loginAttempt() {
        String username = askUserForUsername();
        String password = askUserForPassword();
        userManager.login(username,password);
    }

    private String askUserForPassword() {
        console.println("enter your password");
        return console.scanData();
    }

    private String askUserForUsername() {
        console.println("enter your username");
        return console.scanData();

    }

    private void viewMovies() {
        movieManager.viewMovieList();
        for (String movieDetail : movieManager.viewMovieList()) {
            console.println(movieDetail);
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
        console.println("4. View movies");
        console.println("5. Exit");
        console.println("Your Selection: ");
    }

    private void printLibraryNumber() {
        console.println("Please talk to librarian.");
    }

    private void reserveABook() {
        listAllBooks();
        console.println("enter the book number");
        int userSelection = Integer.parseInt(console.scanData());
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
