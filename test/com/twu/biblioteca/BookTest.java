package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BookTest {
    @Test
    public void shouldChangeAvailableBook(){
        Book book = new Book(1, "B1", "A1", 2000);
        book.rent();
        assertFalse(book.getAvailable());
    }

}
