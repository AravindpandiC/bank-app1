package bankapp1;

import java.util.Scanner;

public class CreateUser {
    User user;
    public User createUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly provide your details");

        System.out.print("Your name: ");
        String name = sc.next();

        System.out.print("Age: ");
        int age = sc.nextInt();

        System.out.print("Mobile number: ");
        String mobileNo = sc.next();

        user = new User(name,mobileNo,age);
        System.out.println("Account created successfully");
        System.out.println("Your account number is "+user.getId());
        System.out.println();
        System.out.println();
        System.out.println();
        return user;
    }
}
