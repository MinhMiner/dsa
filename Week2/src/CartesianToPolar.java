import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class CartesianToPolar {
    public static void main(String[] args) {
        double x = StdIn.readDouble();
        double y = StdIn.readDouble();
        double r = Math.sqrt(x*x + y*y);
        double theta = Math.atan2(y, x);
        StdOut.print("(" + r + ", " + theta + ")");
    }
}
