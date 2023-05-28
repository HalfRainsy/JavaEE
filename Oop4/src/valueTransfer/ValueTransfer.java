package valueTransfer;

/**
 * ClassName: ValueTransfer
 * Package: valueTransfer
 * Description:
 *
 * @Author Tim
 * @Create 2023/5/28 21:43
 * @Version 1.0
 */
public class ValueTransfer {
    public static void main(String[] args) {
        //1.基本数据类型的局部变量
        int m = 10;
        int n = m;//变量赋值   传递的是数据值
        System.out.println("m=" + m + ",n=" + n);
        m++;
        System.out.println(m);
        //2.引用数据类型的局部变量   数组  对象
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = arr1;   //对于引用数据类型来讲，存的是地址值，传的也是地址值。
        arr2[0] = 10;
        System.out.println("arr1="+arr1[0]);
        //2.1:对象类型
        Order o = new Order();

        o.orderId = 1001;
        Order o2 = o;
        o2.orderId = 1002;

        System.out.println(o.orderId);

    }
}
