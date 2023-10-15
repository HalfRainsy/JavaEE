package com.block;

/**
 * ClassName: BlcakTest
 * Package: com.block
 * Description:
 *
 * @Author Tim
 * @Create 2023/10/7 9:53
 * @Version 1.0
 */
public class BlockTest {
    public static void main(String[] args) {
        System.out.println(Person.info);
        Person p1 = new Person();
      //  Person p2 = new Person();
        p1.eat();
    }
}

class Person {
    String name;
    int age;
    static  String info="我是一个人";

    public void eat() {
        System.out.println("人吃饭");
        System.currentTimeMillis();//获取系统当前时间
    }

    public Person() {//构造器

    }

    {
        //代码块--非静态代码块
        System.out.println("非静态代码块");

    }
    {
        //代码块--非静态代码块
        System.out.println("非静态代码块2");

    }

    static {
        //静态代码块
        System.out.println("静态代码块");
    }
    static {
        //静态代码块
        System.out.println("静态代码块2");
    }
}

