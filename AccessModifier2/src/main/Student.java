package main;

import person.Person;

public class Student extends Person {

    public Student(String name, int id) {
        super(name, id);
    }

    public void study() {
        System.out.println(money); // Sử dụng money của lớp cha
    }
}
