package com.s04.threadsafemore.deadlock.singleton;

/**
 * ClassName: BankTest
 * Package: com.s04.threadsafemore.deadlock.singleton
 * Description:
 * 实现线程安全的懒汉式
 *
 * @Author Tim
 * @Create 2023/11/1 10:02
 * @Version 1.0
 */
public class BankTest {
    static Bank b1 = null;
    static Bank b2 = null;
    static Bank b3 = null;

    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                b1 = Bank.getInstance();
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                b2 = Bank.getInstance();
            }
        };
        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1 == b2);

    }
}

class Bank {
    private Bank() {
    }

    private static volatile Bank instance = null;//volatile避免指令重排

    //    public static synchronized Bank getInstance() {//同步监视器，默认为类本身
//        if (instance == null) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            instance = new Bank();
//        }
//        return instance;
//    }
//    public static Bank getInstance() {//同步监视器，默认为类本身
//        synchronized (Bank.class) {
//            if (instance == null) {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                instance = new Bank();
//            }
//
//        }
//        return instance;//return 放在外面会更好一点
//    }
    //第三种
    public static Bank getInstance() {//同步监视器，默认为类本身
        if (instance == null) {


            synchronized (Bank.class) {
                if (instance == null) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instance = new Bank();
                }
            }
        }
        return instance;//return 放在外面会更好一点
    }


}