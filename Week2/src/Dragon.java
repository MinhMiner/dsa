import edu.princeton.cs.algs4.StdIn;

public class Dragon {
    public static void main(String[] args) {
        int n = StdIn.readInt();
        System.out.println(fractalDragon(n));
    }

    private static String fractalDragon(int n) {
        if (n <= 0) {
            return "F";
        }

        String temp = fractalDragon(n - 1);
        StringBuilder reverse = new StringBuilder();
        for (int i = temp.length() - 1; i >= 0; i--) {
            char check = temp.charAt(i);
            if (check == 'R')
                check = 'L';
            else if (check == 'L')
                check = 'R';
            
            reverse.append(check);
        }
            
        return fractalDragon(n - 1) + "L" + reverse.toString();
    }
}
