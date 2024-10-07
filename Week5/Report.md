## Khảo sát Insertion Sort và Selection Sort

- Các hàm test ở trong các file Insertion.java và Selection.java

- N = 4000
| Kiểu dữ liệu đầu vào               | Insertion Sort | Selection Sort |
| ---------------------------------- | -------------- | -------------- |
| Các file dữ liệu test              | 5.8ms          | 5.2ms          |
| Dữ liệu sinh ngẫu nhiên            | 4.8ms          | 2.8ms          |
| Dữ liệu đã được sắp xếp xuôi       | 3020.0ns       | 5378.8ns       |
| Dữ liệu sắp xếp ngược              | 9.4ms          | 2.8ms          |
| Dữ liệu toàn các giá trị bằng nhau | 4.0ms          | 2.6ms          |

- N = 32000
| Kiểu dữ liệu đầu vào               | Insertion Sort | Selection Sort |
| ---------------------------------- | -------------- | -------------- |
| Các file dữ liệu test              | 303.8ms        | 176.2ms        |
| Dữ liệu sinh ngẫu nhiên            | 296.2ms        | 164.8ms        |
| Dữ liệu đã được sắp xếp xuôi       | 18080.0ns      | 294313.8ns     |
| Dữ liệu sắp xếp ngược              | 601.2ms        | 171.6ms        |
| Dữ liệu toàn các giá trị bằng nhau | 245.8ms        | 170.6ms        |


- Thời gian để sắp xếp dãy đã được sắp xếp ngược là lâu nhất, hơn hẳn các loại dữ liệu đầu vào khác. Thời gian sắp xếp dãy đã được sắp xếp xuôi rất nhanh.
- Khi dãy đầu vào đã được sắp xếp hoặc gần như sắp xếp thì Insertion Sort chạy nhanh hơn rất nhiều so với Selection Sort vì có độ phức tạp gần như tuyến tính.
- Trong các trường hợp còn lại thì Selection Sort chạy nhanh hơn Insertion Sort.