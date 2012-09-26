package com.twu28.biblioteca;

public class Book {
    private String name;
    private boolean available;


    public Book(String name) {
        this.name = name;
        available = true;

    }

    public String getName() {
        return name;
    }

    public boolean isAlreadyReserved() {
        return available;
    }

    public void reserve() {
        available = false;
    }
}
