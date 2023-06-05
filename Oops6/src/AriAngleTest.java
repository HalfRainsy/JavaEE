/**
 * ClassName: AriAngleTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Tim
 * @Create 2023/6/4 21:26
 * @Version 1.0
 */
public class AriAngleTest {
    public static void main(String[] args) {
        TriAngle ta=new TriAngle(); //已经有空参的构造器   所以已经变回有默认值的。
        ta.setHeight(2.3);
        ta.setBase(4.5);
        System.out.println("面积为："+ta.findArea());

        TriAngle ta2=new TriAngle(4.5,6.7);
         System.out.println("底边长为："+ta2.getBase());
         System.out.println("高为："+ta2.getHeight());
        System.out.println("面积2为："+ta.findArea());
    }
}
