import edu.princeton.cs.algs4.StdIn;

public class iJC3Cau18 {
    public static void main(String[] args) {
        double x = StdIn.readDouble();
        int N = StdIn.readInt();

        System.out.println("x^N/N! = " + Math.pow(x, N)/factorial(N));
    }

    private static long factorial(int n) {
        if (n <= 1)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
