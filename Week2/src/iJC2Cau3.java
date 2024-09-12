import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class iJC2Cau3 {
    public static void main(String[] args) {
        StdOut.print("a = ");
        boolean a = StdIn.readBoolean();
        StdOut.print("b = ");
        boolean b = StdIn.readBoolean();
        StdOut.print("(!(a && b) && (a || b)) || ((a && b) || !(a || b)) = ");
        if ((!(a && b) && (a || b)) || ((a && b) || !(a || b)) == true)
            StdOut.print("true");
        else
            StdOut.print("false");
    }
}
