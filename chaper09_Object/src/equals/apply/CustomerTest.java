package equals.apply;

/**
 * ClassName: CustomerTest
 * Package: equals.apply
 * Description:
 *
 * @Author Tim
 * @Create 2023/7/18 22:54
 * @Version 1.0
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer cu=new Customer("Tom",12,new Account(2000));
        Customer c2=new Customer("Tom",12,new Account(2000));
        System.out.println(cu.equals(c2));//false
        //注意！Account和Customer两个类都要重写equals。否则比较的还是地址值。
    }
}
