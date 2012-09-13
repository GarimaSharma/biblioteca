package com.twu28.biblioteca;

import java.util.List;
public class Customer {
    Library library;

    public Customer(Library library) {
        this.library = library;
        library.registerCustomer(this);
    }

    public List viewAllBooks() {
        return library.viewBooks();

    }

    public String viewBookByCategory(String category) {
        try{
        return library.viewSpecificBook(category);
        }
        catch (Exception exception){
            return "book not found";
        }
    }

    public boolean reserveBook(String name) {
        return library.reserve(name, this);
    }


    public int getRegistrationNumber() {
        return library.getRegistrationNumberOf(this);
    }
}
