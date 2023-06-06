/**
 * ClassName: PersonTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Tim
 * @Create 2023/6/6 22:07
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person P1 = new Person();
        System.out.println(P1.age = 10);
    }
}

class Person {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    int age;

    public void setAge(int age) {
        this.age = age;
    }
}
