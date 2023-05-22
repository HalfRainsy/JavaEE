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
    public int addAge(int age){
      int i=  age=+2;
        return i;
    }
}
