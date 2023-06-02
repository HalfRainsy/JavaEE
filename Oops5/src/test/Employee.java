package test;

/**
 * ClassName: Employee
 * Package: test
 * Description:
 *
 * @Author Tim
 * @Create 2023/6/2 21:36
 * @Version 1.0
 */
public class Employee {
    private String name;
    private char gender;
    private int age;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String showInfo() {
        return name + "\t" + gender + "\t" + age + "\t" + phoneNumber;
        //return getName() + "\t" + getGender() + "\t" + getAge() + "\t" + getPhoneNumber();
    }
}
