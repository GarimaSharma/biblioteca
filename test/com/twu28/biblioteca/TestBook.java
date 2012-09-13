package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;
public class TestBook {
    @Test
    public void testCategoryOfBook() {
        Book book = new Book("Health", "xyz");
        Assert.assertTrue(book.isOfSpecificCategory("Health"));
    }
    @Test
    public void testGetName(){
        Book book = new Book("java","xyz");
        Assert.assertTrue((book.getName()).equals("xyz"));
    }
}
