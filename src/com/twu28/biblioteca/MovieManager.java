package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class MovieManager {
    List<Movie> movies = new ArrayList<Movie>();
    public MovieManager(){
        movies.add(new Movie("movie1","director1",1990,2));
        movies.add(new Movie("movie2","director2",1990,1));
        movies.add(new Movie("movie3","director3",1990,2));
        movies.add(new Movie("movie4","director4",1990,3));
        movies.add(new Movie("movie5","director5",1990,4));
        movies.add(new Movie("movie6","director6",1990,5));
        movies.add(new Movie("movie7","director7",1990,6));
        movies.add(new Movie("movie8","director8",1990,7));
        movies.add(new Movie("movie9","director9",1990,8));
        movies.add(new Movie("movie10","director10",1990,8));
        movies.add(new Movie("movie11","director11",1990,9));
        movies.add(new Movie("movie12","director12",1990,0));
        movies.add(new Movie("movie13","director13",1990,0));
        movies.add(new Movie("movie14","director14",1990,0));
        movies.add(new Movie("movie15","director15",1990,0));
    }

    public List<String> viewMovieList() {
        List<String> movieDetails = new ArrayList<String>();
        for (Movie movie : movies) {
            movieDetails.add(movie.getFormatedDetails());

        }
        return movieDetails;
    }
}
