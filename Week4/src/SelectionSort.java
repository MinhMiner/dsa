import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class SelectionSort {
    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }

    /** Test */
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int n = StdIn.readInt();
        // int n = 1000000;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = StdRandom.uniformInt(0, 1000000);
        }
        selectionSort(a);

        long end = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            StdOut.println(a[i]);
        }
        System.out.println("Sorting time: " + (end - start)/1000.0 + "s");
    }
}