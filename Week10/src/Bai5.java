import java.util.ArrayList;

public class Bai5 {
    /** Some hidden code. */

    class Node {
        int data;
        Node left;
        Node right;
    }

    boolean checkBST(Node root) {
        ArrayList<Integer> traversals = new ArrayList<>();
        inOrder(root, traversals);
        int size = traversals.size() - 1;
        for (int i = 1; i < size; i++) {
            if (traversals.get(i) <= traversals.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    private void inOrder(Node root, ArrayList<Integer> traversals) {
        if (root == null) {
            return;
        }
        inOrder(root.left, traversals);
        traversals.add(root.data);
        inOrder(root.right, traversals);
    }
}
