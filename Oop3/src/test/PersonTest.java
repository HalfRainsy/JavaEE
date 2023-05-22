package test;

/**
 * ClassName: PersonTest
 * Package: test
 * Description:
 *
 * @Author Tim
 * @Create 2023/5/22 22:15
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.name="Tim1";
        p1.age=20;
        System.out.println(p1.study());
        System.out.println(p1.showAge());
        System.out.println(p1.age+p1.addAge(2));
    }
}
