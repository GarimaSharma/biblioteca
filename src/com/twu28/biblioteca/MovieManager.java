package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class MovieManager {
    LibraryMovies libraryMovies = new LibraryMovies();
    List<Movie> movies = libraryMovies.selectAllMovies();
    public MovieManager() {
        libraryMovies.addMovies(new Movie("movie1", "director1", 1990, 2));
        libraryMovies.addMovies(new Movie("movie2", "director2", 1990, 1));
        libraryMovies.addMovies(new Movie("movie3", "director3", 1990, 2));
        libraryMovies.addMovies(new Movie("movie4", "director4", 1990, 3));
        libraryMovies.addMovies(new Movie("movie5", "director5", 1990, 4));
        libraryMovies.addMovies(new Movie("movie6", "director6", 1990, 5));
        libraryMovies.addMovies(new Movie("movie7", "director7", 1990, 6));
        libraryMovies.addMovies(new Movie("movie8", "director8", 1990, 7));
        libraryMovies.addMovies(new Movie("movie9", "director9", 1990, 8));
        libraryMovies.addMovies(new Movie("movie10", "director10", 1990, 8));
        libraryMovies.addMovies(new Movie("movie11", "director11", 1990, 9));
        libraryMovies.addMovies(new Movie("movie12", "director12", 1990, 0));
        libraryMovies.addMovies(new Movie("movie13", "director13", 1990, 0));
        libraryMovies.addMovies(new Movie("movie14", "director14", 1990, 0));
        libraryMovies.addMovies(new Movie("movie15", "director15", 1990, 0));
    }

    public List<String> viewMovieList() {
        List<String> movieDetails = new ArrayList<String>();
        for (Movie movie : movies) {
            movieDetails.add(movie.getFormatedDetails());

        }
        return movieDetails;
    }
}
