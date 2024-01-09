package Tree;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Tree bt = new Tree();
        bt.insert(7);
        bt.insert(4);
        bt.insert(9);
        bt.insert(1);
        bt.insert(6);
        bt.insert(8);
        bt.insert(10);
        // System.out.println("Done");
        // System.out.println(bt.find(3));
        // bt.traversePreOrder();
        // System.out.println("Height of tree " + bt.height());
        // System.out.println(bt.min());
        // System.out.println(bt.isBinarySearchTree());
        // var list = bt.getNodesAtDistance(2);
        // for (var item: list)
        //     System.out.println(item);
        bt.traverseLevelOrder();

        // Tree bt2 = new Tree();
        // bt2.insert(7);
        // bt2.insert(4);
        // bt2.insert(9);
        // bt2.insert(1);-
        // bt2.insert(6);
        // bt2.insert(8);
        // bt2.insert(10);
        // System.out.println(bt.equals(null));
    }
}