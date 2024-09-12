public class FunctionGrowth {
    public static void main(String[] args) {
        System.out.printf("%-10s %-10s %-15s %-15s %-15s %-20s%n", 
                          "logN", "N", "NlogN", "N^2", "N^3", "2^N");
        
        for (int N = 16; N <= 2048; N *= 2) {
            System.out.printf("%-10.2f %-10d %-15.2f %-15d %-15d %-20.2e%n",
                              Math.log(N),
                              N,
                              N * Math.log(N),
                              N * N,
                              N * N * N,
                              Math.pow(2, N));
        }
    }
}
