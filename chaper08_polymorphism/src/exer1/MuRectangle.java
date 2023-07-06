package exer1;

/**
 * ClassName: MuRectangle
 * Package: exer1
 * Description:
 *
 * @Author Tim
 * @Create 2023/7/6 22:32
 * @Version 1.0
 */
public class MuRectangle extends GeometricObject {
    private double width;
    private double height;

    public MuRectangle(String color, double weight, double width) {
        super(color, weight);
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double findArea() {
        return width * height;
    }
}
