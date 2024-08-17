public class ImMutableDemo {
    // Là lớp cho phép khởi tạo các đối tượng chỉ có thể lấy thông tin và không thể sửa (Chỉ có get(), không có set())
    private String name;

    public ImMutableDemo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
