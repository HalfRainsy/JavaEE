package com.yty.demo1;

import java.util.Scanner;

/**
 * ClassName: ArrayList02
 * Package: com.yty.demo1
 * Description:
 *
 * @Author Tim
 * @Create 2023/4/27 22:41
 * @Version 1.0
 */
public class ArrayList02 {
    public static void main(String[] args) {

        //练习2升级版
        Scanner scan1=new Scanner(System.in);
        System.out.println("请输入学生人数");
        int count=scan1.nextInt();
        int[] score=new int[count];
        int max=0;
        System.out.println("请输入"+count+"个学生的成绩");
        for (int i = 0; i < count; i++) {
            score[i]=scan1.nextInt();
            if (max<score[i]){
                max=score[i];
            }
        }

              System.out.println("最高分是："+max);
        char grade;
        for (int i = 0; i < score.length; i++) {
            if (score[i]>=max-10){
               // System.out.println("student"+i+" score is"+score[i]+" grade is A");
                grade='A';
            } else if (score[i]>=max-20) {
             //   System.out.println("student"+i+" score is"+score[i]+" grade is B");
                grade='B';
            } else if (score[i]>=max-30) {
                //System.out.println("student"+i+" score is"+score[i]+" grade is C");
                grade='C';
            } else {
                grade='D';
            }
            System.out.println("student"+i+" score is "+score[i]+" grade is "+grade);
        }
        scan1.close();
    }
}
