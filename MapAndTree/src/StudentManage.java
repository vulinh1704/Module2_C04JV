import java.util.HashMap;
import java.util.Map;

public class StudentManage {
    private Map<Integer, Student> listStudent = new HashMap<>();

    public void save(Student student) {
        listStudent.put(student.getId(), student);
    }

    public void delete(int id) {
        listStudent.remove(id);
    }

    public Student findById(int id) {
        return this.listStudent.get(id);
    }

    public Map<Integer, Student> getListStudent() {
        return this.listStudent;
    }
}
