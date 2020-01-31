package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.List;
import org.junit.Before;


public class LibrarianTest {

    private Librarian lib;

    @Before
    public void setUp () {
        lib = new Librarian();
    }

    @Test
    public void checkoutABook() {

        BibliotecaApp bibliotecaApp = new BibliotecaApp();

        assertThat(0, is(bibliotecaApp.getBookList().size()));

        bibliotecaApp.add(new Book(1, "B1", "A1", 2001));
        assertThat(1, is(bibliotecaApp.getBookList().size()));

        bibliotecaApp.add(new Book(2, "B2", "A2", 2002));
        assertThat(2, is(bibliotecaApp.getBookList().size()));

        bibliotecaApp.remove(1);
        assertThat(1, is(bibliotecaApp.getBookList().size()));

    }

}