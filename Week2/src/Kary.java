public class Kary {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        
        StringBuilder result = new StringBuilder();
        
        while (n != 0) {
            int temp = n % k;
            switch (temp) {
                case 10:
                    result.insert(0, 'A');
                    break;
                case 11:
                    result.insert(0, 'B');
                    break;
                case 12:
                    result.insert(0, 'C');
                    break;
                case 13:
                    result.insert(0, 'D');
                    break;
                case 14:
                    result.insert(0, 'E');
                    break;
                case 15:
                    result.insert(0, 'F');
                    break;
                default:
                    result.insert(0, temp);
                    break;
            }
            n /= k;
        }
        System.out.println(result);
    }
}
    