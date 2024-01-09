public class Main {
    public static void main(String[] args) {
        ArrayCode numbers = new ArrayCode(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        System.out.println("Before removing an element");
        numbers.print();
        numbers.removeAt(1);
        System.out.println("After removing an element");
        numbers.print();
        System.out.println(numbers.indexAt(5));

    }
}
