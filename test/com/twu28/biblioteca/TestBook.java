package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

public class TestBook {
    @Test
    public void testGetName() {
        Book book = new Book("xyz");
        Assert.assertTrue((book.getName()).equals("xyz"));
    }
}
