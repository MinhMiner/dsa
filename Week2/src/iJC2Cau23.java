import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class iJC2Cau23 {
    public static void main(String[] args) {
        StdOut.print("Month: ");
        int m = StdIn.readInt();
        StdOut.print("Day: ");
        int d = StdIn.readInt();
        switch (m) {
            case 3:
                if (d >= 20 && d <= 31)
                    StdOut.print("true");
                else
                    StdOut.print("false");
                break;
            case 4:
                if (d >= 1 && d <= 30)
                    StdOut.print("true");
                else
                    StdOut.print("false");
                break;
            case 5:
                if (d >= 1 && d <= 31)
                    StdOut.print("true");
                else
                    StdOut.print("false");
                break;
            case 6:
                if (d >= 1 && d <= 20)
                    StdOut.print("true");
                else
                    StdOut.print("false");
                break;
            default:
                StdOut.print("false");
                break;
        }
    }
}
