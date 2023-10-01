package com.singleton;

/**
 * ClassName: BankTest
 * Package: com.singleton
 * Description:
 *
 * @Author Tim
 * @Create 2023/10/1 8:55
 * @Version 1.0
 */
public class BankTest {
    public static void main(String[] args) {
        Bank b = Bank.getInstance();
    }
}

//饿汉式
class Bank {
    //1.类的构造器私有化
    private Bank() {

    }

    //2.在类的内部创建当前类的实例
    private static Bank instance = new Bank();

    //3.使用get方法获取当前类的实例，必须声明为static。
    //4.此属性也声明为static。
    public static Bank getInstance() {
        return instance;
    }

}