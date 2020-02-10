package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {

    private ArrayList<Book> bookList;

    public ArrayList<Book> getBookList(){
        return bookList;
    }

    public BibliotecaApp() {
        bookList = new ArrayList<Book>();
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

    public void printListBooks(){
        System.out.format("%-10s %-10s %-10s %-10s %n", "ID", "TITLE", "AUTHOR", "YEAR");
        for (Book b: getAvailableBookList()) {
            System.out.format("%-10s %-10s %-10s %-10s %n", b.getId(), b.getTitle(), b.getAuthor(), b.getYear());
        }
    }

    public void printCheckOutBooks(){
        System.out.format("%-10s %-10s %-10s %-10s %n", "ID", "TITLE", "AUTHOR", "YEAR");
        for (Book b: getCheckOutBookList()) {
            System.out.format("%-10s %-10s %-10s %-10s %n", b.getId(), b.getTitle(), b.getAuthor(), b.getYear());
        }
    }

    public void add(Book book){
        this.bookList.add(book);
    }

    public void remove(int id){
        this.bookList.remove(id);
    }

    public void createAllBooks(){
        this.bookList.add(new Book(1,"Book 1", "Author 1", 2000));
        this.bookList.add(new Book(2, "Book 2", "Author 2", 2001));
        this.bookList.add(new Book(3,"Book 3", "Author 3", 2002));
    }

    public List<Book> getAvailableBookList(){

        List<Book> availableBookList = new ArrayList<Book>();

        for (Book book: this.bookList
             ) {
            if(book.getAvailable()){
                availableBookList.add(book);
            }
        }

        return availableBookList;

    }

    public List<Book> getCheckOutBookList(){

        List<Book> checkOutBookList = new ArrayList<Book>();

        for (Book book: this.bookList
        ) {
            if(!book.getAvailable()){
                checkOutBookList.add(book);
            }
        }

        return checkOutBookList;

    }

    public Book getBookById(int id){

        Book b = null;
        for (Book book: this.bookList
             ) {
            if(id == book.getId()){
                b = book;
            }
        }
        return b;
    }

    public void checkOutBook(int id){
        Book book = getBookById(id);

        try{
            if(book.getAvailable()){
                book.checkOutBook();
                System.out.println("Thank you! Enjoy the book!");
            }else{
                System.out.println("Sorry, that book is not available!");
            }
        }catch (Exception e){
            System.out.println("Invalid Book!");
        }

    }

    public void returnBook(int id){
        Book book = getBookById(id);

        try{
            if(!book.getAvailable()){
                book.returnBook();
                System.out.println("Thank you for returning the book!");
            }else{
                System.out.println("Sorry, that book has already been returned!");
            }
        }catch (Exception e){
            System.out.println("Invalid Book!");
        }

    }

}




