package com.twu.biblioteca;

public class Book {

    private String title;

    public String getTitle(){
        return title;
    }

    public Book(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

}
