package overLoadTest;

/**
 * ClassName: ArgsTest
 * Package: overLoadTest
 * Description:
 *
 * @Author Tim
 * @Create 2023/5/25 22:45
 * @Version 1.0
 */
public class ArgsTest {
    public static void main(String[] args) {
        ArgsTest as = new ArgsTest();
        as.print();
        as.print(1, 1, 1, 1, 1);
        as.print(2);
        as.print(1,2,3);
    }


    public void print(int... nums) {//可变个数的形参的方法
        System.out.println("1");
        for (int i = 0; i <nums .length; i++) {
            System.out.println(nums[i]);
        }
    }
    /*public void print(int i,int ... num){

    }*/

   /* public void print(int... muns, int i) {

    }*/

    //    public void print(int []){
//
//    }
    public void print(int i) {
        System.out.println("2");
    }

}
