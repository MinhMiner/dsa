import edu.princeton.cs.algs4.*;

public class UFClient2 {
    public static void main(String[] args) {
        int n = StdIn.readInt();
        UF uf = new UF(n);
        int count = 0, i = 1;
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (!uf.connected(p, q)) {
                uf.union(p, q);
                count++;
            }
            if (count < n - 1)
                i++;
        }
        
        if (count == n - 1)
            StdOut.print(i);
        else
            StdOut.print("FAILED");
    }
}
