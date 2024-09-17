import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;

public class PercolationStats {
    private static final double CONFIDENCE_95 = 1.96;
    private final double[] thresholds;
    private final int trials;
    // perform independent trials on an n-by-n grid
    public PercolationStats(int n, int trials) {
        if (n <= 0 || trials <= 0) {
            throw new IllegalArgumentException();
        }

        thresholds = new double[trials];
        this.trials = trials;

        for (int i = 0; i < trials; i++) {
            Percolation system = new Percolation(n);
            while (!system.percolates()) {
                int currentRow = StdRandom.uniformInt(1, n + 1);
                int currentCol = StdRandom.uniformInt(1, n + 1);
                if (!system.isOpen(currentRow, currentCol)) {
                    system.open(currentRow, currentCol);
                }
            }
            thresholds[i] = (double) system.numberOfOpenSites() / (n * n);
        }
    }

    // sample mean of percolation threshold
    public double mean() {
        return StdStats.mean(thresholds);
    }

    // sample standard deviation of percolation threshold
    public double stddev() {
        return StdStats.stddev(thresholds);
    }

    // low endpoint of 95% confidence interval
    public double confidenceLo() {
        return mean() - (CONFIDENCE_95 * stddev() / Math.sqrt(trials));
    }

    // high endpoint of 95% confidence interval
    public double confidenceHi() {
        return mean() + (CONFIDENCE_95 * stddev() / Math.sqrt(trials));
    }

   // test client (see below)
   public static void main(String[] args) {        
        int n = Integer.parseInt(args[0]);
        int t = Integer.parseInt(args[1]);
        PercolationStats percoStats = new PercolationStats(n, t);
        // Print results
        System.out.println("mean                    = " + percoStats.mean());
        System.out.println("stddev                  = " + percoStats.stddev());
        System.out.println("95% confidence interval = [" + percoStats.confidenceLo() + ", " + percoStats.confidenceHi() + "]");
    }
}