import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class iJC2Cau21 {
    public static void main(String[] args) {
        StdOut.print("t = ");
        double t = StdIn.readDouble();
        StdOut.print("sin(2t) + sin(3t) = " + (Math.sin(2*t) + Math.sin(3*t)));
    }
}
