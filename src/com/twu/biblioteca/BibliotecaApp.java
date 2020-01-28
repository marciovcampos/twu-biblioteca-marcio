package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    private ArrayList<Book> bookList;

    public ArrayList<Book> getBookList(){
        return bookList;
    }

    public static void main(String[] args) {
        System.out.println("Hello, world!");
        BibliotecaApp bibliotecaApp = new BibliotecaApp();

        String message = bibliotecaApp.welcomeMessage();
        System.out.println(message);
        bibliotecaApp.insertBooks();
        bibliotecaApp.printListBooks();

    }

    public String welcomeMessage() {
        return "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    }

    public void insertBooks(){
        this.bookList = getAllBooks();
    }

    public void printListBooks(){
        for (Book b: getBookList()) {
            System.out.format("%-30.30s %-30.30s %-30.30s %n", b.getTitle(), b.getAuthor(), b.getYear());
        }
    }

    public ArrayList<Book> getAllBooks(){
        ArrayList<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book("Book 1", "Author 1", 2000));
        bookList.add(new Book("Book 2", "Author 2", 2001));
        bookList.add(new Book("Book 3", "Author 3", 2002));
        return bookList;
    }

}




