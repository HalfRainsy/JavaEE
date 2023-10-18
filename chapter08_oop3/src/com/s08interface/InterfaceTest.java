package com.s08interface;

/**
 * ClassName: InterfaceTest
 * Package: com.s08interface
 * Description:
 *
 * @Author Tim
 * @Create 2023/10/18 8:28
 * @Version 1.0
 */
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.Max_Speed);
    }

}

interface Flyable {
    public static final int MIn_Speed = 0;
    public static final int Max_Speed = 7200;//也可以不写pub...

    void fly();//可以省略public abstract

}

interface Attackable {

}

class Plane implements Flyable {

    @Override
    public void fly() {
        System.out.println("飞机飞行");
    }
}

//测试接口的继承关系
interface AA {
    void method1();
}

interface BB {
    void method22();

}

interface CC extends AA, BB {
void method33();
}

class DD implements CC {

    @Override
    public void method1() {

    }

    @Override
    public void method22() {

    }

    @Override
    public void method33() {

    }
}

