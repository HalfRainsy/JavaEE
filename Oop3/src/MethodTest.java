/**
 * ClassName: MethodTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Tim
 * @Create 2023/5/19 21:43
 * @Version 1.0
 */
public class MethodTest {
    public static void main(String[] args) {
        Person p1=new Person();
        System.out.println(p1.interesting("学习"));
        p1.eat();

    /*
    方法声明的格式
        --public --权限修饰符
        -- void --返回值类型
        -- xxxx---方法名
        Xxx(形参列表)---方法名
        权限修饰符  返回值类型  方法名（形参列表）[]{//方法头
        方法体



        -----权限修饰符
            Java规定了那些权限修饰符
                private  \  缺省   \   protected  \    public   ------后面的权限修饰符越往后越大
        -----返回值类型
            描述调用完此方法时，是否需要返回一个值
                返回值类型分类：
                    1：无返回值类型   使用void
                    2：有返回值类型   使用具体的返回值类型的具体数据类型   也可以引用数据类型
                    [经验之谈：]我们在声明方法是要不要提供给返回值类型？
                    根据题目/业务要求
                方法名----
                    见名知意   驼峰命名法
                形参列表---属于局部变量，且可以声明多个。
                           格式：(形参类型1 形参1，形参类型2 形参2，....)
                           分类：无形参列表 -- 不能省略一对小括号.   Math.random();
                                有形参列表 -- 根据方法调用时，需要的不确定的变量的类型和个数，确定形参的类型和个数。
                            【经验】我们在声明方法时，是否需要形参列表呢？
                            >根据方法具体实现的功能来决定，具体问题具体分析
                            >根据题目要求
                方法体：当我们调用一个方法时，真正执行了代码，体现了此方法的功能。
                    每个人理解不同，写法不同。


            Attention：先声明后使用   方法必须定义在类的内部。
                       Java的方法不调用不执行，每调用一次执行一次。
                       方法内可以调用本类的其他方法或属性。也可以自己调自己 但是容易死循环
                       方法内不能定义方法！！！
        }
     */
    }
}
class Person{
    String name;
    int age;
    char gender;
    public void eat(){
        System.out.println("人吃饭");
    }
    public void sleep(int hour){//void 代表返回值  可能没有返回值
        System.out.println("人睡觉"+hour+"小时");
    }
    public String interesting(String hobby){//有返回值  返回值为string类型
        String info="我的爱好是"+hobby;
       // System.out.println(info);
        return info;
    }
    public int getAge(){
        return age;
    }
}