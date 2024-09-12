import edu.princeton.cs.algs4.StdIn;

public class iJC3Cau9 {
    public static void main(String[] args) {
        int n = StdIn.readInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            double temp = Math.random();
            System.out.println("So thu " + i + ": " + temp);
            sum += temp;
        }
        System.out.println("Gia tri trung binh: " + (sum/n));
    }
}
