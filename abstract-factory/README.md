# Abstract Factory

### Intent
- Abstract Factory là một creational design pattern giúp bạn tạo ra một một họ các đối tượng liên quan mà không cần chỉ định
các lớp cụ thể của chúng.
### Problem
- Hãy tưởng tượng bạn đang tạo 1 của hàng nội thất. Code của bạn gồm các lớp sau:
  - Một họ sản phẩm liên quan đến nhau Chair + Sofa + CoffeeTable.
  - Một số biến thể của họ này Modern, Victorian, ArtDeco
- Bạn cần có cách để tạo ra các đồ vật nội thất riêng lẻ để chúng phù hợp với các đồ vật khác trong cùng một họ.
Khách hàng khá tức giận khi nhận được đồ nội thất không phù hợp.
- Bạn không muốn thay đổi code khi thêm mới các sản phẩm hoặc họ các sản phẩm vào chương trình. Các nhà cung cấp cập nhật
catalogs rất thường xuyên, và bạn không muốn thay đổi code mỗi lần điều đó xảy ra.
### Solution
- Abstract Factory đề xuất khai báo tưởng minh các interface cho mỗi sản phẩm riêng biệt của họ sản phẩm.
Sau đó tất cả các biến thể của sản phẩm tuân theo các interface đó.
- Abstract Factory là môt super factory để tạo ra các factory khác, là một pattern cấp cao hơn so với Factory Method.