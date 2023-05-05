package com.yty.demo2;

/**
 * ClassName: ArrayList_Test02
 * Package: com.yty.demo2
 * Description:
 *
 * @Author Tim
 * @Create 2023/5/5 21:53
 * @Version 1.0
 */
public class ArrayList_Test02 {
    public static void main(String[] args) {
        int[] arr1=new int[]{5,4,6,8,9,0,1,2,7,3};
        int sum=arr1[0];

        int max=arr1[0];

        int min =arr1[0];
        for (int i = 1; i < arr1.length ; i++) {
            sum+=arr1[i];//累加的总分
            if (max<arr1[i]){//判断最高分
                max = arr1[i];
            }
            if (min >arr1[i]){//判断最低分
                min=arr1[i];
            }
        }

        int avg= (sum- max -min )/ (arr1.length -2);
        System.out.println("去掉最高/最低分，平均分为："+avg);
    }
}
