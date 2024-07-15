package main;

import person.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Linh", 1);
        System.out.println(person.name);
//        System.out.println(person.id);
        System.out.println(person.go());
//        System.out.println(person.age);
//        System.out.println(person.money);
        // Lỗi: Vì Main khác package với person và không có quan hế kế thừa với person

    }
}
