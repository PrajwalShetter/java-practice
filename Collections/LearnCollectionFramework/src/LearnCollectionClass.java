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

        List<Student> list1 = new ArrayList<>();

        list1.add(new Student("arjuna", 2));
        list1.add(new Student("manikya", 1));
        list1.add(new Student("prajwal", 4));
        list1.add(new Student("praveen", 3));

        Student s1 = new Student("ishan", 5);
        Student s2 = new Student("zyan", 6);

        System.out.println((s1.compareTo(s2)));

        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);

        Collections.sort(list1, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        System.out.println(list1);


    }
}
