package person;

/*
     Tính đóng gói: Là kỹ thuật che giau dữ liệu chỉ cho phép truy cập các thông tin cần thiết
     Access Modifier: là các từ khóa quy định phạm vi truy cập của thuộc tính và phương thức ở trong class
     Các từ khóa : public, private, default, protected
     Từ khóa public: Cho phép dữ liệu truy cập ở bất cứ nơi nao
     Từ khóa private: Cho phép dữ liệu truy cập trong cùng 1 lớp
     Từ khóa default: Khi không sử access modifier nào
     thì default sẽ được áp dụng và cho phép dữ liệu truy cập trong cùng 1 package
     Tu khóa protected: Cho phép ngoài package khi trong mối quan hệ kế thừa và trong package
 */
public class Person {
    public String name;
    private int id;
    int age;
    protected double money;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String go() {
        return this.name + " is go";
    }

    private void eat() {
        System.out.println(this.id);
        System.out.println("Toi dang an");
    }

    void sleep() {
        System.out.println("Toi dang ngu");
    }

    public static void main(String[] args) {
        Person person = new Person("Giang", 2);
        System.out.println(person.id); // Sử dụng trong lớp Person
        person.eat();
        System.out.println(person.age);
    }


}
