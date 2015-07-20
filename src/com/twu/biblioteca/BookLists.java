package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by mcorrales on 7/19/15.
 */
public class BookLists {
    ArrayList<BookDetails> allBooks = new ArrayList<BookDetails>();
    ArrayList<BookDetails> checkedOutBooks = new ArrayList<BookDetails>();
    ArrayList<BookDetails> availableBooks = new ArrayList<BookDetails>();

    public BookLists() {
        BookDetails infernoBook = new BookDetails("Inferno", "Dan Brown", "2013");
        BookDetails vinciBook = new BookDetails("The Da Vinci Code", "Dan Brown", "2013");
        allBooks.add(infernoBook);
        allBooks.add(vinciBook);
        availableBooks = allBooks;
    }

    public void checkOut(String aTitle) {
        if (checkIfBookOnList(availableBooks, aTitle)) {
            checkedOutBooks.add(getBookByTitle(aTitle));
            availableBooks.remove(getBookByTitle(aTitle));
            System.out.print("Thank you! Enjoy the book\n");
        } else {
            System.out.print("That book is not available");
        }
    }

    public void checkIn(String aTitle) {
        if (checkIfBookOnList(checkedOutBooks, aTitle)) {
            checkedOutBooks.remove(getBookByTitle(aTitle));
            availableBooks.add(getBookByTitle(aTitle));
            System.out.print("Thank you for returning the book\n");
        } else {
            System.out.print("This is not a valid book to return\n");
        }
    }

    public boolean checkIfBookOnList(ArrayList<BookDetails> theList, String aTitle){
        for (BookDetails book : theList) {
            if (book.getBookTitle().equals(aTitle)) {
                return true;
            }
        }
        return false;
    }

    public BookDetails getBookByTitle(String aTitle) {
        for (BookDetails book : allBooks) {
            if (book.getBookTitle().equals(aTitle)) {
                return book;
            }
        }
        return null;
    }
}