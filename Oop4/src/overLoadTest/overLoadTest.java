package overLoadTest;

/**
 * ClassName: overLoadTest
 * Package: overLoadTest
 * Description:
 *
 * @Author Tim
 * @Create 2023/5/25 21:43
 * @Version 1.0
 */
public class overLoadTest {
    public static void main(String[] args) {
        overLoadTest ol = new overLoadTest();
        ol.add(1, 2, 3);
        ol.add((double) 10, 20);//优先选择----也可以自己手动选择
        ol.add(10, 20.0);//优先选择
    }


    public void add(int i, int j) {
        System.out.println("111111");
    }

    public void add(int i, int j, int k) {

    }

    public void add(double d1, double d2) {
        System.out.println("3333");
    }

    public void add(String i, String j) {

    }

    public void add(int i, String j) {

    }

    public void add(String i, int j) {

    }

//    public int add(int m, int n) {//返回值类型不同也不能不能重载
//        return m - n;
//    }

}
