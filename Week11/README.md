# Bài tập Week 11
Câu 1. Lấy mã nguồn chương trình và dữ liệu về các cài đặt (implementation) khác nhau của Bảng băm (Hash Tables) theo 'separate chaining' và 'linear probing' tại link mã nguồn môn học (phần searching). Chạy lại chương trình với dữ liệu test.
- Các file test: SeperateChainingHastST.java, LinearProbingHashST.java

Câu 2 + 3.
- Các file *.png

Câu 4. https://www.hackerrank.com/challenges/pairs/problem
- Bài làm trong file Cau4.java

Câu 5. https://www.hackerrank.com/challenges/missing-numbers/problem
- Cách 1: Sử dụng bảng băm (Hash Tables) để đếm và tìm; sau đó sắp xếp để in ra: File Cau5a.java
+ Duyệt mảng brr để update HashMap trung bình O(n)
+ Duyệt mảng arr để update HashMap trung bình O(n)
+ Duyệt HashMap để tìm các số bị thiếu và sắp xếp (Insertion Sort) trung bình O(n^2)
+ Độ phức tạp trung bình là O(n^2)
- Cách 2: Chỉ sử dụng sắp xếp (Sorting) khi tìm và in ra: File Cau5b.java
+ Sắp xếp 2 mảng arr và brr O(n*logn) (Dùng Timsort/Mergesort)
+ Duyệt tuần tự 2 mảng để tìm các số bị thiếu: O(n)
+ Độ phức tạp là O(n*logn)
- Cách 3: Sử dụng cách làm trong bài Sắp xếp đếm (Counting Sort): File Cau5c.java
+ Đếm số lần xuất hiện các số trong 2 mảng cần O(n)
+ Duyệt mảng đếm để trả về kết quả cần O(n)
+ Độ phức tạp là O(n)

Câu 6. https://www.hackerrank.com/challenges/find-the-running-median/problem
- Bài làm trong file Cau6.java