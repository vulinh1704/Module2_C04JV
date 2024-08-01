import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        /*Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Linh");
        hashMap.put(2, "Tùng"); // Thêm
        hashMap.put(2, "Kỷ"); // Sửa
        // hashMap.remove(2); // Xóa

        // Cách duyệt Map trong Java
        Set<Integer> keys = hashMap.keySet();
        // Set: là 1 cấu trúc dữ liâu tương tự array list nhưng không cho phép giá trị trùng lặp
        for (Integer item : keys) {
            System.out.println("Key: " + item + "| Value: " + hashMap.get(item));
        }

//        System.out.println(hashMap.get(2));

         */

        Student student = new Student(1, "Linh", 33);
        Student student1 = new Student(2, "Đức", 34);
        StudentManage studentManage = new StudentManage();
        studentManage.save(student);
        studentManage.save(student1);

//        System.out.println(studentManage.findById(1));
        Student student2 = new Student(2, "Đức 2", 35);
        studentManage.save(student2);
        studentManage.delete(2);
        Map<Integer, Student> studentList = studentManage.getListStudent();
        Set<Integer> keys = studentList.keySet();
        for (Integer k: keys) {
            System.out.println(studentList.get(k));
        }
    }
}

/*
Cấu trúc dữ liệu danh sách theo key và value
 */