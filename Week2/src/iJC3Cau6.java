public class iJC3Cau6 {
    public static void main(String[] args) {
        int i, j;
        //  Giá trị của j sau các dòng lệnh
        for (i = 0, j = 0; i < 10; i++) j += i;
        System.out.println("j = " + j);     // j = 45

        for (i = 0, j = 1; i < 10; i++) j += j;
        System.out.println("j = " + j);     // j = 1024

        for (j = 0; j < 10; j++) j += j;
        System.out.println("j = " + j);     // j = 15

        for (i = 0, j = 0; i < 10; i++) j += j++;
        System.out.println("j = " + j);     // j = 0
    }
}