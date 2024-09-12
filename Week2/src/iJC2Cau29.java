import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class iJC2Cau29 {
    public static void main(String[] args) {
        int d = StdIn.readInt();
        int m = StdIn.readInt();
        int y = StdIn.readInt();
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31*m0)/ 12) % 7;
        switch (d0) {
            case 1:
                StdOut.print("Monday");
                break;
            case 2:
                StdOut.print("Tuesday");
                break;
            case 3:
                StdOut.print("Wednesday");
                break;
            case 4:
                StdOut.print("Thursday");
                break;
            case 5:
                StdOut.print("Friday");
                break;
            case 6:
                StdOut.print("Saturday");
                break;
            case 0:
                StdOut.print("Sunday");
                break;
        }
    }
}
