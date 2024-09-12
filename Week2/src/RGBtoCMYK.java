import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class RGBtoCMYK {
    public static void main(String[] args) {
        int red = StdIn.readInt();
        int green = StdIn.readInt();
        int blue = StdIn.readInt();

        double white = Math.max(Math.max(red/255.0, green/255.0), blue/255.0);
        double cyan = (white - red/255.0) / white;
        double magenta = (white - green/255.0) / white;
        double yellow = (white - blue/255.0) / white;
        double black = 1 - white;

        StdOut.println("C: " + cyan);
        StdOut.println("M: " + magenta);
        StdOut.println("Y: " + yellow);
        StdOut.println("K: " + black);
    }
}
