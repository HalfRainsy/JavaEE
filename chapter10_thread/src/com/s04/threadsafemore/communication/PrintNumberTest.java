package com.s04.threadsafemore.communication;

/**
 * ClassName: PrintNumberTest
 * Package: com.s04.threadsafemore.communication
 * Description:
 *
 * @Author Tim
 * @Create 2023/11/1 10:59
 * @Version 1.0
 */
public class PrintNumberTest {
    public static void main(String[] args) {
        PrintNumber pu=new PrintNumber();
        Thread t1=  new Thread(pu,"线程1");
        Thread t2=  new Thread(pu,"线程2");
        t1.start();
        t2.start();
    }
}
class PrintNumber implements Runnable{
private int number=1;
    @Override
    public void run() {
        while (true){
            synchronized (this) {
                if (number<=100){
                    this.notify();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+":"+number);
                    number++;
                    try {
                        this.wait();//线程一旦执行此方法，就进入等待状态，同时会释放同步监视器的调用
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    break;
                }
            }
        }
    }
}
