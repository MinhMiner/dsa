import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class iJC3Cau1 {
    public static void main(String[] args) {
        int a = StdIn.readInt();
        int b = StdIn.readInt();
        int c = StdIn.readInt();
        if (a == b && b == c)
            StdOut.print("Equal");
        else
            StdOut.print("Not equal");
    }
}
