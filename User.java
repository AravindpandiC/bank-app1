package bankapp1;

import java.util.List;

public class User {

    private static int accountNoGenerator =1;
    private int id;
    private String name;
    private String mobileNo;
    private int age;
    private double balance;


    public User(String name, String mobileNo, int age) {
        id=accountNoGenerator;
        this.name = name;
        this.mobileNo = mobileNo;
        this.age = age;
        accountNoGenerator++;

    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", age=" + age +
                ", balance=" + balance +
                '}';
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount) throws Exception {
        if(amount>balance) throw new Exception("Insufficient balance");
        balance -= amount;
    }
}
