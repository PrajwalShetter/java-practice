package com.xworkz.devcollections.Arraylist.compareLearning.Book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class BookDto implements Comparable<BookDto> {


    private int bookId;
    private String bookName;
    private  String Author;
    private  int pageCount;
    private int publishYear;
    private double price;

    @Override
    public int compareTo(BookDto o) {
        return this.bookId-o.getBookId();
    }
}
