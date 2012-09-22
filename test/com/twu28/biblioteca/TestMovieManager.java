package com.twu28.biblioteca;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestMovieManager {
    @Test
    public void moviesCanBeDisplayed(){
        MovieManager movieManager = new MovieManager();
        movieManager.viewMovieList();
        List<String> movieDetailsList = new ArrayList<String>();
        movieDetailsList.add("movie1    director1    2");
        movieDetailsList.add("movie2    director2    1");
        movieDetailsList.add("movie3    director3    2");
        movieDetailsList.add("movie4    director4    3");
        movieDetailsList.add("movie5    director5    4");
        movieDetailsList.add("movie6    director6    5");
        movieDetailsList.add("movie7    director7    6");
        movieDetailsList.add("movie8    director8    7");
        movieDetailsList.add("movie9    director9    8");
        movieDetailsList.add("movie10    director10    8");
        movieDetailsList.add("movie11    director11    9");
        movieDetailsList.add("movie12    director12    1990    N/A");
        movieDetailsList.add("movie13    director13    1990    N/A");
        movieDetailsList.add("movie14    director14    1990    N/A");
        movieDetailsList.add("movie15    director15    1990    N/A");
        Assert.assertEquals(movieDetailsList,movieManager.viewMovieList());
    }
}
