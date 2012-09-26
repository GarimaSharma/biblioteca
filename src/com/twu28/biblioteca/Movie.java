package com.twu28.biblioteca;

public class Movie {
    private String name;
    private String director;
    private int year;
    private int rating;
    private int defaultRatingForNonRatedMovies = 0;

    public Movie(String name, String director, int year, int rating) {
        this.name = name;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }

    public String getFormatedDetails() {
        String formatedDetails = new String(name);
        StringBuilder stringBuilder = new StringBuilder(formatedDetails);
        stringBuilder.append("    ");
        stringBuilder.append(director);
        stringBuilder.append("    ");
        if (rating == defaultRatingForNonRatedMovies) {
            stringBuilder.append(year);
            stringBuilder.append("    ");
            stringBuilder.append("N/A");
            return stringBuilder.toString();
        }
        stringBuilder.append(rating);

        return stringBuilder.toString();
    }
}
