/**
 * ClassName: PersonTest1
 * Package: OfDown
 * Description:
 *
 * @Author Tim
 * @Create 2023/7/6 22:08
 * @Version 1.0
 */
public class PersonTest1 {
    public static void main(String[] args) {
        Person p1 = new Man();
        // p1.walk();
        //向下转型
        Man m1 = (Man) p1;
        m1.walk();
        System.out.println(p1==m1);//p1和m1指向堆空间中的同一个对象
        /*
        向下转型可能会出现：
            类型转换异常  不是这个类型的非要转 但是编译器认不出来
         */
        Person p2=new Woman();
//        Man m2=(Man)p2;
//        m2.earnMoney();
        /*
           1: 建议在向下转型之前，使用instanceof进行判断，避免出现类型转换异常
           2:格式   a instanceof A  ：判断对象a是否是类A的实例。
           3:如果 a instanceof A返回true ，则：
                 a instanceof Super A返回也是true，其中，A是SuperA的子类。
         */
        if (p2 instanceof Man){
            Man m2=(Man)p2;
            m2.earnMoney();
        }
        if (p2 instanceof  Woman){
            System.out.println("Woman");
        }
    }
}
