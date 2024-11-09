import edu.princeton.cs.algs4.BST;

public class Bai1 {
    public static void main(String[] args) throws Exception {
        BST<String, Integer> tree = new BST<>();

        String input = "S E A R C H E X A M P L E";
        String[] tokens = input.split(" ");

        for (int i = 0; i < tokens.length; i++) {
            tree.put(tokens[i], i);
        }

        for (String key : tree.keys()) {
            System.out.println(key + ": " + tree.get(key));
        }
        
    }
}
