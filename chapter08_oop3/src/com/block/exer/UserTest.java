package com.block.exer;

/**
 * ClassName: UserTest
 * Package: com.block.exer
 * Description:
 *
 * @Author Tim
 * @Create 2023/10/15 15:29
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        User user=new User();
        System.out.println(user.getInfo());
        User user1=new User("tom","111111");
        System.out.println(user1.getInfo());
        System.out.println("-------------------------");
        User1 u1=new User1();
        System.out.println(u1.getInfo());
    }
}
