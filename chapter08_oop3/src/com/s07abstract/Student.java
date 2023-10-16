package com.s07abstract;

/**
 * ClassName: Student
 * Package: com.s07abstract
 * Description:
 *
 * @Author Tim
 * @Create 2023/10/16 18:15
 * @Version 1.0
 */
public class Student extends Person {
    String school;

    public Student() {

    }

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }


    public void eat() {
        System.out.println("学生吃营养餐");
    }

    public void sleep() {
        System.out.println("学生保持8h睡眠");
    }
}





