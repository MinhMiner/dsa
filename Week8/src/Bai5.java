import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'runningMedian' function below.
     *
     * The function is expected to return a DOUBLE_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static List<Double> runningMedian(List<Integer> a) {
    // Write your code here
        if (a.isEmpty()) {
            return null;
        }

        List<Double> result = new ArrayList<>();
        result.add(a.get(0) * 1.0);

        if (a.size() == 1) {
            return result;
        }
        result.add(a.get(0) / 2.0 + a.get(1) / 2.0);

        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        maxPQ.add(Math.min(a.get(0), a.get(1)));
        minPQ.add(Math.max(a.get(0), a.get(1)));

        for (int i = 2; i < a.size(); i++) {
            int temp = a.get(i);

            if (temp > minPQ.peek()) {
                minPQ.add(temp);
            } else {
                maxPQ.add(temp);
            }

            transfer(maxPQ, minPQ);

            if (minPQ.size() > maxPQ.size()) {
                result.add(minPQ.peek() * 1.0);
            } else if (minPQ.size() < maxPQ.size()) {
                result.add(maxPQ.peek() * 1.0);
            } else {
                result.add(minPQ.peek() / 2.0 + maxPQ.peek() / 2.0);
            }
            
        }
        return result;
    }

    private static void transfer(PriorityQueue<Integer> pq1, PriorityQueue<Integer> pq2) {
        while (Math.abs(pq1.size() - pq2.size()) > 1) {
            if (pq1.size() > pq2.size()) {
                pq2.add(pq1.poll());
            } else {
                pq1.add(pq2.poll());
            }
        }
        return;
    }

}

public class Bai5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int aCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = IntStream.range(0, aCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Double> result = Result.runningMedian(a);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
