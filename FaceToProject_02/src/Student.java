import com.sun.org.apache.xalan.internal.xsltc.dom.SortingIterator;

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

//    public void eat(){
//        System.out.println("人吃");
//    }
//    public void sleep(){
//        System.out.println("人睡觉");
//    }
public void show1(){
    System.out.println("age:"+getAge()+"岁");
}
}
