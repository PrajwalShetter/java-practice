package com.xworkz.devcollections.Arraylist.compareLearning.Book;

import java.util.Comparator;

public class BookAuthorComparator implements Comparator<BookDto> {

    @Override
    public int compare(BookDto o1, BookDto o2) {
        return o1.getAuthor().compareTo(o2.getAuthor());
    }
}
