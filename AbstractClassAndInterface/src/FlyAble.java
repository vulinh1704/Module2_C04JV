public interface FlyAble { // Interface
    public static final int A = 10;

    void bay();

    public abstract void haCanh();

}
interface Animal1 {
    void eat();
}

class Chim implements FlyAble, Animal1 {

    @Override
    public void bay() {

    }

    @Override
    public void haCanh() {

    }

    @Override
    public void eat() {

    }
}

class MayBay implements FlyAble {

    @Override
    public void bay() {
        System.out.println(FlyAble.A);
    }

    @Override
    public void haCanh() {

    }
}

/*
Interface: Thì không phải là lớp lớp, có nhiệm vụ khai báo tập các tính năng.
Interface thì chỉ chứa các hằng số và các phương thức trừu tượng (k có phần thân)
Interface thì hỗ trợ đa trien khai
Mặc định các phương thức ở trong interface thì là public abstract
Mặc định hằng số ở trong interface là public static final.
Khai báo interface thì định nghĩa 1 kiểu dữ liệu mới.

Sử dụng từ khóa implements để triển khai interface;
- Khi lớp con (không abstract) triển khai interface sẽ phải triển tất cả các phương thức có ở trong đó
 */

// Tổng kiến thức Xmind
// Chuyển bài tập quản lý thành quản lý bán hàng (Product, ProductManger)
// Buổi sau: Demo quản lý sản phẩm bằng arraylist
