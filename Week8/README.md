# Bài tập Week 8

Bài 2. Bài làm trong file Bai2.java

Bài 3. Bài làm trong file Bai3.java

Bài 5. Bài làm trong file Bai5.java

Time complexity:
- Khởi tạo mảng result, 2 Priority queue hỗ trợ và thêm 2 phần tử đầu tiên vào mảng có độ phức tạp O(1)
- Với mỗi phần tử tiếp theo:
+ Thêm vào 1 trong 2 Priority Queue, độ phức tạp là O(log k) với k là số phần tử của Priority Queue đó; k <= n/2 + 1 nên độ phức tạp là O(log n)
+ Hàm transfer để cân bằng số lượng phần tử của 2 Priority Queue, độ phức tạp là O(log n) trong trường hợp xấu nhất
+ Thêm phần tử trung vị vào mảng result có độ phức tạp O(1)
- Vậy với n phần tử thì thuật toán có độ phức tạp O(n.logn)

Space complexity:
- Thuật toán sử dụng thêm 2 Priority Queue để lưu trữ n phần tử từ danh sách ban đầu, cần bộ nhớ O(n)
- Danh sách list lưu các giá trị trung vị cần trả về cũng cần O(n)
- Vậy với n phần tử thì thuật toán cần bộ nhớ O(n)