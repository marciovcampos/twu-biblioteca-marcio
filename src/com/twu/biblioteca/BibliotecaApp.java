package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {

    private ArrayList<Book> bookList;

    public ArrayList<Book> getBookList(){
        return bookList;
    }

    public static void main(String[] args) {

        BibliotecaApp bibliotecaApp = new BibliotecaApp();

        String message = bibliotecaApp.welcomeMessage();
        System.out.println(message);

        Menu menu = new Menu();
        menu.CreateMenu();

        int optionNumber;
        do {
            menu.print();
            Scanner scanner = new Scanner(System.in);
            optionNumber = scanner.nextInt();
            menu.select(optionNumber);
        }
        while (optionNumber != 9);

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
        bookList.add(new Book(1,"Book 1", "Author 1", 2000));
        bookList.add(new Book(2, "Book 2", "Author 2", 2001));
        bookList.add(new Book(3,"Book 3", "Author 3", 2002));
        return bookList;
    }

}




