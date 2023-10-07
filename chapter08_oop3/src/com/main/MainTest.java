package com.main;

/**
 * ClassName: MainTest
 * Package: com.main
 * Description:
 *
 * @Author Tim
 * @Create 2023/10/7 9:37
 * @Version 1.0
 */
public class MainTest {
    public static void main(String[] args) {//程序入口
        String[] arr=new String[]{"11","22","33"};
        Main.main(arr);
    }
}
class Main{
    public static void main(String[] args) {//看作普通的静态方法
        System.out.println("Main的amin的调用");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}