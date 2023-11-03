package com.s01.string.exer3;


import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName: StringTest
 * Package: com.s01.string.exer3
 * Description:
 *
 * @Author Tim
 * @Create 2023/11/2 15:50
 * @Version 1.0
 */
public class StringTest {
    @Test
    public void String(){
    String s= "1111";

    }
    @Test
    public void S1(){
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);

        System.out.println(sb.length());//

        System.out.println(sb);//

        StringBuffer sb1 = new StringBuffer(str);
        System.out.println(sb1);//
    }
    @Test
    public void test1(){
        Date d = new Date();

        SimpleDateFormat sf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 SSS毫秒  E Z");
        //把Date日期转成字符串，按照指定的格式转
        String str = sf.format(d);
        System.out.println(str);
    }
}
