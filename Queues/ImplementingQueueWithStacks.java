public class ImplementingQueueWithStacks {
    
    public static void main(String[] args) {
        QueueWithStacks queue = new QueueWithStacks();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        var first = queue.dequeue();
        System.out.println(first);
    }
}
