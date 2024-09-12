import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class iJC2Cau31 {
    public static void main(String[] args) {
        double λ0 = StdIn.readDouble();
        double φ = StdIn.readDouble();
        double λ = StdIn.readDouble();
        double x = λ - λ0;
        double y = 1/2 * Math.log((1 + Math.sin(φ))/(1 - Math.sin(φ)))/Math.log(Math.E);
        StdOut.print("(" + x + ", " + y + ")");
    }
}
