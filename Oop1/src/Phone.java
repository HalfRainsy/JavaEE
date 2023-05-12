/**
 * ClassName: Phone
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Tim
 * @Create 2023/5/12 12:33
 * @Version 1.0
 */
public class Phone {

    //属性 ----变量
    double  price;
    String name;

    //方法 ---具备的功能
    //功能1--------打电话
    public void call(){
        System.out.println("可以打电话");
    }
    public void sendMessage(String message){
        System.out.println("发送信息："+message);
    }
    public void playGame(){
        System.out.println("可以玩游戏");
    }
}
