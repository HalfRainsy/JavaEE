package equals.apply;

import java.util.Objects;

/**
 * ClassName: Customer
 * Package: equals.apply
 * Description:
 *
 * @Author Tim
 * @Create 2023/7/18 22:53
 * @Version 1.0
 */
public class Customer {
    private String name;
    private int age;
    private Account account;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Customer() {
    }

    public Customer(String name, int age, Account account) {
        this.name = name;
        this.age = age;
        this.account = account;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return age == customer.age && Objects.equals(name, customer.name) && Objects.equals(account, customer.account);
    }


}
