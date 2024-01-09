import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Trial{

    public static void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        while(!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>(); 
        queue.add(10);      //front
        queue.add(20);      
        queue.add(30);      
        queue.add(40);      //back
        // var front = queue.remove();
        reverse(queue);
        System.out.println(queue);
    }
}