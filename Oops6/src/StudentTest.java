/**
 * ClassName: StudentTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Tim
 * @Create 2023/6/3 23:30
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        Student stu = new Student("Tim", 27, "郑州航空工业管理学院", "计算机科学与技术");
        System.out.println(stu.getInfo());
        Student stu1 = new Student("Tom", 16);
        System.out.println(stu1.getInfo());
        Student stu2 = new Student("Eva", 17, "哥伦比亚大学");
        System.out.println(stu2.getInfo());
    }
}
