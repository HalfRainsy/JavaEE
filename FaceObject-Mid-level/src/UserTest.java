/**
 * ClassName: UserTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Tim
 * @Create 2023/6/6 22:25
 * @Version 1.0
 */
public class UserTest {
    User u=new User();
}

class User {
    String name;
    int age;

    public User() {
        //模拟对象创建时，需要初始化
    }

    public User(String name) {
        this();//表示public user() 方法
        //模拟对象创建时，需要初始化
        this.name = name;
    }

    public User(String name, int age) {
        this(name);//调用public user(String name)方法
        //模拟对象创建时，需要初始化
        this.name = name;
        this.age = age;
    }
}
