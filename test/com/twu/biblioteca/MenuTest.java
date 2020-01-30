package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.List;
import org.junit.Before;


public class MenuTest {

    private Menu menu;

    @Before
    public void setUp () {
        menu = new Menu();
    }

    @Test
    public void shouldAddNewMenuOptions () {

        Menu menu = new Menu();
        List<String> menuOptions;

        menuOptions = menu.getMenuOptions();
        assertThat(0, is(menuOptions.size()));

        menu.add("1. List of books");
        menuOptions = menu.getMenuOptions();
        assertThat(1, is(menuOptions.size()));
    }

}