public class MutableDemo {
    // Mutable là các lớp có thể lấy và sưa thông tin (vừa có get(), vừa có set())
    private String name;
    private int age;

    public MutableDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
