public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal("Cookie", 1);
//        System.out.println(animal.getName());
//        animal.setName("Tom");
//        System.out.println(animal.getName());

        System.out.println(School.quantitySchool);
        School s = new School();
        System.out.println(School.quantitySchool);
        School.quantitySchool = 10;
        System.out.println(School.quantitySchool);
        School.hello();
    }
}
