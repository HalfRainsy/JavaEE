package com.s02.create.notsafe;

/**
 * ClassName: WindowTest1
 * Package: com.s02.create.notsafe
 * Description:
 *
 *               synchronized (同步监视器){//同步监视器：俗称锁   哪个线程获取了锁，哪个线程就能执行需要被同步的代码。
 *                                                  可以使用任何一个类的对象充当，但是多个线程必须同用一个同步监视器
 *             //需要被同步的代码
 *               }
 *
 *
 *
 *
 * @Author Tim
 * @Create 2023/10/25 10:54
 * @Version 1.0
 */
public class WindowTest1 {

    public static void main(String[] args) {
        Windows w1 = new Windows();
        Windows w2 = new Windows();
        Windows w3 = new Windows();
        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");
        w1.start();
        w2.start();
        w3.start();



    }
}

class Windows extends Thread {
    static int ticket = 100;

    @Override
    public void run() {
        while (true) {

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
