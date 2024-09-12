import edu.princeton.cs.algs4.StdOut;

public class SumOfTwoDice {
    public static void main(String[] args) {
        int dice1 = (int) (Math.round(Math.random() * 5 + 1));
        int dice2 = (int) (Math.round(Math.random() * 5 + 1));
        StdOut.println("Dice 1: " + dice1);
        StdOut.println("Dice 2: " + dice2);
        StdOut.println("Sum: " + (dice1 + dice2));
    }
}
