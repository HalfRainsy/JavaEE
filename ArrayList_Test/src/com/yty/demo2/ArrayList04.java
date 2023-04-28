package com.yty.demo2;

/**
 * ClassName: ArrayList04
 * Package: com.yty.demo2
 * Description:
 *
 * @Author Tim
 * @Create 2023/4/28 13:24
 * @Version 1.0
 */
public class ArrayList04 {
    public static void main(String[] args) {
        //数组元素的默认初始化值
        /*
            外层元素的默认存储地址值。包含了数据的类型
            内层元素的默认与一维数组元素不同类型的默认值规定相同。
            整型：0
            浮点型：0.0
            字符型：0
            Boolean：false
            引用数据类型：null
         */
        int[][] arr1=new int[5][7];
        //1:外层元素默认值
        System.out.println(arr1[1]);//[I@1b6d3586
        System.out.println(arr1[0]);//[I@4554617c
        //1-1：内层元素
        System.out.println(arr1[0][1]);//0

        boolean[][] arr2=new boolean[3][9];
        System.out.println("arr2外层循环默认值："+arr2[1]);//[Z@74a14482
        System.out.println("arr2外层循环默认值："+arr2[0]);//[Z@1540e19d
        System.out.println("arr2内层循环默认值："+arr2[0][2]);//false

        String[][] arr3=new String[9][10];
        System.out.println("arr3外层循环默认值："+arr3[1]);//[Ljava.lang.String;@677327b6
        System.out.println("arr3外层循环默认值："+arr3[0]);//[Ljava.lang.String;@14ae5a5
        System.out.println("arr3内层循环默认值："+arr3[0][2]);//null
        System.out.println();
        //以动态初始化
        int[][] arr14=new int[4][];
        System.out.println("arr14外层循环默认值："+arr14[0]);//null
       // System.out.println("arr14内层循环默认值"+arr14[0][0]);//空指针报错   NullPointerException----空指针
        String[][] arr5=new String[5][];
        System.out.println("arr5外层循环默认值："+arr5[0]);
        //System.out.println("arr5内层循环默认值："+arr5[0][0]);//空指针报错   NullPointerException----空指针
    }
}
