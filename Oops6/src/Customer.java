/**
 * ClassName: Customer
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Tim
 * @Create 2023/6/5 22:11
 * @Version 1.0
 */
public class Customer {
    private String Firstname;
    private String Lastname;
    private Account account;

    public Customer(String f, String l) {
        Firstname = f;
        Lastname = l;
    }

    public String getFirstname() {
        return Firstname;
    }


    public String getLastname() {
        return Lastname;
    }


    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
