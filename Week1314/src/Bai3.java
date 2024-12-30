import java.io.*;
import java.util.*;

class ResultBai3 {
    private static boolean[] marked;
    private static int[] distTo;
    private static PriorityQueue<Cost> shortestDist;
    static class Cost implements Comparable<Cost> {
        public int r, v;
        public Cost(int cost, int vertex) {
            r = cost;
            v = vertex;
        }
        @Override
        public int compareTo(Cost c) {
            if (r < c.r) return -1;
            if (r> c.r) return 1;
            if (v < c.v) return -1;
            if (v > c.v) return 1;
            return 0;
        }
    }

    public static List<Integer> shortestReach(int n, List<List<Integer>> edges, int s) {
        Map<Integer, Map<Integer, Integer>> adj = new HashMap<>();
        for (List<Integer> it : edges) {
            int v = it.get(0);
            int w = it.get(1);
            int weight = it.get(2);

            if (!adj.containsKey(v)) {
                adj.put(v, new HashMap<>());
            }
            if (!adj.get(v).containsKey(w) || adj.get(v).get(w) > weight) {
                adj.get(v).put(w, weight);
            }
            
            if (!adj.containsKey(w)) {
                adj.put(w, new HashMap<>());
            }
            if (!adj.get(w).containsKey(v) || adj.get(w).get(v) > weight) {
                adj.get(w).put(v, weight);
            }
        }

        distTo = new int[n + 1];
        marked = new boolean[n + 1];
        shortestDist = new PriorityQueue<>();
        Arrays.fill(distTo, Integer.MAX_VALUE);

        findNewPaths(adj, s, 0);
        marked[s] = true;

        int count = 0;

        while (count < n - 1 && !shortestDist.isEmpty()) {
            Cost curr = shortestDist.poll();
            if (curr == null) break;
            if (marked[curr.v]) continue;
            
            distTo[curr.v] = curr.r;
            marked[curr.v] = true;
            ++count;
            findNewPaths(adj, curr.v, curr.r);
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (s == i) {
                continue;
            }
            if (distTo[i] == Integer.MAX_VALUE) {
                result.add(-1);
            } else {
                result.add(distTo[i]);
            }
        }

        return result;
    }

    private static void findNewPaths(Map<Integer, Map<Integer, Integer>> adj, int start, int startDist) {
        for (Map.Entry<Integer, Integer> edge : adj.get(start).entrySet()) {
            if (!marked[edge.getKey()] && edge.getValue() + startDist < distTo[edge.getKey()]) {
                distTo[edge.getKey()] = edge.getValue() + startDist;
                shortestDist.add(new Cost(edge.getValue() + startDist, edge.getKey()));
            }
        }
    }
}

public class Bai3 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            List<List<Integer>> edges = new ArrayList<>();
            while (m-- > 0) {
                List<Integer> temp = new ArrayList<>();
                temp.add(sc.nextInt());
                temp.add(sc.nextInt());
                temp.add(sc.nextInt());
                edges.add(temp);
            }
            int start = sc.nextInt();

            List<Integer> result = ResultBai3.shortestReach(n, edges, start);

            System.out.println(result);
        }
        sc.close();
    }
}
