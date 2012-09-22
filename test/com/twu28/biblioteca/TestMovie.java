package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

public class TestMovie {
    @Test
    public void getDetailsOfMovieHavingNoRatingInString(){
        Movie movie = new Movie("movie1","director1",1990,0);
        Assert.assertEquals("movie1    director1    1990    N/A",movie.getFormatedDetails());
    }
    @Test
    public void getDetailsOfMovieWithRatingInString(){
        Movie movie = new Movie("movie1","director1",1990,1);
        Assert.assertEquals("movie1    director1    1",movie.getFormatedDetails());
    }

}
