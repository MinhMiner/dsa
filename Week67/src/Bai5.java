import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'quickSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> quickSort(List<Integer> arr) {
    // Write your code here
        int left = 1, right = arr.size() - 1;
        while (left <= right) {
            while (left < arr.size() && arr.get(left) < arr.get(0)) {
                left++;
            }

            while (right > 0 && arr.get(right) > arr.get(0)) {
                right--;
            }

            if (left >= right) {
                break;
            }

            int temp = arr.get(left);
            arr.set(left, arr.get(right));
            arr.set(right, temp);
        }

        int temp = arr.get(right);
        arr.set(right, arr.get(0));
        arr.set(0, temp);

        return arr;
    }

}

public class Bai5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.quickSort(arr);

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
