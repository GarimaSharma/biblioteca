package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class HardCodedMovieData {

    List<Movie> movies = new ArrayList<Movie>();
    public List<Movie> selectAllMovies(){
        return movies;
    }
    public void addMovies(Movie movie){
        movies.add(movie);
    }

}
