package com.twu.biblioteca;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ExampleTest {

    @Test
    public void mainGreetingDisplays() {
        BibliotecaApp biblioteca = new BibliotecaApp();

        assertEquals("Menu not displayed properly", "Welcome to the Biblioteca\n", biblioteca.displayMenuGreeting());
    }

    @Test
    public void bookListDisplays() {
        BibliotecaApp biblioteca = new BibliotecaApp();
        ArrayList<BookDetails> bookList = new ArrayList<BookDetails>();

        BookDetails book = new BookDetails("Inferno", "Dan Brown", "2013");
        bookList.add(book);

        assertEquals("Books not displaying properly", "These are our books:\n\"Inferno\" (2013) by Dan Brown\n", biblioteca.displayBookList(bookList));
    }

    @Test
    public void bookDetailsDisplay() {
        BookDetails book = new BookDetails("Inferno", "Dan Brown", "2013");

        assertEquals("Book details not showing", "\"Inferno\" (2013) by Dan Brown\n", book.toString());
    }

    @Test
    public void menuItemDisplays() {
        AppMenuItem menuItem = new AppMenuItem("1", "List Books");

        assertEquals("Main Menu not displaying properly", "1. List Books", menuItem.toString());
    }

//    @Test
//    public void menuOptionSelectedIsInvalid() {
//        BibliotecaApp biblioteca = new BibliotecaApp();
//        ArrayList<BookDetails> bookList = new ArrayList<BookDetails>();
//
//        BookDetails book = new BookDetails("Inferno", "Dan Brown", "2013");
//        bookList.add(book);
//
//        assertEquals("Invalid selection not working", "Select a valid option!", biblioteca.menuSelect(bookList, -1));
//    }
}
