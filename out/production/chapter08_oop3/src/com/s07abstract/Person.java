package com.s07abstract;

/**
 * ClassName: Person
 * Package: com.s07abstract
 * Description:
 *
 * @Author Tim
 * @Create 2023/10/16 18:13
 * @Version 1.0
 */
public abstract class Person {//抽象类---意味着不能被实例化
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }
    public abstract void eat();//抽象方法----写抽象方法的前提就是整个类是abstract的。
    //{
        //System.out.println("人吃饭");
   // }

    public void sleep(){
        System.out.println("人睡觉");
    }


}
