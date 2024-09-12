import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class iJC2Cau28 {
    public static void main(String[] args) {
        double a = StdIn.readDouble();
        double b = StdIn.readDouble();
        double c = StdIn.readDouble();
        StdOut.print((a > b && b > c) || (a < b && b < c));
    }
}
