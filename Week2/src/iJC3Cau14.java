import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class iJC3Cau14 {
    public static void main(String[] args) {
        StdOut.print("Khoan no ban dau P = "); double P = StdIn.readDouble();
        StdOut.print("Lai suat nam r (phan tram) = "); double r = StdIn.readDouble();
        StdOut.print("Thoi han khoan no (so nam) = "); long t = StdIn.readLong();
        StdOut.print("So tien tra hang thang: ");
        double rMonth = r/12/100;
        long N = t * 12;
        double payEachMonth = rMonth * P / (1 - Math.pow(1 + rMonth, -N));
        StdOut.printf("So tien tra hang thang: %.2f%n", payEachMonth);

        double daTra = 0;
        double conNo = P;

        for (int month = 1; month <= N; month++) {
            // Interest for the current month
            double interest = conNo * rMonth;

            // Principal paid this month
            double principalPaid = payEachMonth - interest;

            // Update remaining balance
            conNo -= principalPaid;

            // Update total amount paid
            daTra += payEachMonth;

            // Print monthly summary
            StdOut.printf("Thang %d: Thanh toan %.2f, Con no %.2f%n", month, daTra, conNo);

            // If remaining balance is near zero (due to rounding), set it to 0
            if (conNo < 0.01) {
                conNo = 0;
                break;
            }
        }

        // Print final results
        StdOut.printf("Tong so tien da thanh toan: %.2f%n", daTra);
    }
}
