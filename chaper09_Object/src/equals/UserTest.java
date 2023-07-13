package equals;

import jdk.jfr.internal.tool.Main;

import java.io.File;

/**
 * ClassName: UserTest
 * Package: equals
 * Description:
 *
 * @Author Tim
 * @Create 2023/7/13 22:09
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        User u1 = new User("tom", 12);
        User u2 = new User("tim", 19);
        System.out.println(u1.equals(u2));

        String s1=new String("hhhhh");
        String s2=new String("hhhhh");
        System.out.println(s1.equals(s2));
//        File f1=new File();
    }
}

class User {
    String name;
    int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
