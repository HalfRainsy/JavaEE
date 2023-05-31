/**
 * ClassName: AnimalTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Tim
 * @Create 2023/5/31 22:30
 * @Version 1.0
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.name = "Cat";
        // a1.legs = 4;
        a1.setLegs(-2);
        System.out.println("name是" + a1.name + ",腿数：" + a1.getLegs());
        a1.eat();
    }
}

class Animal {
    String name;
    private int legs;

    public void setLegs(int l) {
        if (l >= 0 && l % 2 == 0) {
            legs = l;
        } else {
            System.out.println("输入非法");
        }
    }

    public int getLegs() {
        return legs;
    }

    public void eat() {
        System.out.println("吃饭");
    }
}