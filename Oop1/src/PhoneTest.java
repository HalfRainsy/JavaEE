/**
 * ClassName: PhoneTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Tim
 * @Create 2023/5/12 12:38
 * @Version 1.0
 */
public class PhoneTest {//phone 的测试类
    public static void main(String[] args) {
        //创建phone的对象
        Phone p1 =new Phone();
        //使用手机  通过这个对象调用内部声明的属性或者方法
        //"对象.属性"  或者  "对象.方法"
        p1.name= "iphone 13 pro max";
        p1.price=9866;
        System.out.println(p1.price);
        System.out.println(p1.name);
        p1.call();
        System.out.println();
        p1.sendMessage("有内鬼，终止交易！！！");



        /*
        面向对象三步骤“
                    1：创建（设计）类。---属性   方法
                    2：创建类的对象 Phone  P1=new phone();   ---也叫做类的实例化
                    3：通过对象  调用类的属性和方法，来完成相关的功能。
                 Scanner   也是这步骤  只是Java已经内置了Scanner的对象  直接调用即可


         */
    }
}
