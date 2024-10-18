import java.util.*;

public class Bai1 {
    public static int introTutorial(int V, List<Integer> arr) {
    // Write your code here
        int low = 0;
        int high = arr.size() - 1;

        while (low <= high) {
            int mid = (low + high)/2;
            if (V < arr.get(mid)) {
                high = mid - 1;
            } else if (V > arr.get(mid)) {
                low = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
