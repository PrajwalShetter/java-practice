import java.util.Arrays;

public class LearnArraysClass {

    public static void main(String[] args) {

        int[] numbers1 = {1,2,3,4,5,6,7,8,9}; // creating an array
        int index = Arrays.binarySearch(numbers1,4); // performing an binary search , its an inbuilt method
        System.out.println("the index of element 4 is :"+index);

        int[] numbers = {1,7,8,5,0,2,0,4,7,8,2,9,6,5};
        Arrays.sort(numbers); // performing sort method

        for (int i: numbers){
            System.out.print(i+ " ");

        }
        System.out.println();
        Arrays.fill(numbers, 12); // it fills the given number to the all elements of the array
        for (int i : numbers){

            System.out.print(i+ " ");
        }




    }
}
