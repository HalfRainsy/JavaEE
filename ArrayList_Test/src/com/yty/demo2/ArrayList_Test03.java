package com.yty.demo2;

/**
 * ClassName: ArrayList_Test03
 * Package: com.yty.demo2
 * Description:
 *
 * @Author Tim
 * @Create 2023/5/5 22:05
 * @Version 1.0
 */
public class ArrayList_Test03 {
    public static void main(String[] args) {
        //使用二维呈现出杨辉三角
        int[][] arr=new int[10][];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=new int[i+1];
            arr[i][0]=1;
            arr[i][i]=1;
            //if (i>=2){
                for (int j = 1; j <arr[i].length-1 ; j++) {//j从每行的第二个元素开始到倒数第二个元素结束
                    arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
                }
          //  }





        }


        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }


    }
}
