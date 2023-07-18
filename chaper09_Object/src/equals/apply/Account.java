package equals.apply;

import java.util.Objects;

/**
 * ClassName: Account
 * Package: equals.apply
 * Description:
 *
 * @Author Tim
 * @Create 2023/7/18 22:51
 * @Version 1.0
 */
public class Account {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account() {
    }

    public Account(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Double.compare(account.balance, balance) == 0;
    }


}
