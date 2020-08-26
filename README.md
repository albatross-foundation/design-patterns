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
- Adapter
- Bridge
- Composite
- Decorator
- Facade
- Flyweight
- Proxy
### Behavioral Patterns
Dùng trong việc thực hiện hành vi của đối tượng, sự giao tiếp giữa các đối tượng với nhau.
- Interpreter
- Template method
- Chain of responsibility
- Command
- Iterator
- Mediator
- Memento
- Observer
- State
- Strategy
- Visitor
#
- The overall structure of the design pattern catalogue
![Optional Text](figure-1.png)
- Classification of Relationships
![Optional Text](figure-2.png)
- Revised Classification
![Optional Text](figure-3.png)
- Arrangement of design pattern in layers
![Optional Text](figure-4.png)
