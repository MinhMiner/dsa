import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class iJC2Cau15 {
    public static void main(String[] args) {
        double a = StdIn.readDouble();
        double b = StdIn.readDouble();
        double c = StdIn.readDouble();
        StdOut.print((a + b > c) || (b + c > a) || (c + a > b));
        
        /*
         * Viết chương trình lấy vào ba số thực dương và trả về true nếu một trong số đó lớn hơn tổng hai số kia. Như vậy chương trình này có thể kiểm tra tính hợp lệ của ba cạnh tam giác.
         * (Nghi vấn đề sai) Điều kiện 3 số là 3 cạnh tam giác khi tổng 2 số bất kì luôn lớn hơn số còn lại. Ví dụ bộ 3 số (1, 5, 9) thỏa mãn điều kiện đầu tiên của đề bài (9 > 1 + 5) nhưng không phải là một tam giác hợp lệ
         */
    }
}
