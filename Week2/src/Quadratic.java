public class Quadratic {
    public static void main(String[] args) {
        double b = Double.parseDouble(args[0]);
        double c = Double.parseDouble(args[1]);
        double discriminant = b*b - 4.0*c;
        double sqroot = Math.sqrt(discriminant);
        double root1 = (-b + sqroot) / 2.0;
        double root2 = (-b - sqroot) / 2.0;
        System.out.println(root1);
        System.out.println(root2);

        /*
        Để tính căn bậc 2 của một số n bằng Quadratic.java, khi chạy chương trình cần nhập 2 tham số: 0 và -n
        Ví dụ: 
        $java Quadratic 0 -5
        Output: 
        2.23606797749979
        -2.23606797749979
        */
    }
}
    