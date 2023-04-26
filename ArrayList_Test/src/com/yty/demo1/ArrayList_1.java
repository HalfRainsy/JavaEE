package com.yty.demo1;

/**
 * ClassName: ArrayList_1
 * Package: com.yty.demo1
 * Description:
 *
 * @Author Tim
 * @Create 2023/4/25 21:02
 * @Version 1.0
 */
public class ArrayList_1 {
    public static void main(String[] args) {
        System.out.println("hahahaha");
        //数据类型变量、

        int num1=10;
        int num2=20;
        //声明数组
        double[] princes;
        //数组初始化  静态数组
        princes= new double[]{20,31,44,76};//赋值


        String[] foods;
        foods=new String[]{"拌海蜇","小猪盖被","烧鸡","烤鹅"};
        System.out.println(foods[2]);

        //数组的声明和初始化   动态数组  以及初始化
        //数组一旦初始化完成，长度确定且不能更改。
        /*String[] foods;
        foods=new String[4];
        foods[0]="拌海蜇";
        foods[1]="小猪盖被";
        foods[1]="烧鸡";
        foods[1]="烤鹅";
        System.out.println(foods);

         */
        int arr[]=new int[4];
        int[] arr1={1234};
        //数组元素的调用
        System.out.println(arr1[0]);
        //数组的长度  用来描述数组中容量的大小
        //使用length属性表示
        System.out.println(arr1.length);
        //如何遍历数组
        for (int i=0;i<foods.length;i++){
            System.out.println(foods[i]);
        }
        //fori.  //for循环快捷键

    }
}
