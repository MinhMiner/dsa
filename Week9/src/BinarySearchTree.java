import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class BinarySearchTree<Key extends Comparable<Key>, Value> {
    private Node root;

    private class Node {
        private Key key;
        private Value val;
        private Node left, right;
        private int count;

        public Node(Key key, Value val) {
            this.key = key;
            this.val = val;
            count = 1;
        }
    }

    /** Return the size of the tree. */
    public int size() {
        return size(root);
    }

    private int size(Node x) {
        if (x == null) {
            return 0;
        }
        return x.count;
    }

    /** Insert a pair of key and value into the tree. */
    public void put(Key key, Value val) {
        root = put(root, key, val);
    }

    private Node put(Node x, Key key, Value val) {
        if (x == null) {
            return new Node(key, val);
        }

        ++x.count;
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            x.left = put(x.left, key, val);
        } else if (cmp > 0) {
            x.right = put(x.right, key, val);
        } else {
            x.val = val;
        }
        return x;
    }

    /** Delete the minimum key from the tree. */
    public void deleteMin() {
        root = deleteMin(root);
    }

    private Node deleteMin(Node x) {
        if (x == null) {  
            return null;
        }
        --x.count;
        if (x.left == null) {
            return x.right;
        }
        x.left = deleteMin(x.left);
        return x;
    }

    /** Delete the maximum key from the tree. */
    public void deleteMax() {
        root = deleteMax(root);
    }

    private Node deleteMax(Node x) {
        if (x == null) {
            return null;
        }
        --x.count;
        if (x.right == null) {
            return x.left;
        }
        x.right = deleteMax(x.right);
        return x;
    }

    /** Delete the given key from the tree. */
    public void delete(Key key) {
        root = delete(root, key);
    }

    private Node delete(Node x, Key key) {
        if (x == null) {
            return null;
        }

        --x.count;
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            x.left = delete(x.left, key);
        } else if (cmp > 0) {
            x.right = delete(x.right, key);
        } else {
            if (x.left == null) {
                return x.right;
            }
            if (x.right == null) {
                return x.left;
            }
            int count = x.count;
            Node t = x;
            x = ceiling(x.right, key);
            x.right = deleteMin(t.right);
            x.left = t.left;
            x.count = count;
        }
        return x;
    }

    /** Get a value of a key. */
    public Value get(Key key) {
        return get(root, key);
    }

    private Value get(Node x, Key key) {
        if (x == null) {
            return null;
        }

        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            return get(x.left, key);
        } else if (cmp > 0) {
            return get(x.right, key);
        } else {
            return x.val;
        }
    }

    /** Get the smallest key in the tree. */
    public Key minKey() {
        return minKey(root);
    }

    private Key minKey(Node x) {
        if (x == null) {
            return null;
        }

        if (x.left == null) {
            return x.key;
        }

        return minKey(x.left);
    }

    /** Get the largest key in the tree. */
    public Key maxKey() {
        return maxKey(root);
    }

    private Key maxKey(Node x) {
        if (x == null) {
            return null;
        }

        if (x.right == null) {
            return x.key;
        }

        return maxKey(x.right);
    }

    /** Get the maximum key that is smaller than the given key. */
    public Key floor(Key key) {  
        Node x = floor(root, key);
        if (x == null) {
            return null;
        }
        return x.key;
    }

    private Node floor(Node x, Key key) {  
        if (x == null) {
            return null;
        }

        int cmp = key.compareTo(x.key);
        if (cmp == 0) {
            return x;
        }
        if (cmp < 0) {
            return floor(x.left, key);
        }

        Node t = floor(x.right, key);
        if (t != null) {
            return t;
        }

        return x;
    }

    /** Get the minimum key that is larger than the given key. */
    public Key ceiling(Key key) {
        Node x = ceiling(root, key);
        if (x == null) {
            return null;
        }
        return x.key;
    }

    private Node ceiling(Node x, Key key) {
        if (x == null) {
            return null;
        }

        int cmp = key.compareTo(x.key);
        if (cmp == 0) {
            return x;
        }
        if (cmp > 0) {
            return ceiling(x.right, key);
        }

        Node t = ceiling(x.left, key);
        if (t != null) {
            return t;
        }
        return x;
    }

    /** Return the number of keys that are smaller than the given key. */
    public int rank(Key key) {
        return rank(root, key);
    }

    private int rank(Node x, Key key) {
        if (x == null) {
            return 0;
        }

        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            return rank(x.left, key);
        }
        if (cmp == 0) {
            return size(x.left);
        }
        return size(x.left) + 1 + rank(x.right, key);
    }

    /** Get in-order keys set. */
    public Iterable<Key> inOrderKeys() {
        ArrayList<Key> keys = new ArrayList<>();
        inOrder(root, keys);
        return keys;
    }

    private void inOrder(Node x, ArrayList<Key> keys) {
        if (x == null) {
            return;
        }
        inOrder(x.left, keys);
        keys.add(x.key);
        inOrder(x.right, keys);
    }

    /** Get pre-order keys set. */
    public Iterable<Key> preOrderKeys() {
        ArrayList<Key> keys = new ArrayList<>();
        preOrder(root, keys);
        return keys;
    }

    private void preOrder(Node x, ArrayList<Key> keys) {
        if (x == null) {
            return;
        }
        keys.add(x.key);
        preOrder(x.left, keys);
        preOrder(x.right, keys);
    }

    /** Get post-order keys set. */
    public Iterable<Key> postOrderKeys() {
        ArrayList<Key> keys = new ArrayList<>();
        postOrder(root, keys);
        return keys;
    }

    private void postOrder(Node x, ArrayList<Key> keys) {
        if (x == null) {
            return;
        }
        postOrder(x.left, keys);
        postOrder(x.right, keys);
        keys.add(x.key);
    }

    /** Get level-order keys set. */
    public Iterable<Key> levelOrderKeys() {
        ArrayList<Key> keys = new ArrayList<>();
        if (root == null) {
            return keys;
        }

        Queue<Node> queue = new ArrayDeque<>();

        queue.add(root);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            keys.add(current.key);
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }

        return keys;
    }

    /** Test unit. */
    public static void main(String[] args) {
        BinarySearchTree<String, Integer> tree = new BinarySearchTree<>();
            //         H 
            //       /   \
            //      C     T 
            //    /  \   /  \
            //   A    E P    X
        tree.put("H", 1);
        tree.put("C", 2);
        tree.put("T", 3);
        tree.put("A", 4);
        tree.put("E", 5);
        tree.put("P", 6);
        tree.put("X", 7);

        // tree.delete("A");
        // tree.delete("P");

        tree.deleteMin();
        // tree.deleteMin();

        tree.deleteMax();
        // tree.deleteMax();
        
        System.out.print("Pre-order: ");
        for (String key : tree.preOrderKeys()) {
            System.out.print(key + " ");
        }
        System.out.println();

        System.out.print("In-order: ");
        for (String key : tree.inOrderKeys()) {
            System.out.print(key + " ");
        }
        System.out.println();

        System.out.print("Post-order: ");
        for (String key : tree.postOrderKeys()) {
            System.out.print(key + " ");
        }
        System.out.println();

        System.out.print("Level-order: ");
        for (String key : tree.levelOrderKeys()) {
            System.out.print(key + " ");
        }
        System.out.println();

        System.out.print("Level-order ranks: ");
        for (String key : tree.levelOrderKeys()) {
            System.out.print(tree.rank(key) + " ");
        }
        System.out.println();

        
    }
}
