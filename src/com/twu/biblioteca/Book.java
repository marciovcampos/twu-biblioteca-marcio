package com.twu.biblioteca;

public class Book {

    private String title;
    private String author;
    private Number year;

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public Number getYear(){
        return year;
    }

    public Book(String title, String author, Number year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return title;
    }

}
