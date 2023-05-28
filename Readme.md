- Cài đặt môi trường:
    + Cài đặt JDK để chạy được Java
    + Cài đặt IDE để code Java (Netbeans, Eclipse, IntelliJ, ...)

- Các bước để chạy chương trình:
    + Chạy trực tiếp App bằng lệnh ```java -jar CTDL.jar``` trên terminal  (lưu ý cần đi vào thư mục dist của project) hoặc click vào file `CTDL.jar` để chạy chương trình
    + Chạy bằng IDE: Mở project bằng IDE và chạy file CTDL.java

- Cấu trúc thư mục code:
    + src: chứa các file code của project
    + dist: chứa file `CTDL.jar` để chạy chương trình
    + Readme.md: file hướng dẫn chạy chương trình

- Mô tả project:
    + File `CTDL.java`: chứa hàm main để chạy chương trình
    + File `Graph.java`: chứa các hàm lưu trữ và xử lý đồ thị (ở bài báo cáo này đồ thị được lưu dưới dạng ma trận kề)
    + File `UI.java`: chứa các hàm xử lý giao diện người dùng bao gồm các thuật toán BFS,DFS và Dijkstra với Dijkstra được implement bằng 2 cách là cách sử dụng sorted priority queue và unsorted priority queue(uncomment và comment dòng 441 và 442 để chạy 2 cách khác nhau)
    + File `Link.java`: chứa các hàm lưu trữ vị trí các đỉnh của đồ thị trên giao diện người dùng và các hàm xử lý để thao tác với các đỉnh đó.
    + Ngoài ra còn có các file khác để hỗ trợ triển khai và mô phỏng.
