public class Animal {
    private String name; // Thuộc tính thường sử dụng với từ khóa private
    // Muốn lấy dữ liệu thì thông phương thức public là getter và setter
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Phương thức getter
    public String getName() {
        return this.name;
    }

    // Phương thức setter
    public void setName(String name) {
        this.name = name;
    }
}
