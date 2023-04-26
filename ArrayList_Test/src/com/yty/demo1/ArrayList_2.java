package com.yty.demo1;

/**
 * ClassName: ArrayList_2
 * Package: com.yty.demo1
 * Description:
 *
 * @Author Tim
 * @Create 2023/4/25 21:12
 * @Version 1.0
 */
public class ArrayList_2 {
    public static void main(String[] args) {
       //数组元素的默认初始化值
        int[]  arr1=new int[3];
        System.out.println(arr1[0]);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        //根据不同的数组类型而分
        //整型
        //浮点型认初始化值：0.0
        double[] arr3=new double[5];
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
        //字符型 默认初始化值：0   or 理解为： \u00000

        char[] arr44=new char[4];
        if (arr44[0]==0){
            System.out.println("是数字0");
        }
        if (arr44[0]=='0'){
            System.out.println("是字符0");
        }
        if (arr44[0]=='\u0000'){
            System.out.println("是字符02");
        }
        for (int i = 0; i < arr44.length; i++) {
            System.out.println(arr44[i]);
        }


        //Boolean  默认数值类型：false
        boolean[] arr5=new boolean[4];
        for (int i = 0; i < arr5.length; i++) {
            System.out.println("boolea:"+arr5[i]);
        }
        //引用数据类型 m默认数值为：null
        String[] arr6=new String[10];
        for (int i = 0; i < arr6.length; i++) {
            System.out.println("String:"+arr6[i]);
        }
    }
}
