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

    String school;
    int id = 1002;//Student number

    public void study() {
        System.out.println("人学习");
    }

    public void eat() {
        System.out.println("学生多吃营养食物");
    }

    public void sleep() {
        System.out.println("学生保证每天6hour睡眠");
    }

    public void show() {
        eat();//省略了this
        this.eat();//在本类找
            //eat()   与 this.eat()一致
        super.eat();//不影响封装为前提
    }

    public void show1() {
        super.sport();//直接在父类找
    }

    public void show2() {
        System.out.println(id);//具有所谓的就近原则   所以输出1002
        System.out.println(super.id);//直接在父类找  越过本类 所以输出1001
    }

    public void show3() {
        System.out.println(name);//1
        System.out.println(this.name);//2    ----1与2是一致的
        System.out.println(super.name);
    }


    //super形参列表
    public Student() {
        super();
        System.out.println("student..");
    }

    public Student(String name, int age) {
            super(name,age);
    }
}
