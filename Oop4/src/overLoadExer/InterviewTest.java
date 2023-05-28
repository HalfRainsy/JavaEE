package overLoadExer;

/**
 * ClassName: InterviewTest
 * Package: overLoadExer
 * Description:
 *
 * @Author Tim
 * @Create 2023/5/25 22:37
 * @Version 1.0
 */
public class InterviewTest {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        System.out.println(arr);//输出地址值

        char[] arr1 = new char[]{'a', 'b', 'c'};
        System.out.println(arr1);//输出   abc

        boolean[] arr2 = new boolean[]{false, false, true};
        System.out.println(arr2);//输出地址值
    }
}
