package test;

/**
 * ClassName: Book
 * Package: test
 * Description:
 *
 * @Author Tim
 * @Create 2023/6/2 21:29
 * @Version 1.0
 */
public class Book {
    private String bookName;
    private String author;
    private double price;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //获取图书信息
    public String showInfo() {
        return "bookName: " + bookName + " author:" + author + "  price:" + price;
    }
}
