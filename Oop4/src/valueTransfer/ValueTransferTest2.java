package valueTransfer;

/**
 * ClassName: ValueTransferTest2
 * Package: valueTransfer
 * Description:
 *
 * @Author Tim
 * @Create 2023/5/28 22:19
 * @Version 1.0
 */
public class ValueTransferTest2 {
    public static void main(String[] args) {
        ValueTransferTest2 t=new ValueTransferTest2();
        int m = 10;
        int n = 20;
        System.out.println("m=" + m + ",n=" + n);
        //变量交换  通过创建一个临时变量去写
//        int temp=m;
//        m=n;
//        n=temp;
        //调用方法
        t.swap(m,n);
        System.out.println("m=" + m + ",n=" + n);
    }

    public void swap(int m, int n) {
        int temp = m;
        m = n;
        n = temp;
    }
}
