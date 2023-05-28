package test;

/**
 * ClassName: Exer01
 * Package: test
 * Description:
 *
 * @Author Tim
 * @Create 2023/5/22 22:32
 * @Version 1.0
 */
public class Exer01 {
    public static void main(String[] args) {  //因为含有static  由于优先级不一样  所以得先创造对象
        //创建Exce01的对象
        Exer01 ex = new Exer01();
        //  ex.method1();
        int mj = ex.method2();
        System.out.println("面积为" + mj);
        int x = ex.method3(3, 8);
        System.out.println(x);
    }

    public void method1() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public int method2() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return 10 * 8;
    }

    public int method3(int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return m * n;
    }
}
