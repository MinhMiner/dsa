import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class iJC2Cau24 {
    public static void main(String[] args) {
        StdOut.print("Khoan no ban dau P = "); double P = StdIn.readDouble();
        StdOut.print("Lai suat nam r (phan tram) = "); double r = StdIn.readDouble();
        StdOut.print("Thoi han khoan no (so nam) = "); long t = StdIn.readLong();
        StdOut.print("So tien tra hang thang: ");
        double rMonth = r/12/100;
        long N = t * 12;
        double result = rMonth * P / (1 - Math.pow(1 + rMonth, -N));
        StdOut.print(result);
    }
}
