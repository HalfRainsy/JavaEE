/**
 * ClassName: CustomerList
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Tim
 * @Create 2023/6/15 22:01
 * @Version 1.0
 */
public class CustomerList {
    private Customer[] customers;
    private int total;//记录保存客户数量的对象

    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    //添加数据到数组中
    public boolean addCustomer(Customer customer) {
        if (total < customers.length) {
            customers[total] = customer;
            total++;
            return true;
        } else {
            return false;
        }
    }

    public boolean replaceCustomer(int index, Customer cust) {
        if (index >= 0 && index < total) {
            customers[index] = cust;
            return true;
        }
        return false;
    }

    public boolean deleteCustomer(int index) {
        if (index < 0 || index >= total) {
            return false;
        }
        for (int i = index; i < total - 1; i++) {
            customers[i] = customers[i + 1];
        }
        customers[total-1]=null;
        total--;
        return true;
    }

    public Customer[] getAllCustomers() {
    Customer[] cuts=new Customer[total];
        for (int i = 0; i <total ; i++) {
            cuts[i]=customers[i];
        }
        return cuts;
    }

    public Customer getCustomer(int index) {
            if (index < 0|| index>=total){
                return null;
            }
            return customers[index];
    }

    public int getTotal() {

    }
}
