public class iJC3Cau2 {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double discriminant = b*b - 4.0*a*c;
        if (a == 0) {
            if (b == 0) {
                if (c == 0)
                    System.out.println("Phuong trinh vo so nghiem");
                else
                    System.out.println("Phuong trinh vo nghiem");
            } else
                System.out.println(-c/b);
        }
        else
        if (discriminant > 0) {
            double sqroot = Math.sqrt(discriminant);
            System.out.println((-b + sqroot) / (2.0*a));
            System.out.println((-b - sqroot) / (2.0*a));
        } else if (discriminant == 0) {
            System.out.println(-b/(2.0*a));
        } else
            System.out.println("Phuong trinh vo nghiem");
    }
}
    