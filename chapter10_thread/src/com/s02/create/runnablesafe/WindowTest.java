package com.s02.create.runnablesafe;

/**
 * ClassName: WindowTest
 * Package: com.s02.create.notsafe
 * Description:
 * 使用同步代码块解决买票中的线程安全问题。
 *
 * @Author Tim
 * @Create 2023/10/25 10:46
 * @Version 1.0
 */
class SaleTicket implements Runnable {
    int ticket = 100;//共享数据
    Object obj = new Object();


    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (SaleTicket.class) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "售票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }

        }
    }
}


public class WindowTest {
    public static void main(String[] args) {
        SaleTicket saleTicket = new SaleTicket();
        Thread t1 = new Thread(saleTicket);
        Thread t2 = new Thread(saleTicket);
        Thread t3 = new Thread(saleTicket);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
