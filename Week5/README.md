# Bài tập week 5
Câu 1 + 2. Khảo sát Insertion Sort và Selection Sort: Thống kê thời gian chạy đối với từng loại dữ liệu từng kích thước dữ liệu. Nhận xét sự thay đổi của thời gian chạy theo dạng dữ liệu và kích thước dữ liệu.

- Thống kê trong file Report.md


Câu 3: Viết thêm vào thủ tục insertIntoSorted(int[] arr) để đưa phần tử cuối danh sách vào đúng vị trí để dãy tăng dần. Phần dãy trước đó (không kể phần tử cần tìm vị trí để chèn) đã được sắp. Cách chèn phần tử vào theo sắp xếp Chèn (Insertion sort). Tại mỗi bước in ra trạng thái mảng.

- Bài làm trong file InsertionSort1.java


Câu 4: Sắp xếp danh sách sinh viên theo trật tự lần lượt là: a) Điểm (CGPA) càng cao càng tốt, b) tên theo trật tự chữ cái và c) mã (id) càng nhỏ càng tốt.
(Đã có sẵn mã lệnh cho nhập dữ liệu vào và in ra. Chỉ cần viết phần sắp xếp.)

- Bài làm trong file Cau4.java


Câu 5: Viết thêm vào thủ tục insertionSortPart2(int[] ar) để sắp xếp theo thuật toán Insertion Sort. Sau mỗi lần (vòng lặp) chèn được một số, in ra trạng thái mảng.

- Bài làm trong file InsertionSort2.java


Câu 6: Trong thủ tục sắp xếp chèn insertionSort(int[] A) có một lỗi (error). Hãy tìm sửa lỗi đó (rồi submit code).

- Bài làm trong file Cau6.java


Câu 7: Cho danh sách các số nguyên. In ra (lần lượt) số lần xuất hiện của các số từ 0 tới 99. Không cần sắp xếp, chỉ cần đếm.

- Bài làm trong file CountingSort.java


Câu 8: Trong hai thuật toán sắp xếp Chọn (Insertion sort) và Chèn/Xen vào (Selection Sort), dữ liệu đầu vào có nên lưu trong LinkedList (danh sách liên kết) không ? Vì sao ?

- Trả lời: Sử dụng thuật toán sắp xếp Chọn và Chèn/Xen cho dữ liệu đầu vào lưu trong LinkedList là không hiệu quả vì:
    + Hai thuật toán sắp xếp trên đều có mức độ truy cập phần tử trong mảng cao
    + Độ phức tạp về thời gian khi truy cập phần tử trong LinkedList là O(n), chậm hơn nhiều so với ArrayList O(1)
- Như vậy nếu sắp xếp LinkedList bằng hai thuật toán trên thì sẽ có độ phức tạp là O(N^3), không hiệu quả