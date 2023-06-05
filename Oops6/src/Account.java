/**
 * ClassName: Account
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Tim
 * @Create 2023/6/5 21:59
 * @Version 1.0
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Account(int a, double b, double c) {
        id = a;
        balance = b;
        annualInterestRate = c;

    }

    public void withdraw(double amount) {//取钱
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("取款成功" + amount);
        } else {
            System.out.println("余额不足，取款失败");
        }
    }

    public void deposit(double amount) {//存钱
        if (amount > 0) {
            balance = +amount;
            System.out.println("存款成功" + amount);
        }
    }
}
