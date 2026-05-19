package com.prajwal.problremsLevel2;

import java.util.HashSet;
import java.util.Set;

public class BookRunner {
    public static void main(String[] args) {

        Set<Book> book = new HashSet<>();

        book.add(new Book("Hi",120));
        book.add(new Book("kaki", 130));
        book.add(new Book("jogi", 40));
        book.add(new Book("kali", 80));


        for (Book book1: book){
            System.out.println("Name :"+book1.name + " "+ "price :"+book1.price);
        }


    }
}
