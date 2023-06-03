package test;

import java.util.Scanner;

/**
 * ClassName: EmployeeTest
 * Package: test
 * Description:
 *
 * @Author Tim
 * @Create 2023/6/2 21:46
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] emps=new Employee[2];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < emps.length; i++) {
            emps[i]=new Employee();
            System.out.println("---------------添加第"+(i+1)+"个员工------------------");
            System.out.print("请输入姓名");
            String name=sc.next();
            System.out.print("请输入性别");
            char gender=sc.next().charAt(0);
            System.out.print("请输入年龄");
            int age=sc.nextInt();
            System.out.print("请输入电话");
            String phoneNumber=sc.next();
            emps[i].setName(name);
            emps[i].setGender(gender);
            emps[i].setAge(age);
            emps[i].setPhoneNumber(phoneNumber);
        }
        System.out.println("--------------------员工列表-----------------------------");
        System.out.println("编号\t\t姓名\t性别\t年龄\t电话");
        for (int i = 0; i < emps.length; i++) {
            System.out.println((i+1)+emps[i].showInfo());
        }
        System.out.println("--------------------员工列表完成-----------------------------");
    }
}
