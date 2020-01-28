
package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

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

    public void listAllBooks(){
        assertNotNull(bibliotecaApp.listOfBooks());
    }

}