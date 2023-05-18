/**
 * ClassName: EmployeeTest2
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Tim
 * @Create 2023/5/18 21:30
 * @Version 1.0
 */
public class EmployeeTest2 {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.name="Tom";
        e1.birthday =new MyDate();//前面有对象 就再new一个对象
        e1.birthday.year=1998;
        e1.birthday.month=2;
        e1.birthday.day=15;

        System.out.println("生日是："+e1.birthday.year+"年"+e1.birthday.month+"月"+e1.birthday.day+"日");

        Employee e2=new Employee();
    }
}
