package com.s02.create.thread;

/**
 * ClassName: EvenNumberTest
 * Package: com.s02.create.thread
 * Description:
 *
 * @Author Tim
 * @Create 2023/10/25 9:23
 * @Version 1.0
 */
class PrintNumber extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}

public class EvenNumberTest {

    public static void main(String[] args) {
        PrintNumber p1 = new PrintNumber();
        p1.start();
        //main方法所在线程执行的操作
        for (int i = 0; i <= 300; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }


}

