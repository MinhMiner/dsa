## Khảo sát Merge Sort và Quick Sort

- Các hàm test ở trong các file Insertion.java và Selection.java (Tuần trước); MergeSort.java và QuickSort.java

- N = 4000

| Kiểu dữ liệu đầu vào               | Insertion Sort | Selection Sort | Merge Sort | Quick Sort |
| ---------------------------------- | -------------- | -------------- | ---------- | ---------- |
| Các file dữ liệu test              | 5.8ms          | 5.2ms          | 0.4ms      | 1.0ms      |
| Dữ liệu sinh ngẫu nhiên            | 4.8ms          | 2.8ms          | ~0.0ms     | 0.2ms      |
| Dữ liệu đã được sắp xếp xuôi       | 3020.0ns       | 5378.8ns       | 39340.0ns  | 244700.0ns |
| Dữ liệu sắp xếp ngược              | 9.4ms          | 2.8ms          | ~0.0ms     | 0.2ms      |
| Dữ liệu toàn các giá trị bằng nhau | 4.0ms          | 2.6ms          | 0.2ms      | ~0.0ms     |

- N = 32000

| Kiểu dữ liệu đầu vào               | Insertion Sort | Selection Sort | Merge Sort | Quick Sort |
| ---------------------------------- | -------------- | -------------- | ---------- | ---------- |
| Các file dữ liệu test              | 303.8ms        | 176.2ms        | 2.2ms      | 2.4ms      |
| Dữ liệu sinh ngẫu nhiên            | 296.2ms        | 164.8ms        | 2.4ms      | 2.8ms      |
| Dữ liệu đã được sắp xếp xuôi       | 18080.0ns      | 294313.8ns     | 458580.0ns | 2459920.0ns|
| Dữ liệu sắp xếp ngược              | 601.2ms        | 171.6ms        | 0.4ms      | 2.2ms      |
| Dữ liệu toàn các giá trị bằng nhau | 245.8ms        | 170.6ms        | 1.6ms      | 1.0ms      |


- Nếu không xáo trộn mảng trước khi thực hiện Quick Sort, trong các trường hợp đặc biệt (Mảng đã được sắp xếp) thì Quick Sort sẽ chạy rất chậm và gặp lỗi Stack Overflow (Khi implement theo đệ quy)