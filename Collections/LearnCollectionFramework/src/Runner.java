import java.util.HashSet;
import java.util.Set;

public class Runner {

    public static void main(String[] args) {
        Set<Student> StudentSet = new HashSet<>();

        StudentSet.add(new Student("Anuj",12));
        StudentSet.add(new Student("Rakesh",13));
        StudentSet.add(new Student("praveen",14));
        StudentSet.add(new Student("Akashy",12));

        System.out.println(StudentSet);
    }
}
