import edu.princeton.cs.algs4.ST;
import edu.princeton.cs.algs4.SequentialSearchST;

public class Bai1 {
    public static void main(String[] args) {
        String input = "S E A R C H E X A M P L E";
        String inputs[] = input.split(" ");

        // ----------------------------------------
        // SequentialSearchST (Unordered)
        // ----------------------------------------
        SequentialSearchST<Character, Integer> unorderedST = new SequentialSearchST<>();
        for (int i = 0; i < inputs.length; i++) {
            unorderedST.put(inputs[i].charAt(0), i);
        }
        System.out.println("----------------------------------------");
        System.out.println("SequentialSearchST (Unordered)");
        System.out.println("----------------------------------------");
        for (Character ch : unorderedST.keys()) {
            System.out.println(ch + ": " + unorderedST.get(ch));
        }

        // ----------------------------------------
        // ST (Ordered)
        // ----------------------------------------
        ST<Character, Integer> orderedST = new ST<>();
        for (int i = 0; i < inputs.length; i++) {
            orderedST.put(inputs[i].charAt(0), i);
        }
        System.out.println("----------------------------------------");
        System.out.println("ST (Ordered)");
        System.out.println("----------------------------------------");
        for (Character ch : orderedST.keys()) {
            System.out.println(ch + ": " + orderedST.get(ch));
        }       
    }
}
