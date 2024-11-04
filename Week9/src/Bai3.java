import java.util.*;

public class Bai3 {

public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        
        HashSet<String> hashSet = new HashSet<>();
        
        for (int i = 0; i < t; i++) {
            String pair = s.nextLine();
            hashSet.add(pair);
            System.out.println(hashSet.size());
        }

        s.close();
    }
}