import edu.princeton.cs.algs4.StdOut;

public class iJC2Cau17 {
    public static void main(String[] args) {
        {
            int a = 1;
            a = a + a;  // a = 1 + 1 = 2
            a = a + a;  // a = 2 + 2 = 4
            a = a + a;  // a = 4 + 4 = 8
            StdOut.println(a);  // 8
        }
        {
            boolean a = true;
            a = !a;     // a = !true = false
            a = !a;     // a = !false = true
            a = !a;     // a = !true = false
            StdOut.println(a);  // false
        }
        {
            int a = 2;
            a = a * a;  // a = 2 * 2 = 4
            a = a * a;  // a = 4 * 4 = 16
            a = a * a;  // a = 16 * 16 = 256
            StdOut.println(a);  // 256
        }
    }
}
