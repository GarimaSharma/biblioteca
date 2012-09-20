package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

    public static void main(String args[]){
        BookManager bookManager;
         CustomerManager customerManager;
        List<Book> books = new ArrayList<Book>();

        books.add(new Book("xyz1"));
        books.add(new Book("xyz2"));
        books.add(new Book("xyz3"));
        books.add(new Book("xyz4"));
        books.add(new Book("xyz5"));
        books.add(new Book("xyz6"));
        books.add(new Book("xyz7"));
        bookManager = new BookManager(books);
        customerManager = new CustomerManager();

        Scanner scanner = new Scanner(System.in);
        while (true){
        System.out.println("***************************************************************");
        System.out.println("* Welcome to The Bangalore Public Library System - Biblioteca *");
        System.out.println("***************************************************************");
        System.out.println("*                     Menu                                    *");
        System.out.println("*              =====================                          *");
        System.out.println("*              1. List Book Catalog                           *");
        System.out.println("*              2. Check out Book                              *");
        System.out.println("*              3. Check Library Number                        *");
       System.out.println("***************************************************************");
        System.out.println("Your Selection: ");
        try{
            switch (scanner.nextInt()){
                case 1:System.out.println(bookManager.getBookList());
                    break;
                case 2:  System.out.println("Enter the number of book");
                    try{
                            switch (new Scanner(System.in).nextInt()){
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                    System.out.println("Thank You! Enjoy the book.");
                                    break;
                                default:System.out.println("Sorry");
                            }
                        }
                    catch (RuntimeException exception){
                        System.out.println("enter a valid option");
                        break;
                    }
                    break;
                case 3: System.out.println(); //dnot know wat to do
                    break;
                default: System.out.println("enter a valid option");
        }
        }
        catch (RuntimeException exception){
            System.out.println("enter a valid option");

        }


    }

    }
}
