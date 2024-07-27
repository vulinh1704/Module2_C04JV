import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Number> numberList = new LinkedList<>();
        numberList.add(1);
        numberList.remove(4);
        numberList.size();
        numberList.set(1, 44);
    }
}


/*
LinkedList là 1 cau truc du lieu dang sach.

 */

/*
ArrayList là 1 cấu trúc  dữ liệu dạng danh sách và được triển khai từ interface List
Bên trong lớp arrayList sẽ sử dụng mảng để lưu phần tử.

 List<Number> list = new ArrayList<>(); // Có 1 mảng 10 phan tử
        // Khi đầy mảng bên trong nó sẽ tự xử lý sao chép 1 mảng với độ dài = size + size/2
        list.add(4); // Thêm mới
        list.add(5);
        list.add(7);
        list.add(1, 55); // chèn phần tử
//        System.out.println(list.get(0)); // 4 // Tìm kiếm
//        list.remove(1); // Xóa
//        list.set(1, -50); // Sửa
        for (Number item: list) { // Duyệt collection
            System.out.println(item);
        }
        System.out.println(list.indexOf(-4)); // TÌm kiếm phần tử trong mảng
        System.out.println(list.size()); // So lượng phần tử của mảng

 */