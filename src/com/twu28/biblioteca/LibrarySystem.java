package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class LibrarySystem {
    public static void main(String ag[]) {
        List<Book> books = new ArrayList<Book>();
        Library library = setLibraryData(books);
        Customer customer;
        System.out.println("Welcome");
        newCustomerLable : while (true){
            switch(visitorOptions()){
                case 1:customer = new Customer(library);
                    interactWithVisitor(customer);
                    break;


                case 2:
                    System.out.println("enter your registration number");
                    try{
                        customer = library.getCustomerByRegistrationNumber(takeInputOption());
                        interactWithVisitor(customer);
                        break;
                    }
                    catch (RuntimeException runtimeException){
                        System.out.println("no customer found with this registration number..");
                        break;
                    }

                case 3: break newCustomerLable;
                default:System.out.println("Enter a valid input please");

            }
        }
    }


    private static void interactWithVisitor(Customer customer) {
        registeredCustomerLable: while (true) {
            switch (customerOptions()) {
                case 1:
                    System.out.println(customer.viewAllBooks());
                    break;
                case 2:
                    searchForCategory(customer);
                    break;
                case 3:
                    reserveEnteredBook(customer);
                    break;
                case 4:

                    System.out.println(customer.getRegistrationNumber());
                    break;
                case 5:
                    System.out.println("Thank you for visit!!!!");
                    break registeredCustomerLable;
                default:
                    System.out.println("Enter valid option");
                    break ;


            }

        }
    }

    private static void reserveEnteredBook(Customer customer) {
        System.out.println("Enter the book name");
        try {
            if (customer.reserveBook(takeInputString())) {
                System.out.println("Thank You! Enjoy the book.");
                return;
            }
            System.out.println("Sorry the book is reserved already");
        } catch (RuntimeException E) {
            System.out.println("Sorry we don't have that book yet");
        }
    }
    private static String takeInputString(){
         Scanner scanner = new Scanner(System.in);
         return scanner.next();
    }

    private static void searchForCategory(Customer customer) {
        System.out.println("Enter the category");
        String category = takeInputString();
        System.out.println(customer.viewBookByCategory(category));
    }

    private static int visitorOptions() {
        System.out.println("1.Are you a new customer");
        System.out.println("2.Are you already a customer");
        System.out.println("3.exit");
        return takeInputOption();
    }

    private static Library setLibraryData(List<Book> books) {
        books.add(new Book("java", "xyz1"));
        books.add(new Book("java", "xyz2"));
        books.add(new Book("java", "xyz3"));
        books.add(new Book("java", "xyz4"));
        books.add(new Book("java", "xyz5"));
        books.add(new Book("Health", "xyz6"));
        return new Library(books);
    }

    private static int customerOptions() {
        System.out.println("Enter number as per your choice");
        System.out.println("1.View all books");
        System.out.println("2.View specific book");
        System.out.println("3.Reserve a book");
        System.out.println("4.View your library number");
        System.out.println("5.exit");
        return takeInputOption();

    }

    private static int takeInputOption() {
        int option= 0;
        Scanner scanner = new Scanner(System.in);


        try{
         option = scanner.nextInt();

    }
        catch (Exception exception){
            System.out.println(option);
            option = 0;
        }
        return option;
    }
}
