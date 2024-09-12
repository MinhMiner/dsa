import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class GreatCircle {
    public static void main(String[] args) {
        StdOut.print("(x1, y1) = ");
        double x1 = StdIn.readDouble();
        double y1 = StdIn.readDouble();
        StdOut.print("(x2, y2) = ");
        double x2 = StdIn.readDouble();
        double y2 = StdIn.readDouble();

        double d = 60*Math.acos(Math.sin(x1)* Math.sin(x2) + Math.cos(x1)* Math.cos(x2)* Math.cos(y1 - y2));

        StdOut.println("distance = " + d);
    }
}
