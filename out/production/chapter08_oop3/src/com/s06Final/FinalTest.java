package com.s06Final;

/**
 * ClassName: FinalTest
 * Package: com.s06Final
 * Description:
 *
 * @Author Tim
 * @Create 2023/10/16 16:50
 * @Version 1.0
 */
public class FinalTest {
    public static void main(String[] args) {
        E e=new E();
        System.out.println(e.MIN_SCORE);
        //e.MIN_SCORE=1;
    }
}
class E{
    //成员变量
    final   int MIN_SCORE=0;
    final int MAX_SCORE;
    {
        MAX_SCORE=1;
    }

}

final class A {

}

class B {

}
class C{
    public final void method(){

    }
}
class D extends C{
//    public void method(){
//
//    }
}
