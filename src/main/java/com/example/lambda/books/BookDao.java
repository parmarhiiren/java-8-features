package com.example.lambda.books;

import java.util.ArrayList;
import java.util.List;

public class BookDao {

    public List<Book> getBooks() {
        List<Book> listOfBooks = new ArrayList<Book>();
        listOfBooks.add(new Book(1,"Java 8", 100));
        listOfBooks.add(new Book(2,"Spring", 150));
        listOfBooks.add(new Book(3,"AWS", 50));
        listOfBooks.add(new Book(4,"Docker", 75));
        return listOfBooks;
    }
}
