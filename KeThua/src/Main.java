public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

/*
Kế thừa: Là cơ chế cho phép lớp con kế thừa lại thuộc tính và phương thức (trừ private) của lớp cha.
Động vật ăn thịt       <====================        Dộng vật
Mối quan hệ is - a: Động vật ăn thịt là 1 loại Động vat
*/

/*
Đa hình: cơ chế cho phép 1 đối tượng thể hiện theo nhiều hình thái khác nhau.

Nạp chồng (Overload): Thể hiện tính chất đa hình lúc biên dịch (Vì có thể xác định nó sẽ gọi phương thức nào
ngay lúc biến dịch)
- Xảy ở trong 1 lớp.
- Là các phương thức cùng tên chỉ cần khác nhau về tham số truyền vào ( số lượng hoặc kiểu dữ liệu )
 */

class Address { // Định nghĩa kiểu dư liệu mơí
    int soNha;
    String xa;
}

class Student {
    int age;
    String name;
    Address address;
}

// Student voi Address : has - a