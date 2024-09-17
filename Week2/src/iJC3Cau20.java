public class iJC3Cau20 {
    public void convertToBinary(int n, String s) {
        StringBuilder result = new StringBuilder();
        
        while (n != 0) {
            int temp = n % 2;

            result.insert(0, temp);

            n /= 2;
        }
        
        s = result.toString();
    }
}
