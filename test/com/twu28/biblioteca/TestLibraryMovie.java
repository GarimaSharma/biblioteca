package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

public class TestLibraryMovie {
    @Test
    public void movieCanBeAdded(){
        LibraryMovies libraryMovies = new LibraryMovies();
        Movie movie = new Movie("movie1","director1",1990,0);
        libraryMovies.addMovies(movie);
        Assert.assertEquals(movie,libraryMovies.selectAllMovies().get(0));

    }
    @Test
    public void moviesCanBeSelected() {
        LibraryMovies libraryMovies = new LibraryMovies();
        Movie movie =new Movie("movie1","director1",1990,0);
        Movie movie1 =new Movie("movie1","director1",1990,0);
        Movie movie2 =new Movie("movie1","director1",1990,0);
        libraryMovies.addMovies(movie);
        libraryMovies.addMovies(movie1);
        libraryMovies.addMovies(movie2);
        Assert.assertEquals(movie,libraryMovies.selectAllMovies().get(0));
        Assert.assertEquals(movie1,libraryMovies.selectAllMovies().get(1));
        Assert.assertEquals(movie2,libraryMovies.selectAllMovies().get(2));
    }
}
