public class Main {

    public static void main(String[] args) {
        Person person = new Person(20, "Linh", "Nam"); // Đây là đối tượng
        System.out.println(person.hello()); // Truy xuất phương thức của đối tượng
        person.go("CodeGym");

//        System.out.println(person.name); // Truy xuất thuộc tính của đối tượng
//        System.out.println(person.age);
//        Person person1 = new Person();
//        // Dựa vào giá trí truyền vào để xác định constructor mà nó gọi
//        System.out.println(person1.age);
//        System.out.println(person1.name);
//        System.out.println(person1.gender);
//        Person person2 = new Person();

    }

}


// Đối tượng: là các thực the cụ thể sinh ra từ lớp.