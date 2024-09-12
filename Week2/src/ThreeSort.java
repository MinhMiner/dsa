import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class ThreeSort {
    public static void main(String[] args) {
        double a = StdIn.readDouble();
        double b = StdIn.readDouble();
        double c = StdIn.readDouble();

        double min = Math.min(Math.min(a, b), c);
        double max = Math.max(Math.max(a, b), c);

        StdOut.print(min + ", " + (a + b + c - min - max) + ", " + max);
    }
}
