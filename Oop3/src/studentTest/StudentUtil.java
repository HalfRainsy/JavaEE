package studentTest;

/**
 * ClassName: StudentUtil
 * Package: studentTest
 * Description:
 *
 * @Author Tim
 * @Create 2023/5/25 21:31
 * @Version 1.0
 */
public class StudentUtil {
    /*
    打印指定年级的信息
     */
    public void printStudentsWithIndex(Student[] students,int states){
        for (int i = 0; i <students.length ; i++) {
            if(states==students[i].state){
                Student stu = students[i];
                //  System.out.println("number是："+stu.number+"，班级是："+stu.state+"，成绩是:"+stu.score);
                System.out.println(stu.show());

            }
        }
    }





}
