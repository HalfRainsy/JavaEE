/**
 * ClassName: PersonTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Tim
 * @Create 2023/7/3 22:19
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        //多态之前
        Person p1 = new Person();
        //多态性：为什么要用多态性？----遗留问题
        Person p2 = new Man();//注意  Man一定得是继承Person


    }
}
