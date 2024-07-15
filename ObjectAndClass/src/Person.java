public class Person { // Tên lớp public phải trùng với tên file
    public int age; // thuộc tính
    public String name;
    /*
    Các thuộc tính thì có giá trị mặc định, nếu không quy định giá trị thì
    giá trị mặc định sẽ phụ thuộc vào kiểu dữ liệu (int: 0, double: 0.0
    boolean: false, String: null,...)
     */
    public String gender = "Nam";

    public Person(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

//    public Person(String gender, String name, int age) {
//        this.age = age;
//        this.name = name;
//        this.gender = gender;
//    }

    public Person() {
    }

    public String hello() { // Khai báo phương thức
        return this.name + " Xin chào anh em";
    }

    public void go(String from) { // void: Không cần giá trị trả về
        System.out.println(this.name + " đang đi đến " + from);
    }

}
/*
 Lớp: Là khuôn mẫu sinh ra các đối tượng cụ thể
 Lớp thì có:
  + Thuộc tính: dữ liệu mà các tượng có, đại diện cho đặc điểm của các đối tượng ~ biến toàn cục trong java
   ~ biến thuộc tính

  + Constructor: Là một hàm thực hiện tạo ra các đối tượng, constructor thì có tên trùng với tên lớp, và không
  có giá trị trả về, có thể có nhiều constructor
   - Khi ko khai báo constructor nào thì tự động có 1 constructor rỗng, nếu
   có constructor khác thì constructor mặc định vừa nói sẽ k còn.

   + Phương thức (Method, Hàm, Function): đại diện cho hành động của các đôi tượng
   4 tính chất trong OOP
   1. Tính đóng gói
   2. Tính ke thừa
   3. Tính đa hình
   4. Tính trừu tượng
 */