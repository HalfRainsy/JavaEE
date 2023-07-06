package exer1;

/**
 * ClassName: Circle
 * Package: exer1
 * Description:
 *
 * @Author Tim
 * @Create 2023/7/6 22:29
 * @Version 1.0
 */
public class Circle extends GeometricObject {
    private double radius;//半径


    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return 2.14 * radius * radius;
    }
}
