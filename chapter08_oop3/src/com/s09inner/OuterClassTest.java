package com.s09inner;

/**
 * ClassName: OuterClassTest
 * Package: com.s09inner
 * Description:
 *
 * @Author Tim
 * @Create 2023/10/19 9:27
 * @Version 1.0
 */
public class OuterClassTest {
    public static void main(String[] args) {
        //1.创建Person的静态的成员内部类的实例
        Person.Dog d = new Person.Dog();
        d.eat();
        //2.创建Person的非静态的成员内部类的实例
        Person p = new Person();
        Person.Bird p1 = p.new Bird();
        p1.eat();
        p1.show("小鸟");
        p1.show1();
    }


}

class Person {
    String name = "Tim";
    int age = 1;

    //静态内部类
    static class Dog {

        public void eat() {
            System.out.println("吃骨头");
        }

    }

    //非静态内部类
    class Bird {
        String name = "啄木鸟";

        public void eat() {
            System.out.println("吃虫子");
        }

        public void show(String name) {
            System.out.println("age=" + age);
            System.out.println("name=" + name);
            System.out.println("name=" + this.name);
            System.out.println("name=" + Person.this.name);
        }
        public void show1(){
            eat();
            this.eat();
        }
    }

    public void method() {
        //局部内部类
        class InnerClass1 {

        }
    }

    public Person() {
        //局部内部类
        class InnerClass2 {

        }
    }


}