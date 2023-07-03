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
        /*
        多态的应用：虚拟方法调用
        在多态的场景下，调用方法时
            编译时认为方法是左边声明的时父类的类型，
            执行时，实际执行的是子类重写父类的方法。
            简称为：编译看左边，运行看右边
         */
        p2.eat();
        //测试属性的是否满足多态性？
        System.out.println(p2.name);

    }
}
