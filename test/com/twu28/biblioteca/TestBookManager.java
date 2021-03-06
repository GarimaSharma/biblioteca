package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestBookManager {
      @Test
    public void booksCanBeDisplayed(){
        List<String> booksName = new ArrayList<String>();
        booksName.add("xyz1");
        booksName.add("xyz2");
        booksName.add("xyz3");
        booksName.add("xyz4");
        booksName.add("xyz5");
        booksName.add("xyz6");
        booksName.add("xyz7");
        booksName.add("xyz8");
        booksName.add("xyz9");
        BookManager bookManager = new BookManager();
        Assert.assertEquals(booksName,bookManager.getBookNamesList());


    }


    @Test (expected = RuntimeException.class)
    public void reservedBookCanNotBeReservedThusABookWasReserved(){
        BookManager bookManager = new BookManager();
        bookManager.reserveBook(7);
        bookManager.reserveBook(7);

    }
}
