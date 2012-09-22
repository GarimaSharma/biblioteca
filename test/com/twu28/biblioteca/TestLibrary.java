package com.twu28.biblioteca;

import org.junit.Assert;
import org.junit.Test;

public class TestLibrary {
    Console console = new ConsoleStub();
    @Test
    public void menuMustBePrintedToConsole(){
        console.println("4");
        Library library = new Library(console);
        library.startMenu();
        Assert.assertEquals("Welcome", console.getStoredData(0));
        Assert.assertEquals("Menu", console.getStoredData(1));
        Assert.assertEquals("1. List Book Catalog", console.getStoredData(2));
        Assert.assertEquals("2. Check out Book", console.getStoredData(3));
        Assert.assertEquals("3. Check Library Number", console.getStoredData(4));
        Assert.assertEquals("4. Exit", console.getStoredData(5));
        Assert.assertEquals("Your Selection: ",console.getStoredData(6));
    }
    @Test
    public void userCanSeeListOfBooks(){
        console.println("1");
        console.println("4");
        Library library = new Library(console);
        library.startMenu();
        Assert.assertEquals("xyz1", console.getStoredData(7));
        Assert.assertEquals("xyz2",console.getStoredData(8));
        Assert.assertEquals("xyz3",console.getStoredData(9));
        Assert.assertEquals("xyz4",console.getStoredData(10));
        Assert.assertEquals("xyz5",console.getStoredData(11));
        Assert.assertEquals("xyz6",console.getStoredData(12));
        Assert.assertEquals("xyz7",console.getStoredData(13));
        Assert.assertEquals("xyz8",console.getStoredData(14));
        Assert.assertEquals("xyz9",console.getStoredData(15));
    }
    @Test
    public void userMustBeAskedToEnterValidInputIfNot(){
        console.println("9");
        console.println("4");
        Library library = new Library(console);
        library.startMenu();
        Assert.assertEquals("Please enter valid option",console.getStoredData(7));
    }
    @Test
    public void reservingBookMessageShouldCome(){
        console.println("2");
        console.println("5");
        console.println("4");
        Library library = new Library(console);
        library.startMenu();
        Assert.assertEquals("enter the book number",console.getStoredData(16));

    }
    @Test
        public void afterReservingBookMessageShouldCome(){
            console.println("2");
            console.println("5");
            console.println("4");
            Library library = new Library(console);
            library.startMenu();
            Assert.assertEquals("thank you enjoy the book",console.getStoredData(17));

        }
    @Test
        public void tryingToReserveAlreadyReservedBook(){
        console.println("2");
        console.println("5");
        console.println("2");
        console.println("5");
        console.println("4");
        Library library = new Library(console);
        library.startMenu();
        Assert.assertEquals("sorry we don't have book yet",console.getStoredData(35));

    }
    @Test
    public void whenCustomerOptForHisDetails(){
        console.println("3");
        console.println("4");
        Library library = new Library(console);
        library.startMenu();
        Assert.assertEquals("Please talk to librarian.",console.getStoredData(7));
    }
    @Test (expected = RuntimeException.class)
    public void onExitNoDataMustGetPrintedToConsole(){
        console.println("4");
        Library library = new Library(console);
        library.startMenu();
        console.getStoredData(7);


    }


}