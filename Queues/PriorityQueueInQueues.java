import java.util.PriorityQueue;

public class PriorityQueueInQueues {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(1);
        pq.add(3);
        pq.add(2);
        // pq.add(null);
        while (!pq.isEmpty()) {
            System.out.println(pq.remove());
        }
    }
}
