package valueTransfer;

/**
 * ClassName: ValueTransferTest1
 * Package: valueTransfer
 * Description:
 *
 * @Author Tim
 * @Create 2023/5/28 22:06
 * @Version 1.0
 */
public class ValueTransferTest1 {
    public static void main(String[] args) {
        ValueTransferTest1 v = new ValueTransferTest1();
        //1·对于基本数据类型来说
        int m = 10;

        v.method(m);//这个赋值操作给了下面的method  只是把值给了形参 但是并没有改变本身  所以这一行代码的作用域在与方法 而不是在main方法
        System.out.println("m=" + m);//10
        //2·对于引用数据类型
        Person p = new Person();
        p.age = 10;
        v.method2(p);
        System.out.println(p.age);
    }


    public void method(int m) {
        m++;
    }

    public void method2(Person p) {
        p.age++;
    }
}

class Person {
    int age;
}