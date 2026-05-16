import java.util.Stack;

public class LearnStack {

    public static void main(String[] args) {

        Stack<String> animal = new Stack<>();

        animal.push("Dog"); // adding elements to the stack
        animal.push("Cat");
        animal.push("Horse");
        animal.push("Lion");
        System.out.println("Stack :"+animal);

        System.out.println("peek of the stack :"+animal.peek()); // it shows the top most element present in the stack

        animal.pop(); // removes the top most element in the stack
        System.out.println(animal);


    }
}
