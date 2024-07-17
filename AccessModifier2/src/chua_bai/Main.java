package chua_bai;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4.5);
        System.out.println(circle);
        System.out.println("Bán kính lớn nhất là " + Circle.maxRadius);
        Circle circle2 = new Circle(7.5);
        System.out.println(circle2);
        System.out.println("Bán kính lớn nhất là " + Circle.maxRadius);
        System.out.println("Tổng diện tích là: " + Circle.sumS);
    }
}
