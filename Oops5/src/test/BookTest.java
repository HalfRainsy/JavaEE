package test;

/**
 * ClassName: BookTest
 * Package: test
 * Description:
 *
 * @Author Tim
 * @Create 2023/6/2 21:33
 * @Version 1.0
 */
public class BookTest {
    public static void main(String[] args) {
        Book b=new Book();
        b.setBookName("神探夏洛克");
        b.setAuthor("柯南·道尔");
        b.setPrice(156.0);
        System.out.println(b.showInfo());
    }
}
