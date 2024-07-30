import java.util.ArrayList;
import java.util.List;

public class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class Main2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(11, "Linh"));
        list.add(new Student(54, "Đức"));
        list.add(new Student(20, "Giang"));
        list.sort((o1, o2) -> o1.name.compareTo(o2.name)); // Sắp xếp mảng theo id
        for (Student s: list) {
            System.out.println(s);
        }
    }
}
