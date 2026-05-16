import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {

    public static void main(String[] args) {

        ArrayList<String> studentsName = new ArrayList<>();
//        size = new n+n/2+1;
        studentsName.add("Rakesh");

        List<Integer> list = new ArrayList<>(); // creating new arraylist
        list.add(0);
        list.add(1);
        list.add(2);
        System.out.println(list);

        list.add(3); // this will add the element at the last of the array
        System.out.println(list);

        list.add(2,60); // this will add the element at the given index
        System.out.println(list);

        List<Integer> newList = new ArrayList<>();
        newList.add(150);
        newList.add(160);

        list.addAll(newList); // this method merging the 2 array list
        System.out.println(list);

        list.remove(1); //this method removes the element base of index
        System.out.println(list);

        list.remove(Integer.valueOf(3)); // this method removes the element base on given element
        System.out.println(list);

        list.set(2,2000); // this method updates the element base on index
        System.out.println(list);

        //looping
        for(int i=0; i< list.size();i++){
            System.out.println("The element is :"+list.get(i));
        }
        for(Integer element :list){
            System.out.println("foreach element is :"+element);
        }
        Iterator<Integer> it= list.iterator();

        while (it.hasNext()){
            System.out.println("Iterator :"+it.next());
        }


        System.out.println(list.contains(2000)); // this method shows the element is there in the list or not

        list.clear(); // this method clears all elements in the list
        System.out.println(list);


    }
}
