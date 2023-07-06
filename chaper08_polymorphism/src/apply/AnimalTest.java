package apply;

/**
 * ClassName: AnimalTest
 * Package: apply
 * Description:
 *
 * @Author Tim
 * @Create 2023/7/4 22:12
 * @Version 1.0
 */
public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest an = new AnimalTest();
        an.func(new Cat());
        an.func(new Dog());
    }

    public void func(Animal animal) {

        animal.eat();
        animal.jump();

    }
}

class Animal {
    public void eat() {
        System.out.println("动物进食");
    }

    public void jump() {
        System.out.println("动物跳");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("狗进食");
    }

    public void jump() {
        System.out.println("狗跳墙");
    }

    public void watchDoor() {
        System.out.println("看家");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("猫进fish");
    }

    public void jump() {
        System.out.println("猫跳树");
    }

    public void catchM() {
        System.out.println("抓老鼠");
    }
}