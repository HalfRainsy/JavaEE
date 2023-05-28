package overLoadTest;

/**
 * ClassName: ExerTest
 * Package: overLoadTest
 * Description:
 *
 * @Author Tim
 * @Create 2023/5/25 23:11
 * @Version 1.0
 */
public class ExerTest {
    public static void main(String[] args) {
        ExerTest et=new ExerTest();
       System.out.println( et.concent("-","hello","world"));
       //System.out.println( et.concent("-"));
    }
    public String concent(String operator , String ... s){
        String result="";
        for (int i = 0; i < s.length; i++) {
            if(i == 0){
                result+=s[i];
            }else {
                result+=(operator+s[i]);
            }
        }
        return result;
    }
}
