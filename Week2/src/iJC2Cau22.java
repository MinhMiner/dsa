import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class iJC2Cau22 {
    public static void main(String[] args) {
        double x0 = StdIn.readDouble();
        double v0 = StdIn.readDouble();
        double t = StdIn.readDouble();
        double g = 9.800722;
        StdOut.print(x0 + v0*t + g*t*t/2);
    }
}
