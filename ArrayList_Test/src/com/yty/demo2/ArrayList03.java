package com.yty.demo2;

/**
 * ClassName: ArrayList03
 * Package: com.yty.demo2
 * Description:
 *
 * @Author Tim
 * @Create 2023/4/28 12:31
 * @Version 1.0
 */
public class ArrayList03 {

    public static void main(String[] args) {
        //二维数组  格式实例
        int[] [] temp=new int[][]{{12,24,25},{25,69,98}};
        //- 对于二维数组的理解，可以看成是一维数组array1又作为另一个一维数组array2的元素而存在。
        //- 其实，从数组底层的运行机制来看，其实没有多维数组。
        //1。声明
        int[] arr1=new int[]{1,2,3};  //一维静态初始化  数组变量和元素的赋值，两步同时进行
        int[] [] arr2=new int[][]{{1,2,3},{4,5,6},{7,8,9}};//二维静态初始化
        //动态赋值
        int[] arr3=new int[3];
        //动态初始化方式1
        int[] [] arr4=new int[3][2];
                //数组的外层元素
                //数组的内层元素
        //动态初始化方式2
        double[] [] arr5=new double[1] [];
        //其他正确写法   ---中括号正确的存放位置
        int[] [] arr6=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[]  arr7[]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};//平时没人这样写  会被误以为是一维数组
        int[] [] arr8={{1,2,3},{4,5,6},{7,8,9}};//类型推断
        /*
        其他正确写法在其他类型中同样适用
         */


        //元素的调用
        // 外层元素{1,2,3},{4,5,6},{7,8,9}    内层元素 1,2,3   4,5,6  7,8,9
        //注意：{1,2,3}代表的是一个外层元素  而7,8,9 则代表的是内层元素的三个元素
        //调用得说清楚  是调内层还是调外层元素
        int[] [] arr9=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(arr9[0][0]);//这一行代表 调用第一个外层元素的第一个内层元素
        System.out.println(arr9[2][0]);//这一行代表 调用第3个外层元素的第一个内层元素
        //调用外层
        System.out.println(arr2[0]);//这个打印出地址位置 指向了外层的第一个元素{1,2,3}
        //测试String和double类型
        String[][] arr10=new String[2][3];
        arr10[0][2]="Tom";
        System.out.println(arr10[0][2]);
        double[][] arr11=new double[2][];
        arr11[0]=new double[4];
        arr11[0][0]=1.0;


        //数组的长度
        int[] [] arr12=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(arr12.length);//输出数组的长度
        System.out.println(arr12[2].length);

        //如何遍历数组 !
        int[] [] arr13=new int[][]{{1,2,3},{4,5,6},{7,8}};
        for (int i = 0; i < arr13.length; i++) {
            for (int j=0;j<arr13[i].length;j++){//最重要的就是j小于多少
                System.out.print(arr13[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
