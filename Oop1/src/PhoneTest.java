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
    }
}
