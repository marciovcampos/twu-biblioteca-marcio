package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BookTest {
    @Test
    public void shouldCheckOutBook(){
        Book book = new Book(1, "B1", "A1", 2000);
        book.checkOutBook();
        assertFalse(book.getAvailable());
    }

    @Test
    public void shouldCheckOutAndReturnABook(){
        Book book = new Book(1, "B1", "A1", 2000);
        book.checkOutBook();
        assertFalse(book.getAvailable());
        book.returnBook();
        assertTrue(book.getAvailable());
    }

}
