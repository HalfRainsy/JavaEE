package com.s02.create.runnable;

/**
 * ClassName: EvenNumberTest
 * Package: com.s02.create.runnable
 * Description:
 * ① 创建一个实现Runnable接口的类
 * ② 实现接口中的run() -->将此线程要执行的操作，声明在此方法体中
 * ③ 创建当前实现类的对象
 * ④ 将此对象作为参数传递到Thread类的构造器中，创建Thread类的实例
 * ⑤ Thread类的实例调用start():1.启动线程 2.调用当前线程的run()
 *
 * @Author Tim
 * @Create 2023/10/25 9:47
 * @Version 1.0
 */
public class EvenNumberTest {
    public static void main(String[] args) {
        EvenNumberPrint p = new EvenNumberPrint();
        Thread t = new Thread(p);
        t.start();
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + i);
            }
            Thread t2 = new Thread(p);
            t2.start();
        }
    }
}

class EvenNumberPrint implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + i);
            }
        }
    }
}
