/**
 * ClassName: ExtendsTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Tim
 * @Create 2023/6/16 22:27
 * @Version 1.0
 */
public class ExtendsTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "tim";
        p1.eat();

        System.out.println(p1.getName());
        //person 的父类是object
        Student s1 = new Student();
        s1.name = "Tom";
        s1.sleep();
        //获取s1所属的类的父类
        System.out.println(s1.getClass().getSuperclass());
        //获取p1所属的类的父类
        System.out.println(p1.getClass().getSuperclass());
        System.out.println("hahahahah");

    }
}
