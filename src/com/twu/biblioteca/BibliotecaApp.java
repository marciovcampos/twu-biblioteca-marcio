package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Hello, world!");
        BibliotecaApp bibliotecaApp = new BibliotecaApp();

        String message = bibliotecaApp.welcomeMessage();
        System.out.println(message);

        ArrayList<Book> bookList = bibliotecaApp.listOfBooks();

        for (Book b: bookList) {
            System.out.println(b.getTitle());
        }

    }

    public String welcomeMessage() {
        return "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    }

    public ArrayList<Book> listOfBooks() {
        ArrayList<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book("Book 1"));
        bookList.add(new Book("Book 2"));
        bookList.add(new Book("Book 3"));
        return bookList;
    }

}




