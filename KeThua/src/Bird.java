// Đơn kế thừa, kế thừa đa tầng, kế thừa thứ bậc
// Java không cho phép đa kế thừa
public class Bird extends Animal {  // Sử dụng extends để kế thừa
    // Lớp con có thể sử dụng các thành phần trừ private, có thể khai báo thêm thuộc tính và phương thức moi
    private String color;
    public Bird(int id, String name, String color) {
        super(id, name); // Gọi constructor của lớp cha
        this.color = color;
    }
        /*
        - super() Gọi constructor có tham số tương ứng của lớp cha để tạo thành phần
        cho lớp con sử dụng
        - super() thì đứng đầu trong constructor
        - this() và super() thì đứng cùng nhau trong 1 constructor
         */

    @Override
    public String go(String to) { // Ghi
        // bcd
        return "Bird is go to " + to;
    }

    @Override // không bắt buộc
    public void eat() {
        System.out.println("Bird is eating");
        /*
        Ghi đè phương xảy ra trong mối quan hệ kế thừa
        Là các phương thức:
        + Cùng tên, kiểu dữ liệu trả về, cùng tham số truyền vào
        + Khác logic xử lý (trong dấu {})
         */
    }

    public void fly() {
        System.out.println("Bird is fly");
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}


class Main2 {
    public static void main(String[] args) {
//        Bird bird = new Bird(1, "Cu gáy", "Đỏ");
//        System.out.println(bird.getName());
//        bird.eat();
//        System.out.println(bird.getColor());
//        bird.fly();

               Animal a = new Bird(1 , "Mèo", "Bạch kim");
         // Kiêu khai báo        Kiểu thực tế

        // Kiểu dữ liệu lớp tham chiếu đến đối tượng lớp con
        // Hàm được gọi sẽ phụ vào kiểu thực tế

               a.eat(); // In ra gì? => Bird
    }
}
