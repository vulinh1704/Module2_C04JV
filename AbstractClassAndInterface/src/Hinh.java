public abstract class Hinh { // Khai báo abstract class
    private String name;

    public Hinh(String name) {
        this.name = name;
    }

    public abstract double tinhDienTich(); // Phương thức abstract
    public abstract double tinhChuVi();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


/*

Abstract thì cho phép khai báo thuộc tính và phương thức, constructor như 1 lớp bình thường
và các phương thức trừu tượng nhưng không thể khởi tạo đối tượng.

- Phương thức trừu tượng là phương thức được khai báo với từ khóa abstract, nó sẽ
không có phan thân, phần triển khai sẽ do lớp con (không abstract) triển khai.
- Phương thức abstract bắt buộc nằm trong lớp abstract;

- Khi 1 lớp con non-abstract kế thừa 1 lớp abstract sẽ phải triển khai
các phương thức abstract ở lớp cha.
- Từ khóa abstract và final ko thể đi cùng nhau.
 */

/*
=> từ khóa final: có thể đi kèm tên lớp, tên bien, tên phương thức
Final với class:  thì không thế cho phép lớp nào kế thừa
Final với tên biến: thì không thể thay đổi giá trị biến đó
Final với phương thức: không cho phép ghi đè ở lớp con

 */

class Animal {
    final String name = "Hehe"; // Đây là khai báo hằng số
    final int go() {
        return 1;
    }
}

class Bird extends Animal {
}

