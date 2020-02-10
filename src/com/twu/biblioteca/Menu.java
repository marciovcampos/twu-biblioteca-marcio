package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
                Librarian lib = new Librarian();
                System.out.println("Plese select a book to checkout:");
                bibliotecaApp.printListBooks();

                Scanner scanner = new Scanner(System.in);
                int optionNumber = scanner.nextInt();
                System.out.println("select:" + optionNumber);

                break;
            case 9:
                System.exit(0);

            default:
                System.out.println("Please select a valid option!");
                break;
        }
    }



}