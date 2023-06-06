import java.util.Date;

/**
 * ClassName: JavaBeanTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Tim
 * @Create 2023/6/6 21:52
 * @Version 1.0
 */
public class JavaBeanTest {
    /*
    类是公共的
    有一个无参的构造方法
    有属性，且有get set方法
     */
    public JavaBeanTest() {

    }

    private int id;
    private String name;
    private String email;
    private Date birth;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
