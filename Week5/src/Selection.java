import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdRandom;

public class Selection {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    min = j;
                }
            }
            exch(arr, i, min);
        }
    }

    private static void exch(int[] arr, int i, int j){
        int swap = arr[i];
        arr[i] = arr[j];
        arr[j] = swap;
    }

    public static void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
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
                    Selection.sort(arr);
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
                    Selection.sort(arr);
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
                    Selection.sort(arr);
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
                    Selection.sort(arr);
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
                    
                    Selection.sort(arr);
                    long start = System.nanoTime();
                    Insertion.sort(arr);
                    long end = System.nanoTime();

                    // show(arr);
                    double time = (end - start) / 1000;
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
                    
                    Selection.sort(arr);
                    long start = System.nanoTime();
                    Insertion.sort(arr);
                    long end = System.nanoTime();

                    // show(arr);
                    double time = (end - start) / 1000;
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
                    
                    Selection.sort(arr);
                    int[] rev = reverse(arr);
                    long start = System.currentTimeMillis();
                    Selection.sort(rev);
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
                    
                    Selection.sort(arr);
                    int[] rev = reverse(arr);
                    long start = System.currentTimeMillis();
                    Selection.sort(rev);
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
                    Selection.sort(arr);
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
                    Selection.sort(arr);
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