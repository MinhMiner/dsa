import java.io.*;
import java.util.*;

class ResultBai2 {
    private static boolean[] marked;
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
    
    public static int prims(int n, List<List<Integer>> edges, int start) {
        marked = new boolean[edges.size() + 1];
        PriorityQueue<Cost> nextToMST = new PriorityQueue<>();

        findNewVertex(edges, start, nextToMST);
        marked[start] = true;

        int MSTedgeCount = 0;
        int result = 0;

        while (MSTedgeCount < n - 1) {
            Cost curr;
            do {
                curr = nextToMST.poll();
            } while (marked[curr.v]);

            findNewVertex(edges, curr.v, nextToMST);
            result += curr.r;
            MSTedgeCount++;
            marked[curr.v] = true;
        }

        return result;
    }

    private static void findNewVertex(List<List<Integer>> edges, int start, PriorityQueue<Cost> nextToMST) {
        for (List<Integer> it : edges) {
            if (it.get(0) == start && !marked[it.get(1)]) {
                nextToMST.add(new Cost(it.get(2), it.get(1)));
            } else if (it.get(1) == start && !marked[it.get(0)]) {
                nextToMST.add(new Cost(it.get(2), it.get(0)));
            }
        }
    }
}

public class Bai2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

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

        int result = ResultBai2.prims(n, edges, start);

        System.out.println(result);
        sc.close();
    }
}
