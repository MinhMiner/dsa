import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class iJC2Cau19 {
    public static void main(String[] args) {
        long a = StdIn.readLong();
        long b = StdIn.readLong();
        double rand = Math.random() * Math.abs(a - b);
        long result = Math.round(rand) + Math.min(a, b);
        StdOut.print("Random number between " + a + " and " + b + ": " + result);
    }
}
