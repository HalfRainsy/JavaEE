package com.s02.create.thread;

/**
 * ClassName: PrintNumbwerTest
 * Package: com.s02.create.thread
 * Description:
 *
 * @Author Tim
 * @Create 2023/10/25 9:36
 * @Version 1.0
 */
public class PrintNumberTest {
    public static void main(String[] args) {
        EvenNumber evenNumber=new EvenNumber();

        OddNumber oddNumber=new OddNumber();
        //evenNumber.start();//方式1
        //oddNumber.start();//方式1
        //方式2:创建Thread类的匿名子类的匿名对象
        new Thread(){
            public void run() {
                for (int i = 0; i <=100 ; i++) {
                    if(i%2==0){
                        System.out.println(i+"----------->");
                    }
                }
            }
        }.start();
        new Thread(){
            public void run() {
                for (int i = 0; i <=100 ; i++) {
                    if(i%2!=0){
                        System.out.println(i+"-----------<");
                    }
                }
            }
        }.start();
    }

}
    class EvenNumber extends Thread{
        @Override
        public void run() {
//            for (int i = 0; i <=100 ; i++) {
//                if(i%2==0){
//                    System.out.println(i+"----------->");
//                }
//            }

        }
    }
    class OddNumber extends Thread{
        @Override
        public void run() {
//            for (int i = 0; i <=100 ; i++) {
//                if(i%2!=0){
//                    System.out.println(i);
//                }
//            }
        }
    }

