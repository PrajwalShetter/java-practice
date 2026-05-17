import java.util.*;

public class LearnCollectionClass {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(9);
        list.add(18);
        list.add(90);
        list.add(6);
        list.add(30);
        list.add(89);
        list.add(67);
        list.add(22);
        list.add(9);
        list.add(9);

        System.out.println(list);

        System.out.println("min element :"+ Collections.min(list)); // it prints the minimum element in the list
        System.out.println("Max element :"+Collections.max(list)); // it prints the maximum element in the list
        System.out.println("Frequency :"+Collections.frequency(list, 9)); // it prints the frequency of the given number

        Collections.sort(list); // it sorts the arraylist
        System.out.println("Accending order :"+list);

        Collections.sort(list, Comparator.reverseOrder());// it sorts the array in the reverse order
        System.out.println("Decnding order :"+list);

    }
}
