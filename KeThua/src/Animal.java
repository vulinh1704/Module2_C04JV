public class Animal {
    private int id;
    private String name;

    public Animal(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Animal() {
        this(1, "Mèo");
    }
        /*
        - this() Gọi constructor có tham số tương ứng của lớp đó để tạo thành phần
        cho lớp.
        - this() thì đứng đầu trong constructor
         */
    public void eat() {
        System.out.println("Animal is eating.");
    }

    public String go(String to) {
        // abc
        return "Animal go to " + to;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}


// Tất cả các lớp đề kế thừa từ lớp Object
// this. thì đại cho đối tượng đang sử dụng lớp đó
// super. đại diện cho đối tượng có kiểu là lớp cha.
