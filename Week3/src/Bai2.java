import edu.princeton.cs.algs4.StdRandom;
import java.util.Arrays;

public class Bai2 {
    /** Search for the given number in the array using Binary Search. */
    public static int binarySearch(int[] a, int number) {
        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a[mid] == number) {
                return mid;
            } else if (a[mid] > number) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    /** Print all elements in an array. */
    private static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    /** Test Binary Search. */
    public static void main(String[] args) {
        int n = 15;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = StdRandom.uniformInt(0, n);
        }
        Arrays.sort(a);
        printArray(a);
        int number = StdRandom.uniformInt(0, n);
        System.out.println("Search for number " + number + ":");
        int search = binarySearch(a, number);
        if (search == -1) {
            System.out.println("Can't find " + number + " in the array.");
        } else {
            System.out.println("Found " + number + " at index " + search);
        }
    }
}
