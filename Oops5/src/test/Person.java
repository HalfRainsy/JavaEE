package test;

/**
 * ClassName: Person
 * Package: test
 * Description:
 *
 * @Author Tim
 * @Create 2023/6/1 23:38
 * @Version 1.0
 */
public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int ages) {
        if (ages >= 0 && ages <= 130) {
            ages = age;
            System.out.println(ages);
        } else {
            System.out.println("输入非法");
        }
    }
}
