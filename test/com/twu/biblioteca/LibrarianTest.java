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

}