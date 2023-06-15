import jdk.jfr.internal.tool.Main;

/**
 * ClassName: CustomerView
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Tim
 * @Create 2023/6/15 22:27
 * @Version 1.0
 */
public class CustomerView {

    CustomerList customerList = new CustomerList(10);

    public void enterMainMenu() {
        boolean isFlag=true;
        while(isFlag){
            System.out.println("\n---------------管理系统-----------------------------");
            System.out.println("                  1：添加客户                  ");
            System.out.println("                  2：修改客户                  ");
            System.out.println("                  3：删除客户                  ");
            System.out.println("                  4：客户列表                  ");
            System.out.println("                  5：退出    \n                ");
            System.out.println("                   请选择1--5：                 ");


            isFlag=false;
        }
    }

    private void addNewCustomer() {

    }

    private void modifyCustomer() {

    }

    private void deleteCustomer() {

    }

    private void ListAllCustomer() {

    }

    public static void main(String[] args) {
        CustomerView customerView = new CustomerView();
    }

}
