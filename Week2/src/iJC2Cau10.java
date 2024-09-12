public class iJC2Cau10 {
    public static void main(String[] args) {
        int a = 2147483647;
        System.out.println(a);  // 2147483647
        System.out.println(a + 1);  // -2147483648
        System.out.println(2 - a);  // -2147483645
        System.out.println(-2 - a); // 2147483647
        System.out.println(2 * a);  // -2
        System.out.println(4 * a);  // -4
        // Vì int chỉ lưu các giá trị từ -2147483648 đến 2147483647, ngoài phạm vi này thì các tính toán không chính xác
    }
}