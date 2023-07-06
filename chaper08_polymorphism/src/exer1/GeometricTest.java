package exer1;

/**
 * ClassName: GeometricTest
 * Package: exer1
 * Description:
 *
 * @Author Tim
 * @Create 2023/7/6 22:35
 * @Version 1.0
 */
public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();
        Circle c1 = new Circle("red", 1.0, 2.3);
        Circle c2 = new Circle("red", 1.0, 3.3);
        test.displayGeoMetricObject(c1);
        test.displayGeoMetricObject(c2);
    }

    /*
    两个几何图形的面积是否相等
    true 面积相等
    相反 面积不相等
     */
    public boolean equalIsArea(GeometricObject g1, GeometricObject g2) {
        return g1.findArea() == g2.findArea();
    }

    /*
    显示几何图形的面积
     */
    public void displayGeoMetricObject(GeometricObject g) {
        System.out.println("几何图形的面积为：" + g.findArea());
    }
}
