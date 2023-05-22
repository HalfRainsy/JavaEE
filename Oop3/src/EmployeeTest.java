/**
 * ClassName: EmployeeTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Tim
 * @Create 2023/5/22 21:55
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.id=1;
        e1.age=21;
        e1.name="Tim";
        e1.salary=1333;
        e1.show();

        System.out.println(e1.show1());
    }
}
