/**
 * ClassName: Employee
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Tim
 * @Create 2023/5/22 21:52
 * @Version 1.0
 */
public class Employee {
    int id;
    String name;
    int age;
    double salary;
    public void show(){
        System.out.println("id:"+id+",name:"+name+",age:"+age+",salary:"+salary);
    }
    public String show1(){
        return "这是一个展示1";
    }
}
