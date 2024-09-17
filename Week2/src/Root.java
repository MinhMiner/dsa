import edu.princeton.cs.algs4.StdIn;

public class Root {
    public static void main(String[] args) {
        double c = StdIn.readDouble();
        int k = StdIn.readInt();
        System.out.printf("%.4f", (Math.pow(c, 1.0/k)));
    }
}
