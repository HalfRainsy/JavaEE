package overLoadExer;

import java.sql.SQLOutput;

/**
 * ClassName: overLoadExer
 * Package: overLoadExer
 * Description:
 *
 * @Author Tim
 * @Create 2023/5/25 22:01
 * @Version 1.0
 */
public class overLoadExer {
    public void moL(int number) {
        System.out.println(number * number);
    }

    public void moL(int n, int m) {
        System.out.println(n * m);
    }

    public void moL(String s) {
        System.out.println(s);
    }


    public int max(int i, int j) {
        return (i > j) ? i : j;
    }

    public double max(double d1, double d2) {
        return (d1 > d2) ? d1 : d2;
    }
    public double max(double d1,double d2,double d3){
        double tempMax=max(d1,d2);
        return max(tempMax,d3);
        /*
        第二种写法
        return (max(d1,d2)>d3)?max(d1,d2) :d3;
         */
    }
}
