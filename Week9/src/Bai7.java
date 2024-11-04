import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'closestNumbers' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> closestNumbers(List<Integer> arr) {
    // Write your code here
        List<Integer> aux = new ArrayList<>(arr);
        sort(arr, aux, 0, arr.size() - 1);

        for (Integer i : aux) {
            System.out.print(i + " ");
        }

        int minDiff = Integer.MAX_VALUE;
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < aux.size(); i++) {
            if (aux.get(i) - aux.get(i - 1) < minDiff) {
                result.clear();
                minDiff = aux.get(i) - aux.get(i - 1);
            }
            
            if (aux.get(i) - aux.get(i - 1) == minDiff) {
                result.add(aux.get(i - 1));
                result.add(aux.get(i));
            }
        }
        return result;
    }

    private static void sort(List<Integer> arr, List<Integer> aux, int low, int high) {
        if (high - low < 10) {
            insertionSort(aux, low, high);
            return;
        }
        int mid = low + (high - low) / 2;
        sort(aux, arr, low, mid);
        sort(aux, arr, mid + 1, high);
        merge(arr, aux, low, mid, high);
    }

    private static void merge(List<Integer> arr, List<Integer> aux, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        for (int k = low; k <= high; k++) {
            if (i > mid) aux.set(k, arr.get(j++));
            else if (j > high) aux.set(k, arr.get(i++));
            else if (arr.get(j) < arr.get(i)) aux.set(k, arr.get(j++));
            else aux.set(k, arr.get(i++));
        }
    }

    private static void insertionSort(List<Integer> arr, int low, int high) {
        for (int i = low + 1; i <= high; i++) {
            int temp = arr.get(i);
            int j = i;
            while (j > low && arr.get(j - 1) > temp) {
                arr.set(j, arr.get(j - 1));
                j--;
            }
            arr.set(j, temp);
        }
    }
}

public class Bai7 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.closestNumbers(arr);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
