package com.yty.demo2;

/**
 * ClassName: ArrayList05
 * Package: com.yty.demo2
 * Description:
 *
 * @Author Tim
 * @Create 2023/4/28 22:26
 * @Version 1.0
 */
public class ArrayList05 {
    public static void main(String[] args) {
        //1:获取arr数组中所有元素的和-------使用for循环来实现

        //① 初始化数组
        int[][] arr=new int[][]{{3,5,8},{12,9},{7,0,6,4}};
        int sum=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
            sum+=arr[i][j];
            }
        }
        System.out.println("总和为："+sum);



        //--------------------------第一问结束

        /*
        2：声明 int[] x,y[];再给xy赋值以后，一下选项允许通过的是：
        1：x[0]=y;
        2:y[0]=x;
        3:y[0][0]=x;
        4:x[0][0]=y;
        5:y[0][0]=x[0];
        6:x=y;
         */
        /*
        本题考查“=” 赋值符号
        int i=10;
        int j=i;

        byte b=(byte)i;//强制类型转换
        long l=i;//自动类型提升
        int[] arr1=new int[10];
        byte[] arr2=new byte[20];
        arr1=arr2;--------这一行是错误的 因为不仅仅有位置的比较，更有类型的比较
                  --------int[] byte[] 是两种不同类型的引用变量
         --------------------------总结------------------------------------
            数组的互相赋值 类型和维度得一直才能互相赋值，否则编译不通过
         */
        String[][] employees = {
                {"10", "1", "段 誉", "22", "3000"},
                {"13", "2", "令狐冲", "32", "18000", "15000", "2000"},
                {"11", "3", "任我行", "23", "7000"},
                {"11", "4", "张三丰", "24", "7300"},
                {"12", "5", "周芷若", "28", "10000", "5000"},
                {"11", "6", "赵 敏", "22", "6800"},
                {"12", "7", "张无忌", "29", "10800","5200"},
                {"13", "8", "韦小宝", "30", "19800", "15000", "2500"},
                {"12", "9", "杨 过", "26", "9800", "5500"},
                {"11", "10", "小龙女", "21", "6600"},
                {"11", "11", "郭 靖", "25", "7100"},
                {"12", "12", "黄 蓉", "27", "9600", "4800"}
        };
        System.out.println("员工类型\t编号\t姓名\t\t年龄\t薪资\t奖金\t\t股票");
        for (int i = 0; i < employees.length; i++) {
         String employeesType=   employees[i][0];
            switch (employeesType){
                case "10":
                    System.out.print("普通职员\t");
                    break;
                case "11":
                    System.out.print("程序员\t");
                break;
                case "12":
                    System.out.print("设计师\t");
                    break;
                case "13":
                    System.out.print("架构师\t");
                    break;
            }
            for (int j = 1; j <employees[i].length ; j++) {
                System.out.print(employees[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
