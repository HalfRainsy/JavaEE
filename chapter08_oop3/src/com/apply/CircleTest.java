package com.apply;

/**
 * ClassName: CircleTest
 * Package: com.apply
 * Description:
 *
 * @Author Tim
 * @Create 2023/8/29 9:38
 * @Version 1.0
 */
public class CircleTest {

    public static void main(String[] args) {
        Circle c1=new Circle();
        System.out.println(c1);
        Circle c2=new Circle();
        System.out.println(c2);
        Circle c3=new Circle();
        System.out.println(c3);
        System.out.println(Circle.total);
        Circle c4=new Circle(2.5);
        System.out.println(c4);
    }
}
class Circle{
     double radius;//实例变量

     int id;

    static int total;//创建circle的具体的个数

    public Circle(){
        this.id=init;
        init++;
        total++;
    }
    public Circle(double radius){
        this();
        this.radius=radius;

    }
    public static int init=1001;//自动给id赋值的基数

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", id=" + id +
                '}';
    }
}
