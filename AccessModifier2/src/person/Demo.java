package person;

public class Demo {
    public static void main(String[] args) {
        Person person = new Person("Tùng" , 3);
        System.out.println(person.age);
        person.sleep();
        System.out.println(person.money);
    }
}
