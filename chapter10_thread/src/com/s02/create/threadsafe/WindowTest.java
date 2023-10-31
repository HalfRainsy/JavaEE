package com.s02.create.threadsafe;

/**
 * ClassName: WindowTest1
 * Package: com.s02.create.notsafe
 * Description:
 * <p>
 * synchronized (同步监视器){//同步监视器：俗称锁   哪个线程获取了锁，哪个线程就能执行需要被同步的代码。
 * 可以使用任何一个类的对象充当，但是多个线程必须同用一个同步监视器
 * //需要被同步的代码
 * }
 *
 * @Author Tim
 * @Create 2023/10/25 10:54
 * @Version 1.0
 */
public class WindowTest {

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
    static Object obj = new Object();

    @Override
    public void run() {
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (true) {

            synchronized (Windows.class) {//this代表windows的对象 -->w1,w2,w3  不能保证锁的唯一性
                //obj使用static保证线程的唯一性
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
