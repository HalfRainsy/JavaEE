package valueTransfer;

/**
 * ClassName: ValueTransferTest3
 * Package: valueTransfer
 * Description:
 *
 * @Author Tim
 * @Create 2023/5/28 22:37
 * @Version 1.0
 */
public class ValueTransferTest3 {


    public static void main(String[] args) {
        ValueTransferTest3 t3 = new ValueTransferTest3();
        Date d = new Date();
        d.n = 10;
        d.m = 20;
        int temp;
//        temp = d.n;
//        d.n = d.m;
//        d.m = temp;
        t3.swap(d);
        System.out.println("n:" + d.n + "m:" + d.m);
    }

    public void swap(Date d) {
        int temp;
        temp = d.n;
        d.n = d.m;
        d.m = temp;
    }


}

class Date {
    int m;
    int n;
}
