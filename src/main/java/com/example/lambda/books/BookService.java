package com.example.lambda.books;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

    public List<Book> getBooksinSortedOrder() {
        // Get the list of Books
        List<Book> listofBooks = new BookDao().getBooks();
        // Traditional Way to sort
        // Collections.sort(listofBooks, new BooksComparator());

        // Lamda way for sorting. The entire BookComparator can be written in a one line
        // Collections.sort(listofBooks, (book1,book2) -> book1.getName().compareTo(book2.getName()));
        Collections.sort(listofBooks, Comparator.comparing(Book::getName));
        return listofBooks;
    }

    public static void main(String[] args) {
        System.out.println("Books in Sorted Order = " + new BookService().getBooksinSortedOrder());
    }
}

// Traditional Way
// implement Comparator Interface and override the compare method
//class BooksComparator implements Comparator<Book> {
//
//    @Override
//    public int compare(Book book1, Book book2) {
//        return book2.getName().compareTo(book1.getName());
//    }
//}
