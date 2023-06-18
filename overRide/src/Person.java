/**
 * ClassName: Person
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Tim
 * @Create 2023/6/16 22:25
 * @Version 1.0
 */
public class Person {
    String name;
    int age;

    public void eat() {
        System.out.println("人吃");
    }

    public void sleep() {
        System.out.println("人睡觉");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
