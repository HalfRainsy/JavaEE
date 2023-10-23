package com.s12.wrapper;

import org.junit.Test;

/**
 * ClassName: WrapperTest
 * Package: com.s12.wrapper
 * Description:
 *
 * @Author Tim
 * @Create 2023/10/23 11:55
 * @Version 1.0
 */
public class WrapperTest {
    @Test
    public void test1(){
    int i=10;
    Integer ii=new Integer(i);
        System.out.println(i);
    }


    @Test
    public void test2(){
        int ii=23;
        Integer iii=Integer.valueOf(ii);
        System.out.println(iii);
        Boolean b=Boolean.valueOf(true);
        System.out.println(b);

        Integer i1=new Integer(11);
        int iiii=i1.intValue();
        System.out.println(iiii);
    }
    @Test
    public void test3(){
        Account account = new Account();
        System.out.println(account.isFlag);
        System.out.println(account.isFlag2);

    }
    @Test
    public void test5(){
       int i1=10;
       Integer ii1=i1;//自动装箱
       Integer ii2=ii1+1;
        System.out.println(ii2);
    }


}
class Account{
    boolean isFlag;
    Boolean isFlag2;
}