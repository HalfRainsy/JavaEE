package test;

/**
 * ClassName: Person
 * Package: test
 * Description:
 *
 * @Author Tim
 * @Create 2023/5/22 22:12
 * @Version 1.0
 */
public class Person {
    String name;
    int age;
    char gender;
    public void study(){
        System.out.println("Studying");

    }
    public int showAge(){
        return age;
    }
    public void addAge(int addAge){
     age+=addAge;

    }
}
