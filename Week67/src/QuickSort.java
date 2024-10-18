import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdRandom;

public class QuickSort {
    public static void sort(int[] arr) {
        StdRandom.shuffle(arr);
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int low, int high) {
        if (high - low < 10) {
            Insertion.sort(arr, low, high);
            return;
        }
        int mid = partition(arr, low, high);
        sort(arr, low, mid - 1);
        sort(arr, mid + 1, high);
    }

    private static int partition(int[] arr, int low, int high) {
        int i = low;
        int j = high + 1;
        while (true) {
            while (less(arr[++i], arr[low])) {
                if (i >= high) {
                    break;
                }
            }

            while (less(arr[low], arr[--j])) {
                if (j <= low) {
                    break;
                }
            }

            if (i >= j) {
                break;
            }

            exch(arr, i, j);
        }

        exch(arr, low, j);
        return j;
    }

    private static boolean less(int a, int b) {
        return (a < b);
    }

    private static void exch(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArr(Object[] arr) {
        for (Object it : arr) {
            System.out.print(it + " ");
        }
        System.out.println();
    }

    public static int[] reverse(int[] original) {
        int n = original.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[n - 1 - i] = original[i];
        }
        return result;
    }

    public static void main(String[] args) {
        {
            // (1) file dữ liệu test
            System.out.println("(1) Cac file du lieu test: ");
            {
                System.out.println("4KInts.txt");
                double avg = 0;
                for (int i = 0; i < 5; i++) {
                    In in = new In("4KInts.txt");
                    int[] arr = in.readAllInts();
                    
                    long start = System.currentTimeMillis();
                    QuickSort.sort(arr);
                    long end = System.currentTimeMillis();

                    // show(arr);

                    double time = (end - start);
                    // System.out.println("Sorting time: " + time + "ms");
                    avg += time / 5.0;
                }
                System.out.println("Average sorting time: " + avg + "ms");
            }
            System.out.println();
            {
                System.out.println("32KInts.txt");
                double avg = 0;
                for (int i = 0; i < 5; i++) {
                    In in = new In("32KInts.txt");
                    int[] arr = in.readAllInts();
                    
                    long start = System.currentTimeMillis();
                    QuickSort.sort(arr);
                    long end = System.currentTimeMillis();

                    // show(arr);

                    double time = (end - start);
                    // System.out.println("Sorting time: " + time + "ms");
                    avg += time / 5.0;
                }
                System.out.println("Average sorting time: " + avg + "ms");
            }
        }

        System.out.println("----------------------");

        {
            // (2) dữ liệu sinh ngẫu nhiên
            System.out.println("(2) Du lieu sinh ngau nhien: ");
            {
                System.out.println("N = 4000");
                double avg = 0;
                for (int i = 0; i < 5; i++) {
                    int[] arr = new int[4000];
                    for (int j = 0; j < arr.length; j++) {
                        arr[j] = StdRandom.uniformInt(100000);
                    }
                    
                    long start = System.currentTimeMillis();
                    QuickSort.sort(arr);
                    long end = System.currentTimeMillis();

                    // show(arr);
                    double time = (end - start);
                    // System.out.println("Sorting time: " + time + "ms");
                    avg += time / 5.0;
                }
                System.out.println("Average sorting time: " + avg + "ms");
            }
            System.out.println();
            {
                System.out.println("N = 35000");
                double avg = 0;
                for (int i = 0; i < 5; i++) {
                    int[] arr = new int[35000];
                    for (int j = 0; j < arr.length; j++) {
                        arr[j] = StdRandom.uniformInt(100000);
                    }
                    
                    long start = System.currentTimeMillis();
                    QuickSort.sort(arr);
                    long end = System.currentTimeMillis();

                    // show(arr);
                    double time = (end - start);
                    // System.out.println("Sorting time: " + time + "ms");
                    avg += time / 5.0;
                }
                System.out.println("Average sorting time: " + avg + "ms");
            }
        }

        System.out.println("----------------------");

        {
            // (3) Du lieu da duoc sap xep xuoi
            System.out.println("(3) Du lieu da duoc sap xep xuoi: ");
            {
                System.out.println("N = 4000");
                double avg = 0;
                for (int i = 0; i < 5; i++) {    
                    In in = new In("4KInts.txt");
                    int[] arr = in.readAllInts();
                    
                    QuickSort.sort(arr);
                    long start = System.nanoTime();
                    QuickSort.sort(arr);
                    long end = System.nanoTime();

                    // show(arr);
                    double time = (end - start);
                    // System.out.println("Sorting time: " + time + "ns");
                    avg += time / 5.0;
                }
                System.out.println("Average sorting time: " + avg + "ns");
            }
            System.out.println();
            {
                System.out.println("N = 35000");
                double avg = 0;
                for (int i = 0; i < 5; i++) {
                    In in = new In("32KInts.txt");
                    int[] arr = in.readAllInts();
                    
                    QuickSort.sort(arr);
                    long start = System.nanoTime();
                    QuickSort.sort(arr);
                    long end = System.nanoTime();

                    // show(arr);
                    double time = (end - start);
                    // System.out.println("Sorting time: " + time + "ns");
                    avg += time / 5.0;
                }
                System.out.println("Average sorting time: " + avg + "ns");
            }
        }
        
        System.out.println("----------------------");

        {
            // (4) Du lieu sap xep nguoc
            System.out.println("(4) Du lieu sap xep nguoc: ");
            {
                System.out.println("N = 4000");
                double avg = 0;
                for (int i = 0; i < 5; i++) {    
                    In in = new In("4KInts.txt");
                    int[] arr = in.readAllInts();
                    
                    QuickSort.sort(arr);
                    int[] rev = reverse(arr);
                    long start = System.currentTimeMillis();
                    QuickSort.sort(rev);
                    long end = System.currentTimeMillis();

                    // show(rev);
                    double time = (end - start);
                    // System.out.println("Sorting time: " + time + "ms");
                    avg += time / 5.0;
                }
                System.out.println("Average sorting time: " + avg + "ms");
            }
            System.out.println();
            {
                System.out.println("N = 35000");
                double avg = 0;
                for (int i = 0; i < 5; i++) {
                    In in = new In("32KInts.txt");
                    int[] arr = in.readAllInts();
                    
                    QuickSort.sort(arr);
                    int[] rev = reverse(arr);
                    long start = System.currentTimeMillis();
                    QuickSort.sort(rev);
                    long end = System.currentTimeMillis();

                    // show(rev);
                    double time = (end - start);
                    // System.out.println("Sorting time: " + time + "ms");
                    avg += time / 5.0;
                }
                System.out.println("Average sorting time: " + avg + "ms");
            }
        }

        System.out.println("----------------------");

        {
            // (5) Du lieu toan cac gia tri bang nhau
            System.out.println("(5) Du lieu toan cac gia tri bang nhau: ");
            {
                System.out.println("N = 4000");
                double avg = 0;
                for (int i = 0; i < 5; i++) {
                    int[] arr = new int[4000];
                    for (int j = 0; j < arr.length; j++) {
                        arr[j] = StdRandom.uniformInt(5);
                    }
                    
                    long start = System.currentTimeMillis();
                    QuickSort.sort(arr);
                    long end = System.currentTimeMillis();

                    // show(arr);
                    double time = (end - start);
                    // System.out.println("Sorting time: " + time + "ms");
                    avg += time / 5.0;
                }
                System.out.println("Average sorting time: " + avg + "ms");
            }
            System.out.println();
            {
                System.out.println("N = 35000");
                double avg = 0;
                for (int i = 0; i < 5; i++) {
                    int[] arr = new int[35000];
                    for (int j = 0; j < arr.length; j++) {
                        arr[j] = StdRandom.uniformInt(5);
                    }
                    
                    long start = System.currentTimeMillis();
                    QuickSort.sort(arr);
                    long end = System.currentTimeMillis();

                    // show(arr);
                    double time = (end - start);
                    // System.out.println("Sorting time: " + time + "ms");
                    avg += time / 5.0;
                }
                System.out.println("Average sorting time: " + avg + "ms");
            }
        }
    }
}