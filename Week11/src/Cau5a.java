import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'missingNumbers' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arr
     *  2. INTEGER_ARRAY brr
     */

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
    // Write your code here
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (Integer i : brr) {
            if (hashMap.containsKey(i)) {
                hashMap.put(i, hashMap.get(i) + 1);
            } else {
                hashMap.put(i, 1);
            }
        }
        for (Integer i : arr) {
            if (hashMap.get(i) > 1) {
                hashMap.put(i, hashMap.get(i) - 1);
            } else {
                hashMap.remove(i);
            }
        }
        
        List<Integer> result = new ArrayList<>();
        for (Integer key : hashMap.keySet()) {
            if (hashMap.get(key) > 0) {
                add(result, key);
            }
        }

        return result;
    }

    private static void add(List<Integer> arr, Integer i) {
        int curr = arr.size() - 1;
        arr.add(i);
        while (curr >= 0 && arr.get(curr) > i) {
            arr.set(curr + 1, arr.get(curr));
            --curr;
        }
        arr.set(curr + 1, i);
    }
}

public class Cau5a {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        // int m = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.missingNumbers(arr, brr);

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
