/**
 * ClassName: ToStringTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Tim
 * @Create 2023/7/23 22:01
 * @Version 1.0
 */
public class ToStringTest {
    public static void main(String[] args) {
        User u1=new User("Tom",12);
        System.out.println(u1.toString());
    }

}
class User{
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }
}
