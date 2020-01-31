
package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BibliotecaAppTest {

    private BibliotecaApp bibliotecaApp;

    @Before
    public void setUp() throws Exception {
        bibliotecaApp = new BibliotecaApp();


    }

    @Test

    public void shouldShowWelcomeMessage() {
        String message = bibliotecaApp.welcomeMessage();
        assertEquals("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!", message);
    }


    @Test
    public void verifyIfCreateAllBooks(){
        bibliotecaApp.createAllBooks();
        assertNotNull(bibliotecaApp.getBookList());
    }

    @Test
    public void verifyIfCreatedBooks(){
        assertThat(0, is(bibliotecaApp.getBookList().size()));

        bibliotecaApp.add(new Book(1, "B1", "A1", 2001));
        assertThat(1, is(bibliotecaApp.getBookList().size()));

        bibliotecaApp.add(new Book(2, "B2", "A2", 2002));
        assertThat(2, is(bibliotecaApp.getBookList().size()));

    }




}