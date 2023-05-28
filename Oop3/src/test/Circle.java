package test;

/**
 * ClassName: Circle
 * Package: test
 * Description:
 *
 * @Author Tim
 * @Create 2023/5/22 22:40
 * @Version 1.0
 */
public class Circle {
    // 圆的面积公式为：Πr的平方
    double radius; //圆的半径

    public void findArea() {
        System.out.println("面积为" + 3.14 * radius * radius);
    }
//    public void findArea1(double r){//半径应该作为一个属性，而不应该是一个形参
//        System.out.println("面积为"+3.14 * r * r);
//    }
}
