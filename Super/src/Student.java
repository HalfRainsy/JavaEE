/**
 * ClassName: Student
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Tim
 * @Create 2023/6/16 22:26
 * @Version 1.0
 */
public class Student extends Person {
    //    String name;
//    int age;
    String school;

    public void study() {
        System.out.println("人学习");
    }
    public void eat() {
        System.out.println("学生多吃营养食物");
    }

    public void sleep() {
        System.out.println("学生保证每天6hour睡眠");
    }
    public void show(){
        eat();//省略了this
        this.eat();

        super.eat();//不影响封装为前提
    }
}
