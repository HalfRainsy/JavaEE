package com.singleton;

/**
 * ClassName: GirlFriend
 * Package: com.singleton
 * Description:
 *
 * @Author Tim
 * @Create 2023/10/1 9:01
 * @Version 1.0
 */
public class GirlFriendTest {
    public static void main(String[] args) {

    }
}
//懒汉式
class GirlFriend {
    //1.类的构造器私有化
    private  GirlFriend(){

    }
    //2.声明当前类的实例
    private static  GirlFriend instance=null;
    //3.通过get方法获取当前类的实例，如果未创建方法，则在类的内部进行创建
    //4.此属性也声明为static。
    public static GirlFriend getInstance(){
        if(instance==null){
            instance=new GirlFriend();

        }
        return instance;
    }
}
