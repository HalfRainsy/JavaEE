package com.s01.trycatchfinally;

import org.junit.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * ClassName: ExceptionTest
 * Package: com.s01.trycatchfinally
 * Description:
 *  如果声明了多个异常，如果不存在子父类关系的情况下，谁生命在上面/下面都可以
 *  如果存在子父类的关系，则必须爸子类声明在父类结构的上面，否则报错。
 * @Author Tim
 * @Create 2023/10/23 16:51
 * @Version 1.0
 */
public class ExceptionTest {
    @Test
    public void Test1() {
        try {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            System.out.println(num);

        } catch (InputMismatchException e) {//输入异常
            System.out.println("出现了InputMismatchException的异常");
        } catch (NullPointerException nullPointerException) {//空指针异常
            System.out.println("出现了NullPointerException异常");
        } catch (RuntimeException runtimeException) {
            System.out.println("出现了RuntimeException异常");
        }
        System.out.println("异常处理结束");
    }
}
