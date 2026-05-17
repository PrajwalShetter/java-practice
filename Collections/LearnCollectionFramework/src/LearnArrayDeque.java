import java.util.ArrayDeque;

public class LearnArrayDeque {

    public static void main(String[] args) {


        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(20); // as usual appending the element
        adq.offerFirst(10); // this method helps to append the left side of the array
        adq.offerLast(30); // this method helps to append the element right side of the array
        adq.offer(40);

        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println("poll():"+adq);

        System.out.println(adq.pollFirst());
        System.out.println("pollfirst() :"+adq);

        System.out.println(adq.pollLast());
        System.out.println("Polllast() :"+adq);


    }

}
