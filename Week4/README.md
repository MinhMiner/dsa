# Bài tập Week 4
Bài 1: Lấy mã nguồn chương trình và dữ liệu về các cài đặt (implementation) khác nhau của hai cấu trúc Stack và Queue tại link mã nguồn môn học. Chạy lại chương trình với dữ liệu test. Sau đó đọc mã nguồn.

Các mã nguồn:
- ResizingArrayStack.java
- LinkedStack.java
- Stack.java
- ResizingArrayQueue.java
- LinkedQueue.java
- Queue.java


Bài 2: Kiểm tra xem các dấu đóng mở ngoặc {[()]} có đúng qui tắc hay không.
Sử dụng stack trong bài này. Nên xem lại ví dụ xử lý và tính toán biểu thức trong slide bài giảng.
- Bài làm trong file: BalancedBrackets.java


Bài 3: Cài đặt queue với các phương thức enqueue, dequeue và print (in ra phần đầu ở đầu).
- Bài làm trong file QueueWithTwoStacks.java


Bài 4: Cho dãy số nguyên. Viết chương trình sắp xếp theo thứ tự tăng dần (mà không sử dụng hàm/thư viện có sẵn).
- Bài làm trong file SelectionSort.java
- Thử nghiệm thời gian chạy (Trên máy tính cá nhân):
    + Với input N = 1000 số ngẫu nhiên, thời gian chạy trung bình: 0,009s
    + Với input N = 100000 số ngẫu nhiên, thời gian chạy trung bình: 2,111s
    + Với input N = 500000 số ngẫu nhiên, thời gian chạy trung bình: 41.955s
    + Với input N = 1000000 số ngẫu nhiên, thời gian chạy trung bình: 166.371s
- Selection Sort có độ phức tạp O(N^2) nên khi kích thước mảng cần sắp xếp tăng cao thì thời gian chạy cũng tăng lên rất cao.


Bài 5: Cài 1 chương trình soạn thảo với 4 thao tác: append, delete, print và undo. Để cài undo, có thể sử dụng stack.
- Bài làm trong file SimpleTextEditor.java


Bài 6: Cho ba chồng đĩa (mỗi đĩa có độ dày khác nhau, biểu diễn bằng 1 số). Tìm độ cao chung lớn nhất của các chồng đĩa con từ dưới lên.
- Bài làm trong file EqualStacks.java