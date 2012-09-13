package com.twu28.biblioteca;
public class Book {
    //todo make category enum if future requirement comes so
    private String category = "Health";
    private String name;


    public boolean isOfSpecificCategory(String category) {
        return category.equals(this.category);
    }

    public Book(String category, String name) {
        this.category = category;
        this.name = name;

    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (category != null ? !category.equals(book.category) : book.category != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return category != null ? category.hashCode() : 0;
    }

    public String getName() {
        return name;
    }
}
