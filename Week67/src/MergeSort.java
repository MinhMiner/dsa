import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdRandom;

public class MergeSort {
    public static void sort(int[] arr) {
        int[] aux = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            aux[i] = arr[i];
        }
        sort(aux, arr, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int[] aux, int low, int high) {
        if (high - low < 10) {
            Insertion.sort(aux, low, high);
            return;
        }
        int mid = low + (high - low) / 2;
        sort(aux, arr, low, mid);
        sort(aux, arr, mid + 1, high);
        merge(arr, aux, low, mid, high);
    }

    private static void merge(int[] arr, int[] aux, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        for (int k = low; k <= high; k++) {
            if (i > mid) {
                aux[k] = arr[j++];
            } else if (j > high) {
                aux[k] = arr[i++];
            } else if (less(arr[j], arr[i])) {
                aux[k] = arr[j++];
            } else {
                aux[k] = arr[i++];
            }
        }
    }

    private static boolean less(int a, int b) {
        return (a < b);
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
                    MergeSort.sort(arr);
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
                    MergeSort.sort(arr);
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
                    MergeSort.sort(arr);
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
                    MergeSort.sort(arr);
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
                    
                    MergeSort.sort(arr);
                    long start = System.nanoTime();
                    MergeSort.sort(arr);
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
                    
                    MergeSort.sort(arr);
                    long start = System.nanoTime();
                    MergeSort.sort(arr);
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
                    
                    MergeSort.sort(arr);
                    int[] rev = reverse(arr);
                    long start = System.currentTimeMillis();
                    MergeSort.sort(rev);
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
                    
                    MergeSort.sort(arr);
                    int[] rev = reverse(arr);
                    long start = System.currentTimeMillis();
                    MergeSort.sort(rev);
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
                    MergeSort.sort(arr);
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
                    MergeSort.sort(arr);
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