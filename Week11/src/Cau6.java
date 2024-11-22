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
    private static class Dummy implements Comparable<Dummy> {
        public Integer val;
        public Integer idx;

        public Dummy(Integer val, Integer idx) {
            this.val = val;
            this.idx = idx;
        }

        @Override
        public int compareTo(Dummy other) {
            if (!this.val.equals(other.val)) {
                return this.val.compareTo(other.val);
            }
            return this.idx.compareTo(other.idx); // Break ties using index
        }
    }

    public static List<Double> runningMedian(List<Integer> a) {
        TreeSet<Dummy> treeSet = new TreeSet<>();
        List<Double> result = new ArrayList<>();
        int size = a.size();

        Dummy medianLow = null;
        Dummy medianHigh = null;

        for (int i = 0; i < size; i++) {
            int curr = a.get(i);
            Dummy newDummy = new Dummy(curr, i);
            treeSet.add(newDummy);

            if (i == 0) {
                medianLow = medianHigh = newDummy;
            } else if (i % 2 == 0) {
                if (newDummy.compareTo(medianHigh) < 0) {
                    medianHigh = treeSet.lower(medianHigh);
                }
                medianLow = medianHigh;
            } else {
                if (newDummy.compareTo(medianHigh) >= 0) {
                    medianLow = medianHigh;
                    medianHigh = treeSet.higher(medianHigh);
                } else {
                    medianHigh = medianLow;
                    medianLow = treeSet.lower(medianLow);
                }
            }

            if (i % 2 == 0) {
                result.add((double) medianHigh.val);
            } else {
                result.add((medianLow.val + medianHigh.val) / 2.0);
            }
        }

        return result;
    }
}

public class Cau6 {
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
