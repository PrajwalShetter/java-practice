package com.prajwal.problremsLevel2;

import java.util.Stack;

public class ReverseWord {

    public static void main(String[] args) {

        String word = "Prajwal";

        Stack<Character> single = new Stack<>();

        for(int i=0; i<word.length(); i++){
            single.push(word.charAt(i));
        }
        System.out.println(single);

        while (!single.isEmpty()){
            System.out.print(single.pop());

        }



    }
}
