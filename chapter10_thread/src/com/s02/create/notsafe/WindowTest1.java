package com.s02.create.notsafe;

/**
 * ClassName: WindowTest1
 * Package: com.s02.create.notsafe
 * Description:
 *
 * @Author Tim
 * @Create 2023/10/25 10:54
 * @Version 1.0
 */
public class WindowTest1 {
    public static void main(String[] args) {
        Windows w1=new Windows();
        Windows w2=new Windows();
        Windows w3=new Windows();
        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");
        w1.start();
        w2.start();
        w3.start();
    }
}
class Windows extends Thread{
    int ticket=100;
    @Override
    public void run() {

    }
}
