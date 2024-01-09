public class Main {
    
    public static void main(String[] args) {
        // String str = "abcd";
        // StringReverser reverser = new StringReverser();
        // var result = reverser.reverse(null);
        // System.out.println(result);

        // String input = "[(1 + 2)]}";
        // String input = "(()";
        // String input = ")(";
        // String input = "[]";
        // BalancedString bs = new BalancedString();
        // var result = bs.isBalanced(input);
        // System.out.println(result);

        Stacks stacks = new Stacks();
        stacks.push(10);
        stacks.push(15);
        stacks.push(20);
        // stacks.pop();
        // stacks.pop();
        int peeked = stacks.peek();
        System.out.println("Peeked element: " + peeked);
        System.out.println(stacks.toString());
    }
}
