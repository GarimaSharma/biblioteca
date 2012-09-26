package com.twu28.biblioteca;

import java.util.List;

public class Library {
    BookManager bookManager;
    MovieManager movieManager;
    private Console console;
    UserManager userManager;
    User user;

    Library(Console console) {
        bookManager = new BookManager();
        movieManager = new MovieManager();
        userManager = new UserManager();
        this.console = console;
    }

    public void startMenu() {
        console.println("Welcome");
        startInteractingWithUser();
    }

    private void startInteractingWithUser() {
        while (true) {
            firstDisplayMenu();
            int userSelection = Integer.parseInt(console.scanData());
            if (userSelection == 1) {
                listAllBooks();
                continue;
            }
            if (userSelection == 2) {
                checkLoginStatus();
                reserveABook();
                continue;
            }
            if (userSelection == 3) {
                viewLibraryNumber();
                continue;

            }
            if (userSelection == 4) {
                viewMovies();
                continue;
            }
            if (userSelection == 5) return;

            enterValidOption();
        }
    }

    private void viewLibraryNumber() {
        if (user != null) {
            printLibraryNumber(user);
            return;
        }
        console.println("Please talk to librarian.");
    }

    private void checkLoginStatus() {
        while (user == null) {
            user = loginAttempt();
        }
    }

    private User loginAttempt() {
        String username = askUserForUsername();
        String password = askUserForPassword();
        return userManager.login(username, password);
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

    private void printLibraryNumber(User user) {
        console.println(userManager.getDetailsOfUser(user));

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
