import edu.princeton.cs.algs4.In;

import java.util.Map;
import java.util.TreeMap;

public class Bai6 {
    public static void main(String[] args) {
        In in = new In("inputStrings.txt");
        Map<String, Integer> map = new TreeMap<>();
        while (in.hasNextChar()) {
            String word = in.readString();
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
