package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

public class TestLibraryBooks {
        
        @Test
        public void booksCanBeAdded() {
            LibraryBooks libraryBooks = new LibraryBooks();
            Book book = new Book("xyz1");
            libraryBooks.addBooks(book);
            Assert.assertEquals(book, (libraryBooks.selectAllBooks()).get(0));


        }
        @Test
        public void booksCanBeSelected(){
            LibraryBooks libraryBooks = new LibraryBooks();
            Book book = new Book("xyz1");
            Book book1 = new Book("xyz2");
            Book book2 = new Book("xyz3");
            libraryBooks.addBooks(book);
            libraryBooks.addBooks(book1);
            libraryBooks.addBooks(book2);
            libraryBooks.selectAllBooks().get(0);
            Assert.assertEquals(book,libraryBooks.selectAllBooks().get(0));
            Assert.assertEquals(book1,libraryBooks.selectAllBooks().get(1));
            Assert.assertEquals(book2,libraryBooks.selectAllBooks().get(2));
        }
}
