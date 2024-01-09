public class Implementation {
    
    public static void main(String[] args) {
        ArrayQueue aq = new ArrayQueue(5);
        aq.enqueue(10);
        aq.enqueue(20);
        aq.enqueue(30);
        // aq.enqueue(40);
        // aq.enqueue(50);

        aq.dequeue();
        var front = aq.dequeue();

        aq.enqueue(40);
        aq.enqueue(50);
        aq.enqueue(60);
        aq.enqueue(70);
        aq.dequeue();
        aq.enqueue(80);

        System.out.println(front);
        System.out.println(aq);
    }
}
