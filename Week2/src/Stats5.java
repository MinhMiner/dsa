import edu.princeton.cs.algs4.StdOut;

public class Stats5 {
    public static void main(String[] args) {
        double[] a = new double[5];
        double min = Double.MAX_VALUE, max = Double.MIN_VALUE, sum = 0;
        for (int i = 0; i < 5; i++) {
            a[i] = Math.random();
            if (a[i] < min)
                min = a[i];
            if (a[i] > max)
                max = a[i];
            sum += a[i];
        }
        StdOut.println("Min: " + min);
        StdOut.println("Max: " + max);
        StdOut.println("Avg: " + sum/5);
    }
}
