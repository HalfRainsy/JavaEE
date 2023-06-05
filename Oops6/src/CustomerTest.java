/**
 * ClassName: CustomerTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Tim
 * @Create 2023/6/5 22:15
 * @Version 1.0
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer cm = new Customer("Jane", "Smith");
//        Account an = new Account(1000, 2000, 0.0123);
//        cm.setAccount(an);
        cm.setAccount(new Account(1000, 2000, 0.0123));//匿名对象

        /*
        关于匿名对象
        new Account(1000, 2000, 0.0123).withdraw(1000);取钱操作
        匿名对象往往只能被调用一次
        匿名对象往往作为
         */
        //针对于客户的账户进行取钱，存钱的操作
        cm.getAccount().deposit(100);
        cm.getAccount().deposit(960);
        cm.getAccount().withdraw(2000);

        System.out.println("客户【" + cm.getLastname() + "】," + cm.getFirstname() +
                ",[有一个账户：" + cm.getAccount().getId() + "年利率为：" + cm.getAccount().
                getAnnualInterestRate() * 100 + "%,余额为：" + cm.getAccount().getBalance());
    }
}
