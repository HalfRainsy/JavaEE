package equals.exer1;

/**
 * ClassName: orderTest
 * Package: equals.exer1
 * Description:
 *
 * @Author Tim
 * @Create 2023/7/18 23:01
 * @Version 1.0
 */
public class orderTest {
    public static void main(String[] args) {
        Order o1=new Order(1001,"Tim");
        Order o2=new Order(1001,"Tim");
        System.out.println(o1.equals(o2));
        //测试s
    }
}
