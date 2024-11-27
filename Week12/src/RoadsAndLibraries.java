import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'roadsAndLibraries' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER c_lib
     *  3. INTEGER c_road
     *  4. 2D_INTEGER_ARRAY cities
     */

    public static long roadsAndLibraries(int n, int c_lib, int c_road, List<List<Integer>> cities) {
    // Write your code here
        if (c_lib <= c_road) {
            return (long) n * c_lib;
        }
        List<List<Integer>> adjs = adjList(cities, n);
        CC cc = new CC(adjs);
        long result = 0;
        for (long ccSize : cc.size) {
            result += c_lib + c_road * (ccSize - 1);
        }
        return result;
    }

    private static class CC {
        public boolean[] visited;
        public List<Long> size;
        public CC(List<List<Integer>> graph) {
            visited = new boolean[graph.size()];
            size = new ArrayList<>();

            for (int i = 1; i < graph.size(); i++) {
                long[] count = new long[1];
                if (!visited[i]) {
                    dfs(graph, i, count);
                }

                if (count[0] > 0) {
                    size.add(count[0]);
                }    
            }
        }

        public void dfs(List<List<Integer>> graph, int start, long[] count) {
            visited[start] = true;
            count[0]++;
            for (int v : graph.get(start)) {
                if (!visited[v]) {
                    dfs(graph, v, count);
                }
            }
        }
    }

    private static List<List<Integer>> adjList(List<List<Integer>> edgeList, int n) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            result.add(new ArrayList<Integer>());
        }
        for (List<Integer> edge : edgeList) {
            int v1 = edge.get(0);
            int v2 = edge.get(1);
            result.get(v1).add(v2);
            result.get(v2).add(v1);
        }
        return result;
    }
}

public class RoadsAndLibraries {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int m = Integer.parseInt(firstMultipleInput[1]);

                int c_lib = Integer.parseInt(firstMultipleInput[2]);

                int c_road = Integer.parseInt(firstMultipleInput[3]);

                List<List<Integer>> cities = new ArrayList<>();

                IntStream.range(0, m).forEach(i -> {
                    try {
                        cities.add(
                            Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                        );
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });

                long result = Result.roadsAndLibraries(n, c_lib, c_road, cities);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
