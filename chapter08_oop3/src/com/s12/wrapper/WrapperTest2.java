package com.s12.wrapper;

import org.junit.Test;

/**
 * ClassName: WrapperTest2
 * Package: com.s12.wrapper
 * Description:
 *
 * @Author Tim
 * @Create 2023/10/23 15:45
 * @Version 1.0
 */
public class WrapperTest2 {
    /*
    基本数据类型--->String
    String  --->基本数据类型:调用包装类的静态方法

     */
    @Test
    public void Test1(){
        int i1=10;
        String str1=String.valueOf(i1);
        System.out.println(str1);//10


        String s2=i1+"";
        System.out.println(s2);


    }
    @Test
    public void Test2(){
        String s1="123";
        int i1=Integer.parseInt(s1);
        System.out.println(i1);
    }
}
