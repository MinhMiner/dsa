import java.util.List;

public class EqualStacks {
    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        for (Integer n : h1) {
            sum1 += n;
        }
        for (Integer n : h2) {
            sum2 += n;
        }
        for (Integer n : h3) {
            sum3 += n;
        }

        int index1 = 0;
        int index2 = 0;
        int index3 = 0;
        while (!(sum1 == sum2 && sum2 == sum3)) {
            int max = Math.max(sum1, Math.max(sum2, sum3));
            if (max == sum1) {
                sum1 -= h1.get(index1);
                index1++;
            } else if (max == sum2) {
                sum2 -= h2.get(index2);
                index2++;
            } else {
                sum3 -= h3.get(index3);
                index3++;
            }
        }
        
        return sum1;
    }
}

/** Có thể dùng cấu trúc dữ liệu Stack nhưng có vẻ kết quả thời gian chạy cũng không hơn hẳn so với cách này, độ phức tạp đều là O(n). */ 