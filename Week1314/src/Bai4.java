import java.io.*;
import java.util.*;
import java.util.stream.*;

class ResultBai4 {
    static class Edge implements Comparable<Edge> {
        public int from, to, weight;
        public Edge(int from, int to, int weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;
        }
        @Override
        public int compareTo(Edge other) {
            if (weight < other.weight) return -1;
            if (weight > other.weight) return 1;
            if (from + to < other.from + other.to) return -1;
            if (from + to > other.from + other.to) return 1;
            return 0;
        }
    }

    static class UnionFind {
        private int[] parent, rank;

        public UnionFind(int size) {
            parent = new int[size];
            rank = new int[size];
            for (int i = 0; i < size; i++) {
                parent[i] = i;
                rank[i] = 0;
            }
        }

        public int find(int p) {
            if (parent[p] != p) {
                parent[p] = find(parent[p]);
            }
            return parent[p];
        }

        public boolean union(int p, int q) {
            int rootP = find(p);
            int rootQ = find(q);
            if (rootP == rootQ) return false;

            if (rank[rootP] > rank[rootQ]) {
                parent[rootQ] = rootP;
            } else if (rank[rootP] < rank[rootQ]) {
                parent[rootP] = rootQ;
            } else {
                parent[rootQ] = rootP;
                rank[rootP]++;
            }
            return true;
        }
    }

    public static int kruskals(int gNodes, List<Integer> gFrom, List<Integer> gTo, List<Integer> gWeight) {
        PriorityQueue<Edge> edges = new PriorityQueue<>();
        for (int i = 0; i < gFrom.size(); i++) {
            edges.add(new Edge(gFrom.get(i), gTo.get(i), gWeight.get(i)));
        }

        UnionFind uf = new UnionFind(gNodes + 1);
        int totalWeight = 0;
        int edgeCount = 0;

        while (!edges.isEmpty() && edgeCount < gNodes - 1) {
            Edge curr = edges.poll();
            if (curr == null) break;
            if (uf.union(curr.from, curr.to)) {
                totalWeight += curr.weight;
                edgeCount++;
            }
        }

        return totalWeight;
    }
}

public class Bai4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] gNodesEdges = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int gNodes = Integer.parseInt(gNodesEdges[0]);
        int gEdges = Integer.parseInt(gNodesEdges[1]);

        List<Integer> gFrom = new ArrayList<>();
        List<Integer> gTo = new ArrayList<>();
        List<Integer> gWeight = new ArrayList<>();

        IntStream.range(0, gEdges).forEach(i -> {
            try {
                String[] gFromToWeight = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                gFrom.add(Integer.parseInt(gFromToWeight[0]));
                gTo.add(Integer.parseInt(gFromToWeight[1]));
                gWeight.add(Integer.parseInt(gFromToWeight[2]));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int res = ResultBai4.kruskals(gNodes, gFrom, gTo, gWeight);

        // Write your code here.

        bufferedWriter.write(String.valueOf(res));

        bufferedReader.close();
        bufferedWriter.close();
    }
}
