public class School {
    // static: là từ khóa để khai thuộc tính và phương thức chung giữa các đối tượng
    // Để lấy thành phần static thì chỉ cần dùng tên lớp
    static int quantitySchool = 0; // Thuộc tính static
    String name;
    public School() {
        quantitySchool++;
    }

    static void hello() { // Phương thức static
        // Phương thức static thì không thể gọi các thành non static
        System.out.println("Hello");
    }

    void go() {
        // Phương thức non static có thể gọi thành phần static
    }

}
