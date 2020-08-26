# Design Pattern
### Creational Patterns
Cung Cấp một giải pháp để tạo ra các object và che giấu được logic của việc tạo ra nó,
thay vì tạo ra object bằng cách sử dụng từ khóa new. Điều này giúp cho chương trình
trở lên mềm dẻo hơn trong việc quyết định object nào cần được tạo ra trong tình huống
được đưa ra.
- Factory method: Định nghĩa interface để sinh ra đối tượng, nhưng để cho lớp con quyết định
lớp nào được dùng để sinh ra đối tượng Factory Method, cho phép một lớp chuyến quá trình khởi
tạo cho lớp con.
- Abstract Factory: Cung cấp 1 interface cho việc tạo lập các đối tượng (có liên hệ với nhau)
mà không cần quy định lớp khi xác định lớp cụ thể tạo mỗi đối tượng.
- Builder: Tách rời việc xây dựng một đối tượng phức tạp khỏi biểu diễn của nó, sao cho
cùng một tiến trình xây dựng có thể tạo được các biểu diễn khác nhau.
- Prototype: Quy định loại của đối tượng cần tạo bằng cách dùng một đối tượng mẫu,
đối tượng mới được tạo ra nhờ vào sao chép đối tượng mẫu này.
- Singleton: Đảm bảo 1 class chỉ có 1 instance, và cung cấp một điểm truy cập toàn cục đến nó.
### Structural Patterns
Liên quan tới class và các thành phần của object. Nó dùng để thiết lập định nghĩa
quan hệ giữa các đối tượng.
- Adapter: Do vấn đề tương thích, thay đổi interface của một đối tượng thành một interface khác
phù hợp với yêu cầu của người sử dụng.
- Bridge: Tách ròi ngữ nghĩa của một vấn đề khỏi việc cài đặt, mục đích để cả 2 bộ phận
(ngữ nghĩa và cài đặt) có thể thay đổi độc lập nhau.
- Composite: Tổ chức các đối tượng theo cấu trúc phân cấp dạng cây, Tất các các đối tượng
trong cấu trúc được thao tác theo một cách thuần nhất như nhau. Tạo quan hệ thứ bậc bao gộp
giữa các đối tượng, client có thể xem đối tượng bao gộp và bị bao gộp như nhau -> khả năng
tổng quát hóa trong code của client dễ phát triển nâng cấp bảo trì.
- Decorator: Gán thêm trách nhiệm cho đối tượng vào lúc chạy.
- Facade: Cung cấp 1 interface thuần nhất cho một loạt các interface trong hệ thống con.
Nó định nghĩa 1 interface cao hơn các interface có sẵn để làm cho hệ thống con dễ sử dụng hơn.
- Flyweight: Sử dụng việc chia sẻ để thao tác hiệu quả trên một số đối tượng cỡ nhỏ.
- Proxy: Cung cấp đối tượng đại diện cho một đối tượng khác để hỗ trợ hoặc kiểm soát quá trình
truy suất đối tượng đó. Đối tượng thay thế gọi là proxy.
### Behavioral Patterns
Dùng trong việc thực hiện hành vi của đối tượng, sự giao tiếp giữa các đối tượng với nhau.
- Interpreter: Hỗ trợ việc định nghĩa biểu diễn cho một văn phạm và bộ thông dịch cho một ngôn ngữ.
- Template method: Định nghĩa phần khung của một thuật toán, tức là một thuật toán tổng quát
gọi đến một số phương thức chưa được cài đặt trong lớp cơ sở, việc cài đặt các phương thức được úy nhiệm cho các lớp kế thừa.
- Chain of responsibility: Khắc phục việc ghép cặp giữa bọ gửi và bộ nhận thông điệp.
Các đối tượng nhận thông điệp được kết nối thành một chuỗi, và thông điệp được chuyển dọc
theo chuỗi này đến khi gặp đối tượng xử lý nó. Tránh việc gắn kết cứng giữa việc gửi request
và phận xử lý request bằng cách cho phép hơn 1 đối tượng có cơ hội xử lý request.
Liên kết các đối tượng nhận request thành 1 dây chuyền rồi gửi request xuyên qua từng đối tượng xử lý
đến khi gặp đối tượng xử lý cụ thể cuối cùng.
- Command: Mỗi yêu cầu thực hiện thao tác nào đó được bao bọc thành một đối tượng.
Các yêu cầu sẽ được lưu trữ và gửi đi như các đối tượng. Đóng gói request vào trong 1 object,
nhờ đó có thể thông số hóa chương trình nhận request và thực hiện các thao tác trên request: sắp xếp,
log, undo...
- Iterator: Truy suất các phần từ của đối tượng dạng tập hợp tuần tự mà không phụ thuộc vào biểu diễn bên trong của các phần tử.
- Mediator: Định nghĩa một đối tượng để bảo bọc việc giao tiếp giữa một số đối tượng với nhau.
- Memento: Hiệu chỉnh và trả lại như cũ trạng thái bên trong của đối tượng mà vẫn không vi phạm việc bao bọc dữ liệu.
- Observer: Định nghĩa sự phụ thuộc một nhiều giữa các đối tượng sao cho khi một đối tượng thay đổi trạng thái thì
các đối tượng phụ thuốc cũng thay đổi theo.
- State: Cho phép một đối tượng thay đổi hành vi khi trạng thái bên trong của nó thay đổi,
ta có cảm giác class của đối tượng thay đổi.
- Strategy: Bao bọc một họ các thuật toán bằng các lớp đối tượng để thuật toán có thể thay đổi độc lập
với chương trình sử dụng thuật toán. Cung cấp một họ các giải thuật cho phép client lựa chọn linh động
một giải thuật cụ thể khi sử dụng.
- Visitor: Cho phép định nghĩa thêm các phép toán mới tác động lên các phần tử của một cấu trúc đối tượng
mà không cần thay đổi các lớp định nghĩa cấu trúc đó.
#
- The overall structure of the design pattern catalogue
![Optional Text](figure-1.png)
- Classification of Relationships
![Optional Text](figure-2.png)
- Revised Classification
![Optional Text](figure-3.png)
- Arrangement of design pattern in layers
![Optional Text](figure-4.png)
