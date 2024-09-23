import edu.princeton.cs.algs4.In;
import java.util.Arrays;

public class Bai3 {
    public static void main(String[] args) {
        In in = new In("1Kints.txt");
        // In in = new In("2Kints.txt");
        // In in = new In("4Kints.txt");
        // In in = new In("8Kints.txt");

        int a[] = in.readAllInts();
        Arrays.sort(a);
        for (int i = 0; i < a.length - 2; i++) {
            int left = i + 1;
            int right = a.length - 1;
            while (left < right) {
                if (a[left] + a[right] + a[i] == 0) {
                    System.out.println(a[i] + " " + a[left] + " " + a[right]);
                    break;
                } else if (a[left] + a[right] + a[i] > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
    }
}
