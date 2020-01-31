package com.twu.biblioteca;

public class Book {

    private int id;
    private String title;
    private String author;
    private Number year;
    private boolean available;

    public int getId() { return id; }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public Number getYear(){
        return year;
    }

    public boolean getAvailable(){ return available;}

    public Book(int id, String title, String author, Number year){
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.available = true;
    }

    @Override
    public String toString() {
        return title;
    }

    public void rent(){
        this.available = false;
    }

}
