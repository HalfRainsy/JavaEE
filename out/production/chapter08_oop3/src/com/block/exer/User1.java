package com.block.exer;

/**
 * ClassName: User
 * Package: com.block.exer
 * Description:
 *
 * @Author Tim
 * @Create 2023/10/15 15:21
 * @Version 1.0
 */
public class User1 {
    private String UserName;
    private String password;
    private long registrationTime;

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getRegistrationTime() {
        return registrationTime;
    }
    {
        System.out.println("新用户注册");
        registrationTime=System.currentTimeMillis();
    }
    public User1(){
        UserName=System.currentTimeMillis()+"";
        password="111111";
    }
    public User1(String UserName, String password){
        this.UserName=UserName;
        this.password=password;
    }
    public String getInfo(){
        return "用户名"+UserName+",密码"+password+"";
    }
}
