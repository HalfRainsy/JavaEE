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
    int id = 1001;//id card

    public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Person() {
        System.out.println("person");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("人吃");
    }

    public void sleep() {
        System.out.println("人睡觉");
    }

    public void sport() {
        System.out.println("人运动");
    }


}
