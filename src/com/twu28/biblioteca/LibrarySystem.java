package com.twu28.biblioteca;

public class LibrarySystem {
    public static void main(String a[]) {
        Library library = new Library(new SystemConsole());
        library.startMenu();
     }
}
