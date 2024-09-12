import edu.princeton.cs.algs4.StdIn;

public class Hellos {
    public static void main(String[] args) {
        int n = StdIn.readInt();
        for (int i = 1; i <= n; i++) {
            String suffix = findSuffix(i);
            System.out.println(i + suffix + " Hello");
        }
    }

    public static String findSuffix(int i) {
        if (i % 100 == 11 || i % 100 == 12 || i % 100 == 13)
            return "th";
        else if (i % 10 == 1)
            return "st";
        else if (i % 10 == 2)
            return "nd";
        else if (i % 10 == 3)
            return "rd";
        else
            return "th";
    }
}
    