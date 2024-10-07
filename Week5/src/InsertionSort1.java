import java.util.List;

public class InsertionSort1 {
    public static void insertionSort1(int n, List<Integer> arr) {
        int temp = arr.get(n - 1);
    
        int i = n - 2;
        while (i >= 0 && arr.get(i) > temp) {
            arr.set(i + 1, arr.get(i));
            print(arr);
            i--;
        }

        arr.set(i + 1, temp);
        print(arr);
    }

    public static void print(List<Integer> arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
