package equals;

import jdk.jfr.internal.tool.Main;

import java.io.File;
import java.util.Objects;

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

        String s1 = new String("hhhhh");
        String s2 = new String("hhhhh");
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

    //重写equals ----手动写
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }//相当于一个快速判断
//        if (obj instanceof User) {
//            User user = (User) obj;
//            //方式1
////            if (this.age == user.age && this.name.equals(user.name)) {
////                return true;
////            } else {
////                return false;
////            }
//            //方式2
//            return this.age == user.age && this.name.equals(user.name);
//        } else {
//            return false;
//        }
//    }

//idea自动生成
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
