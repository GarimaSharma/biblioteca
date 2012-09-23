package com.twu28.biblioteca;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestLibrary {
    Console console = new ConsoleStub();

    @Before
    public void setUsernameGeneratingData(){
        User.usernameGeneratingData = 1111;
    }
    @Test
    public void menuMustBePrintedToConsole(){
        console.println("5");
        Library library = new Library(console);
        library.startMenu();
        Assert.assertEquals("Welcome", console.getStoredData(0));
        Assert.assertEquals("Menu", console.getStoredData(1));
        Assert.assertEquals("1. List Book Catalog", console.getStoredData(2));
        Assert.assertEquals("2. Check out Book", console.getStoredData(3));
        Assert.assertEquals("3. Check Library Number", console.getStoredData(4));
        Assert.assertEquals("4. View movies", console.getStoredData(5));
        Assert.assertEquals("5. Exit", console.getStoredData(6));
        Assert.assertEquals("Your Selection: ",console.getStoredData(7));
    }
    @Test
    public void userCanSeeListOfBooks(){
        console.println("1");
        console.println("5");
        Library library = new Library(console);
        library.startMenu();
        Assert.assertEquals("xyz1", console.getStoredData(8));
        Assert.assertEquals("xyz2",console.getStoredData(9));
        Assert.assertEquals("xyz3",console.getStoredData(10));
        Assert.assertEquals("xyz4",console.getStoredData(11));
        Assert.assertEquals("xyz5",console.getStoredData(12));
        Assert.assertEquals("xyz6",console.getStoredData(13));
        Assert.assertEquals("xyz7",console.getStoredData(14));
        Assert.assertEquals("xyz8",console.getStoredData(15));
        Assert.assertEquals("xyz9",console.getStoredData(16));
    }
    @Test
    public void userMustBeAskedToEnterValidInputIfNot(){
        console.println("9");
        console.println("5");
        Library library = new Library(console);
        library.startMenu();
        Assert.assertEquals("Please enter valid option",console.getStoredData(8));
    }
    @Test
    public void reservingBookMessageShouldCome(){
        console.println("2");
        console.println("1111-1111");
        console.println("password");
        console.println("5");
        console.println("5");
        Library library = new Library(console);
        library.startMenu();
        Assert.assertEquals("enter the book number",console.getStoredData(19));

    }
    @Test
        public void afterReservingBookMessageShouldCome(){
            console.println("2");
            console.println("1111-1111");
            console.println("password");
            console.println("5");
            console.println("5");
            Library library = new Library(console);
            library.startMenu();
            Assert.assertEquals("thank you enjoy the book",console.getStoredData(20));

        }
    @Test
        public void tryingToReserveAlreadyReservedBook(){
        console.println("2");
        console.println("1111-1111");
        console.println("password");
        console.println("5");
        console.println("2");
        console.println("5");
        console.println("5");
        Library library = new Library(console);
        library.startMenu();
        Assert.assertEquals("sorry we don't have book yet",console.getStoredData(38));

    }
    @Test
    public void whenCustomerOptForHisDetails(){
        console.println("3");
       console.println("5");
        Library library = new Library(console);
         library.startMenu();
        Assert.assertEquals("Please talk to librarian.",console.getStoredData(8));
    }
    @Test (expected = RuntimeException.class)
    public void onExitNoDataMustGetPrintedToConsole(){
        console.println("5");
        Library library = new Library(console);
        library.startMenu();
        console.getStoredData(8);
    }
    @Test
    public void moviesDetailsMustGetPrinted(){
        console.println("4");
        console.println("5");
        Library library = new Library(console);
        library.startMenu();
        Assert.assertEquals("movie1    director1    2",console.getStoredData(8));
        Assert.assertEquals("movie2    director2    1",console.getStoredData(9));
        Assert.assertEquals("movie3    director3    2",console.getStoredData(10));
        Assert.assertEquals("movie4    director4    3",console.getStoredData(11));
        Assert.assertEquals("movie5    director5    4",console.getStoredData(12));
        Assert.assertEquals("movie6    director6    5",console.getStoredData(13));
        Assert.assertEquals("movie7    director7    6",console.getStoredData(14));
        Assert.assertEquals("movie8    director8    7",console.getStoredData(15));
        Assert.assertEquals("movie9    director9    8",console.getStoredData(16));
        Assert.assertEquals("movie10    director10    8",console.getStoredData(17));
        Assert.assertEquals("movie11    director11    9",console.getStoredData(18));
        Assert.assertEquals("movie12    director12    1990    N/A",console.getStoredData(19));
        Assert.assertEquals("movie13    director13    1990    N/A",console.getStoredData(20));
        Assert.assertEquals("movie14    director14    1990    N/A",console.getStoredData(21));
        Assert.assertEquals("movie15    director15    1990    N/A",console.getStoredData(22));

    }
    @Test
    public void userMustBeAskedToEnterHisUserNameFollowedByPasswordWhenHeTriesToReserveBook(){
        console.println("2");
        console.println("1111-1111");
        console.println("password");
        console.println("5");
        console.println("5");
        Library library = new Library(console);
        library.startMenu();
        Assert.assertEquals("enter your username",console.getStoredData(8));
        Assert.assertEquals("enter your password",console.getStoredData(9));
    }
    @Test
    public void detailsMustGetPrintedIfUSerIsAlreadyLoggedIn(){
        console.println("2");
        console.println("1111-1111");
        console.println("password");
        console.println("5");
        console.println("3");
        console.println("5");
        Library library = new Library(console);
        library.startMenu();
        Assert.assertEquals("garima  garima@yahoo.com  271390",console.getStoredData(28));


    }
}