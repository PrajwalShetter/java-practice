package com.xworkz.devcollections.Arraylist.compareLearning.Book;

import java.util.Comparator;

public class BookPriceComparator implements Comparator<BookDto> {

    @Override
    public int compare(BookDto o1, BookDto o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}
