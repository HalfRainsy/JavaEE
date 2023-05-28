package studentTest;

/**
 * ClassName: StudentTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Tim
 * @Create 2023/5/24 21:54
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        //创建一个String[]
        Student[] s=new Student[20];//String[] str=new String[20];
        //使用循环，给数组赋值
        for (int i = 0; i < s.length; i++) {
            s[i]=new Student();
            s[i].number=i+1;
            s[i].state=(int)(Math.random()*6+1);
            s[i].score=(int)(Math.random()*101);

        }
        //给每一个学生对象的number  status  score  赋值
       StudentUtil su=new StudentUtil();
        su.printStudentsWithIndex(s,3);
        System.out.println("-------------------------------");
        //排序前
        for (int i = 0; i <s.length ; i++) {
            System.out.println(s[i].show());
        }
        //打印出学生信息
        for (int i = 0; i < s.length-1; i++) {
            for (int j = 0; j < s.length-1-i; j++) {
                if(s[j].score>s[j+1].score){
                    Student temp=s[j];
                    s[j]=s[j+1];
                    s[j+1]=temp;
                }
            }
        }
        //排序后遍历
        for (int i = 0; i <s.length ; i++) {
            System.out.println(s[i].show());
        }

    }
}
