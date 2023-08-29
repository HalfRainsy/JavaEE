package com.exer1;

/**
 * ClassName: AccountTest
 * Package: com.exer1
 * Description:
 *
 * @Author Tim
 * @Create 2023/8/29 9:57
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {
        Account acc1=new Account();
        System.out.println(acc1);
        Account acc2=new Account("123445",200);
        System.out.println(acc2);
        System.out.println("银行存款利率为："+Account.getInterestRate());
    }
}
