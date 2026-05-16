import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedlistQueue {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(70); // adding elements in the queue
        queue.offer(80);
        queue.offer(90);
        queue.offer(100);
        System.out.println(queue);
        System.out.println("peek element in the array :"+queue.peek());

        System.out.println(queue.poll()); // this method remove the peek element
        System.out.println(queue);
    }
}
