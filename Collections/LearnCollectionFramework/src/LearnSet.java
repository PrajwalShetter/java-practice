import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

    public static void main(String[] args) {
        //HashSet
        Set<Integer> set = new HashSet<>();

        set.add(32); // this method is append element to the set, here set is like a bucket its not in orderwise
        set.add(67);
        set.add(20);
        set.add(78);
        set.add(688);

        System.out.println(set);

        set.add(54); //  here appending 54, 3 times but it inserts only one time it not accept duplicates
        set.add(54);
        set.add(54);

        System.out.println(set);

        set.remove(688); // it removes the element

        System.out.println(set);

        System.out.println(set.contains(233)); // this method checks the element is present in the set or not

        System.out.println(set.isEmpty()); // this method checks the set is empty or not

        System.out.println(set.size()); // this method prints the size of the set

        set.clear(); // this method clears the set
        System.out.println(set);

        //LinkedHashSet
        Set<Integer> Set1 = new LinkedHashSet<>();
        Set1.add(32); // this method is append element to the Set1, here it will take orderwise
        Set1.add(67);
        Set1.add(20);
        Set1.add(78);
        Set1.add(688);

        System.out.println(Set1);

        Set1.add(54); //  here appending 54, 3 times but it inserts only one time it not accept duplicates
        Set1.add(54);
        Set1.add(54);

        System.out.println(Set1);

        Set1.remove(688); // it removes the element

        System.out.println(Set1);

        System.out.println(Set1.contains(233)); // this method checks the element is present in the Set1 or not

        System.out.println(Set1.isEmpty()); // this method checks the Set1 is empty or not

        System.out.println(Set1.size()); // this method prints the size of the Set1

        Set1.clear(); // this method clears the Set1
        System.out.println(Set1);


        //TreeSet
        Set<Integer> set2 = new TreeSet<>();

        set2.add(32); // this method is append element to the set2, here it will make sort
        set2.add(67);
        set2.add(20);
        set2.add(78);
        set2.add(688);

        System.out.println(set2);

        set2.add(54); //  here appending 54, 3 times but it inserts only one time it not accept duplicates
        set2.add(54);
        set2.add(54);

        System.out.println(set2);

        set2.remove(688); // it removes the element

        System.out.println(set2);

        System.out.println(set2.contains(233)); // this method checks the element is present in the set2 or not

        System.out.println(set2.isEmpty()); // this method checks the set2 is empty or not

        System.out.println(set2.size()); // this method prints the size of the Set2

        set2.clear(); // this method clears the Set2
        System.out.println(set2);


    }
}
