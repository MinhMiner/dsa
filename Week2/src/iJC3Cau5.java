import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class iJC3Cau5 {
    public static void main(String[] args) {
        StdOut.print("Nhiet do ngoai troi: "); double T = StdIn.readDouble();
        if (T > 100)
            System.out.println("Nhiet do khong hop ly");
        else {
            StdOut.print("Toc do gio tai do cao 10m: "); double V = StdIn.readDouble();
            double Twc = 13.12 + 0.6215*T - 11.37*Math.pow(V, 0.16) + 0.3965*T*Math.pow(V, 0.16);
            StdOut.print("Nhiet do ta cam nhan duoc: " + Twc);
        }
        
    }
}
