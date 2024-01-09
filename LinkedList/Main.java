package LinkedList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        // list.addFirst(5);
        // System.out.println("List size: " + list.size());
        // System.out.println(list.indexOf(30));
        // System.out.println(list.indexOf(15));
        // System.out.println(list.contains(8));
        // list.removeFirst();
        // list.removeLast();
        // System.out.println("After removing last element: " + list.size());
        // list.reverse();
        // var arr = list.toArray();
        // System.out.println(Arrays.toString(arr));
        System.out.println(list.getKthFromTheEnd(4));
    }
}
