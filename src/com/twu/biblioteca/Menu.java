package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.twu.biblioteca.Constants.*;

public class Menu {
    private List<String> menuOptions;
    private BibliotecaApp bibliotecaApp;

    public Menu() {
        menuOptions = new ArrayList<String>();
        bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.createAllBooks();
    }

    public void CreateMenu(){
        this.add("1. List of Books");
        this.add("2. Check out book");
        this.add("3. Return a book");
        this.add("9. Exit");
    }

    public List<String> getMenuOptions() {
        return menuOptions;
    }

    public void add (String option) {
        menuOptions.add(option);
    }

    public void print(){
        System.out.println("\nMENU\n");

        for (String option : menuOptions
             ) {
            System.out.println(option);
        }
    }

    public void select (int option)  {
        switch (option){
            case 1:
                bibliotecaApp.printListBooks();
                break;
            case 2:
                System.out.println(SELECT_BOOK_CHECKOUT);
                bibliotecaApp.printListBooks();

                Scanner scanner = new Scanner(System.in);
                int optionNumberCheckOut = scanner.nextInt();
                bibliotecaApp.checkOutBook(optionNumberCheckOut);

                break;
            case 3:
                System.out.println(SELECT_BOOK_RETURN);
                bibliotecaApp.printCheckOutBooks();

                Scanner scannerReturn = new Scanner(System.in);
                int optionNumberReturn = scannerReturn.nextInt();
                bibliotecaApp.returnBook(optionNumberReturn);

                break;
            case 9:
                System.exit(0);

            default:
                System.out.println(SELECT_VALID_OPTION);
                break;
        }
    }



}