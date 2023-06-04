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
        ta.setHeight(4.5);
        System.out.println(ta.findArea());
    }
}
