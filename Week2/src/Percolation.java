import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
    private final WeightedQuickUnionUF sites;
    private final boolean[] openedSites;
    private final int depth;
    private final int virtualTop;
    private final int virtualBottom;
    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException();
        }
        depth = n;
        virtualTop = 0;
        virtualBottom = n * n + 1;
        sites = new WeightedQuickUnionUF(virtualBottom + 1);
        openedSites = new boolean[virtualBottom];
        for (int i = 0; i < openedSites.length; i++) {
            openedSites[i] = false;
        }
    }

    // check if row and col is valid
    private void validate(int row, int col) {
        if (row < 1 || col < 1 || row > depth || col > depth) {
            throw new IllegalArgumentException();
        }
    }

    private int mapTo1D(int row, int col) {
        return depth * (row - 1) + col;
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) {
        validate(row, col);

        int currentSite = mapTo1D(row, col);
        if (openedSites[currentSite]) {
            return;
        }

        openedSites[currentSite] = true;
        if (row == 1) {
            sites.union(virtualTop, currentSite);
        }
        if (row == depth) {
            sites.union(virtualBottom, currentSite);
        }

        if (row > 1 && isOpen(row - 1, col)) {
            sites.union(currentSite - depth, currentSite);
        }
        if (row < depth && isOpen(row + 1, col)) {
            sites.union(currentSite + depth, currentSite);
        }
        if (col > 1 && isOpen(row, col - 1)) {
            sites.union(currentSite - 1, currentSite);
        }
        if (col < depth && isOpen(row, col + 1)) {
            sites.union(currentSite + 1, currentSite);
        }
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {
        validate(row, col);
        return openedSites[mapTo1D(row, col)];
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {
        validate(row, col);
        return sites.find(virtualTop) == sites.find(mapTo1D(row, col));
    }

    // returns the number of open sites
    public int numberOfOpenSites() {
        int count = 0;
        for (int i = 0; i < depth; i++) {
            for (int j = 1; j <= depth; j++) {
                if (openedSites[depth * i + j])
                    count++;
            }
        }
        return count;
    }

    // does the system percolate?
    public boolean percolates() {
        return sites.find(virtualTop) == sites.find(virtualBottom);
    }
}