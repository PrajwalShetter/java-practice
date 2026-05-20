package com.prajwal.problremsLevel2;

import java.util.LinkedList;
import java.util.Queue;

public class MovieTicketBooking {
    public static void main(String[] args) {

        Queue<String> names = new LinkedList<>();

        names.offer("Ravi");
        names.offer("praveen");
        names.offer("zyan");
        names.offer("tara");
        names.offer("jagan");

        System.out.println("waiting for ticket booking :"+names);

        while(!names.isEmpty()){
            System.out.println("ticket booked for "+names.poll());
            System.out.println("Next Customer :"+names.peek());
        }


    }
}
