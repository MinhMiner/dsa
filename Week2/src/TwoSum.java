import edu.princeton.cs.algs4.In;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        // In in = new In("1Kints.txt");
        // In in = new In("2Kints.txt");
        // In in = new In("4Kints.txt");
        In in = new In("8Kints.txt");
        Set<Integer> mySet = new HashSet<>();
        while (!in.isEmpty()) {
            int temp = in.readInt();
            if (!mySet.contains(-temp))
                mySet.add(temp);
            else {
                System.out.println(-temp + " " + temp);
                mySet.remove(-temp);
            }
        }
    }
}
