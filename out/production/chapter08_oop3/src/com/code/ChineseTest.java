package com.code;

/**
 * ClassName: ChineseTest
 * Package: com.code
 * Description:
 *
 * @Author Tim
 * @Create 2023/8/16 14:41
 * @Version 1.0
 */
public class ChineseTest {
    public static void main(String[] args) {
        Chinese.show();

        Chinese c1=new Chinese();
        c1.name="Tom";
        c1.age=40;
        c1.nation="china";
        Chinese c2=new Chinese();
        c2.name="Tim";
        c2.age=90;
        c2.nation="Chn";
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1.nation);
        System.out.println(c2.nation);

    }
}
class Chinese{//中国人类
    static String nation;
    //非静态变量---实例变量
    String name;
    int age;
    //静态变量 类变量


    @Override
    public String toString() {
        return "Chinese{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public  static void  show(){
        System.out.println("i am Chinese");
        System.out.println(nation);

    }
    public void eat(String Food){
        System.out.println("我喜欢吃");
    }
}
