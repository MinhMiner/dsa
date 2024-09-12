public class iJC2Cau11 {
    public static void main(String[] args) {
        double a = 3.14159;
        System.out.println(a);  // 3.14159
        System.out.println(a + 1);  // 4.14159
        System.out.println(8 / (int) a);    // 2
        // (int) 3.14159 = 3; 8 / 3 = 2 (Phép chia các số nguyên)
        System.out.println(8 / a);  // 2.5464812403910124   (Phép chia số thực)
        System.out.println((int) (8 / a));  // 2    (Phép chia số thực rồi chuyển về kiểu số nguyên)
    }
}
