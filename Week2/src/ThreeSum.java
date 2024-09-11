import java.util.Arrays;

import edu.princeton.cs.algs4.In;

public class ThreeSum {
    public static void main(String[] args) {
        // In in = new In("1Kints.txt");
        // In in = new In("2Kints.txt");
        // In in = new In("4Kints.txt");
        In in = new In("8Kints.txt");

        int a[] = in.readAllInts();
        Arrays.sort(a);
        for (int i = 0; i < a.length - 2; i++) {
            for (int j = i + 1; j < a.length - 1; j++) {
                int k = Arrays.binarySearch(a, j + 1, a.length, -(a[i] + a[j]));
                if (k >= 0)
                    System.out.println(a[i] + " " + a[j] + " " + a[k]);
            }
        }
    }
}
