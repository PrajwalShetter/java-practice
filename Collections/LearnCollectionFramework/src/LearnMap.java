import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class LearnMap {

    public static void main(String[] args) {

        Map<String, Integer> numbers = new HashMap<>();

        numbers.put("One",1); // this method inserts the key and value in the map, it will not arrange 
        numbers.put("two",2);
        numbers.put("three",3);
        numbers.put("Four",4);
        numbers.put("Five",5);

        if(!numbers.containsKey("two")){  // this condition checks the key value present in the map or not if not then insert the key and value to the map
            numbers.put("Two",2);
        }

        numbers.putIfAbsent("two", 2); // we can use this method ,easier then the condition

        System.out.println(numbers.containsValue(9)); // this method checks the if the given value is there or not in the mapset

        System.out.println(numbers);

        System.out.println(numbers.isEmpty()); // this method checks the mapset is empty or not

        for (Map.Entry<String, Integer> e: numbers.entrySet()){ // this loop prints the mapset, keys, and values

            System.out.println(e);

            System.out.println(e.getKey());
            System.out.println(e.getValue());

        }

        for (String key : numbers.keySet()){ // this loop returns only the keys of the mapset
            System.out.println(key);
        }

        System.out.println(numbers.values()); // this method prints the values of the mapset

        numbers.clear(); // it clear the mapset
        System.out.println(numbers);


        // TreeMap
        Map<String, Integer> numbers1 = new TreeMap<>();

        numbers1.put("One",1); // this method inserts the key and value in the map, it has sorted manner acc to keys
        numbers1.put("two",2);
        numbers1.put("three",3);
        numbers1.put("Four",4);
        numbers1.put("Five",5);

        System.out.println(numbers1);

        numbers1.remove("three");
        System.out.println(numbers1);
    }
}
