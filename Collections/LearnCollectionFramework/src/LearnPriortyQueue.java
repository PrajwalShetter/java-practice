import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriortyQueue  {

    public static void main(String[] args) {

        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // basically it optimizes the min order if u use comparotor reverseordet it shows max order

        pq.offer(40);
        pq.offer(12);
        pq.offer(36);
        pq.offer(24);

        System.out.println(pq);
        pq.poll(); // this method removes the peek element
        System.out.println(pq);
        System.out.println(pq.peek()); // it shows the peek element of the queue


    }
}
