/**
 * ClassName: TriAngle
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Tim
 * @Create 2023/6/4 21:24
 * @Version 1.0
 */
public class TriAngle {
    private double base;
    private double height;

    public TriAngle() {

    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public TriAngle(double b, double h) {
        base = b;
        height = h;
    }
    public double findArea(){
        return base *height /2;
    }
}
