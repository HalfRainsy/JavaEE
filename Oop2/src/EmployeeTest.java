/**
 * ClassName: EmployeeTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Tim
 * @Create 2023/5/18 21:15
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee();
        e1.name="Tim";
        e1.age=19;
        e1.numId=777777;
        e1.salary=7878;
        e2.name="emma";
        e2.age=23;
        e2.numId=111111;
        e2.salary=90909;
        System.out.println("员工姓名"+e1.name+"员工薪资"+e1.salary+"员工年龄"+e1.age+"员工id"+e1.numId);
        System.out.println("员工姓名"+e2.name+"员工薪资"+e2.salary+"员工年龄"+e2.age+"员工id"+e2.numId);
        //System.out.println(e2.name+e2.salary+e2.age+e2.numId);
    }
}
