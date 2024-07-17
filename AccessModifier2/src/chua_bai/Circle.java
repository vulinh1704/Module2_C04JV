package chua_bai;

public class Circle {
    private int id;
    private double radius;
    public static double PI = 3.14;
    public static double maxRadius = 0;
    public static int idIncrement = 1;
    public static double sumS = 0;

    public Circle(double radius) {
        this.id = idIncrement;
        this.radius = radius;
        if (radius > maxRadius) {
            maxRadius = radius;
        }
        sumS += getS();
        idIncrement++;
    }

    public double getS() {
        return this.radius * PI * this.radius;
    }

    // 2 hàm tính diện tích và chu vi th non-static vì ăn theo đôí tượng

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle: id - " + this.id + " ; Radius: " + this.radius;
    }
}
