package com.xworkz.devcollections.Arraylist.compareLearning.Book;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookRunner {
    public static void main(String[] args) {

        BookDto book1 = new BookDto(1,"The Alchemist","Paulo Coelho",172,1988,259);
        BookDto book2 = new BookDto(2,"Java Programming","James Gosline",200,1970,2300);
        BookDto book3 = new BookDto(3,"Heli Hogo karana","Ravi beligeri",300,2024,200);
        BookDto book4 = new BookDto(4,"Malegalalli MaduMagalu","Kuvempu",400,2000,150);
        BookDto book5 = new BookDto(5,"Rich Dada nad Poor dad","sachine",500,2018,300);
        BookDto book6 = new BookDto(6,"Love","Jullite",200,2002,200);
        BookDto book7 = new BookDto(7,"Be we with me","praveen",200,1990,1000);
        BookDto book8 = new BookDto(8,"gardian Arrest","prajwal",90,2000,800);
        BookDto book9 = new BookDto(9,"Justice","kim jhon",370,2007,900);

        List<BookDto> bookDtos = new ArrayList<>();
        bookDtos.add(book1);
        bookDtos.add(book2);
        bookDtos.add(book3);
        bookDtos.add(book4);
        bookDtos.add(book5);
        bookDtos.add(book6);
        bookDtos.add(book7);
        bookDtos.add(book8);
        bookDtos.add(book9);


        System.out.println("Without sort");
        for (BookDto book:bookDtos){
            System.out.println(book);
        }
        Collections.sort(bookDtos);

        System.out.println(" sort by id (comparable)");
        for (BookDto book:bookDtos){
            System.out.println(book);
        }

        Collections.sort(bookDtos , new BookAuthorComparator());

        System.out.println(" sort by Author (comparator)");
        for (BookDto book:bookDtos){
            System.out.println(book);
        }

        Collections.sort(bookDtos, new BookNameComparator());

        System.out.println("Sort by BokName(Comparator)");
        for(BookDto book : bookDtos){
            System.out.println(book);
        }

        Collections.sort(bookDtos, new BookPublishYearComparator());
        System.out.println("Sort by publishYear(Comparator)");
        for(BookDto book : bookDtos){
            System.out.println(book);
        }

        Collections.sort(bookDtos, new BookPriceComparator());
        System.out.println("Sort by price(Comparator)");
        for (BookDto book : bookDtos){
            System.out.println(book);
        }

        Collections.sort(bookDtos, new BookPriceComparator());
        System.out.println("Sort by pageCount(Comparator)");
        for(BookDto book : bookDtos){
            System.out.println(book);
        }









    }
}
