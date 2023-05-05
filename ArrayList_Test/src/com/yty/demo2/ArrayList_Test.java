package com.yty.demo2;

/**
 * ClassName: ArrayList_Test
 * Package: com.yty.demo2
 * Description:
 *
 * @Author Tim
 * @Create 2023/5/5 21:38
 * @Version 1.0
 */
public class ArrayList_Test {
    public static void main(String[] args) {
        /*常见的算法 ---特征值的计算
        涉及到：平均值   最大值  最小值  总和等
         */
        //1；创建数组  --动态

        int[] arr1=new int[10];
        //2；通过循环给数组元素赋值
        for (int i = 0; i <arr1.length ; i++) {
            arr1[i]=(int)( Math.random()*(99-10+1))+10;
            System.out.println(arr1[i]);
        }
        //3；求特征值  --最大值  最小值 总和  平均值
            //最大值
        int max=arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (max<arr1[i]){
                max=arr1[i];
            }
        }
        System.out.println("最大值为："+max);
        //最小值
        int min=arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (min>arr1[i]){
                min=arr1[i];
            }
        }
        System.out.println("最小值为："+min);
        //总和
        int sum=0;
        for (int i = 0; i < arr1.length; i++) {
                sum+=arr1[i];

        }
        System.out.println("总和为："+sum);


        //平均值   sum
        int avgValue=sum / arr1.length;
        System.out.println("平均值为："+avgValue);
        /*
        数组的扩容和缩容
         */

        /*
        数组元素的查找

        ---顺序查找
        ---二分法查找
         */
        /*
        数组的排序
         */

    }

}
